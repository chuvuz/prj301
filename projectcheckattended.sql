USE [checkattendedproject]
GO

/****** Object:  Table [dbo].[Account]    Script Date: 6/3/2022 1:17:57 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SELECT TOP (1000) [GroupID]
      ,[Groupname]
      ,[CourseID]
      ,[StudentID]
      ,[LectureID]
  FROM [checkattendedproject].[dbo].[Group]

SELECT TOP (1000) [StudentId]
      ,[Studentname]
      ,[address]
  FROM [checkattendedproject].[dbo].[Student]
  GO
  
  SELECT TOP (1000) [LecutreId]
      ,[Lecturename]
      ,[GroupId]
  FROM [checkattendedproject].[dbo].[Lecture]
  GO
  
  SELECT TOP (1000) [CourseID]
      ,[Coursename]
  FROM [checkattendedproject].[dbo].[Course]
  GO
  
  SELECT TOP (1000) [LecutreId]
      ,[Lecturename]
      ,[GroupId]
  FROM [checkattendedproject].[dbo].[Lecture]
  GO
  
  SELECT TOP (1000) [SlotIndex]
      ,[SessionID]
  FROM [checkattendedproject].[dbo].[slottt]
  GO
  
  SELECT TOP (1000) [SessionID]
      ,[SessionName]
  FROM [checkattendedproject].[dbo].[session]
  GO
  SELECT TOP (1000) [Attendedname]
  FROM [checkattendedproject].[dbo].[Attended]
  GO
  SELECT TOP (1000) [RoomID]
      ,[SessionID]
      ,[SessionName]
  FROM [checkattendedproject].[dbo].[Room]
  GO
