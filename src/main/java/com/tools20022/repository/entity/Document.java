/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CopyDuplicateCode;
import com.tools20022.repository.codeset.DataSetTypeCode;
import com.tools20022.repository.codeset.DocumentTypeCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Document" src="doc-files/Document.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Document#IssueDate
 * Document.IssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#CopyDuplicate
 * Document.CopyDuplicate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PlaceOfStorage
 * Document.PlaceOfStorage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PaymentObligation
 * Document.PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Type Document.Type}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Amount
 * Document.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Agreement
 * Document.Agreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PlaceOfIssue
 * Document.PlaceOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#DocumentVersion
 * Document.DocumentVersion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Status
 * Document.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Reconciliation
 * Document.Reconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#LetterOfCredit
 * Document.LetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PartyRole
 * Document.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#DataSetType
 * Document.DataSetType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Transport
 * Document.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#SignedIndicator
 * Document.SignedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#RemittedAmount
 * Document.RemittedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Guarantee
 * Document.Guarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Language
 * Document.Language}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Purpose
 * Document.Purpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
 * Document.DocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Evidence
 * Document.Evidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#CommercialTrade
 * Document.CommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Presentation
 * Document.Presentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#RelatedContract
 * Document.RelatedContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedDocument
 * GenericIdentification.IdentifiedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#StoredDocument
 * ContactPoint.StoredDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#IssuedDocument
 * Location.IssuedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Document
 * Agreement.Document}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DocumentPartyRole#Document
 * DocumentPartyRole.Document}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#AssociatedDocument
 * PaymentObligation.AssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#PresentedDocument
 * Presentation.PresentedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#Documents
 * CommercialTrade.Documents}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#TransportDocuments
 * Transport.TransportDocuments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit#Document
 * LetterOfCredit.Document}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#Document
 * Guarantee.Document}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#Document
 * Reconciliation.Document}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Evidence#RelatedDocument
 * Evidence.RelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Attachment
 * RegisteredContract.Attachment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#ReferredDocumentInformation
 * StructuredRemittanceInformation6.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#AdditionalRemittanceInformation
 * StructuredRemittanceInformation6.AdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation1#Unstructured
 * RemittanceInformation1.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation1#Structured
 * RemittanceInformation1.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType2#CodeOrProprietary
 * ReferredDocumentType2.CodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType2#CodeOrProprietary
 * CreditorReferenceType2.CodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#ReferredDocumentInformation
 * StructuredRemittanceInformation7.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#AdditionalRemittanceInformation
 * StructuredRemittanceInformation7.AdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation5#Unstructured
 * RemittanceInformation5.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation5#Structured
 * RemittanceInformation5.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#ReferredDocumentInformation
 * StructuredRemittanceInformation9.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#AdditionalRemittanceInformation
 * StructuredRemittanceInformation9.AdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#Unstructured
 * RemittanceInformation7.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#Structured
 * RemittanceInformation7.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation2#Unstructured
 * RemittanceInformation2.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#ReferredDocumentInformation
 * StructuredRemittanceInformation8.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#AdditionalRemittanceInformation
 * StructuredRemittanceInformation8.AdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation6#Unstructured
 * RemittanceInformation6.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation6#Structured
 * RemittanceInformation6.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice#Unstructured
 * RemittanceInformation3Choice.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice#Structured
 * RemittanceInformation3Choice.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#RemittanceInformation
 * RequestedModification.RemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification2#RemittanceInformation
 * RequestedModification2.RemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#AdditionalReferenceDocument
 * TradeAgreement6.AdditionalReferenceDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#RemittanceInformation
 * RequestedModification3.RemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation3#Unstructured
 * RemittanceInformation3.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation3#Structured
 * RemittanceInformation3.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation4#Unstructured
 * RemittanceInformation4.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation4#Structured
 * RemittanceInformation4.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineType1#CodeOrProprietary
 * DocumentLineType1.CodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#ReferredDocumentInformation
 * StructuredRemittanceInformation10.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#AdditionalRemittanceInformation
 * StructuredRemittanceInformation10.AdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#Structured
 * RemittanceInformation8.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#LineDetails
 * ReferredDocumentInformation4.LineDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#Description
 * DocumentLineInformation1.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GarnishmentType1#CodeOrProprietary
 * GarnishmentType1.CodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#Unstructured
 * RemittanceInformation10.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#Structured
 * RemittanceInformation10.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#RemittanceInformation
 * RequestedModification4.RemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#ReferredDocumentInformation
 * StructuredRemittanceInformation12.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#AdditionalRemittanceInformation
 * StructuredRemittanceInformation12.AdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType4#CodeOrProprietary
 * ReferredDocumentType4.CodeOrProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#RelatedLetter
 * BusinessLetter1.RelatedLetter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#RelatedMessage
 * BusinessLetter1.RelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#AssociatedDocument
 * BusinessLetter1.AssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#Header
 * EncapsulatedBusinessMessage1.Header}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#Message
 * EncapsulatedBusinessMessage1.Message}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#RelatedDocument
 * FinancingAgreementList1.RelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#RelatedDocument
 * FinancingItemList1.RelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#RelatedDocument
 * ReconciliationList1.RelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#AssociatedDocument
 * ReconciliationList1.AssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#RelatedDocument
 * EventDescription1.RelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#RelatedLetter
 * EventDescription1.RelatedLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#RelatedMessage
 * EventDescription1.RelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#AssociatedDocument
 * EventDescription1.AssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#AssociatedDocument
 * GuaranteeDetails1.AssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#RemittanceInformation
 * RequestedModification5.RemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#Structured
 * RemittanceInformation12.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#Unstructured
 * RemittanceInformation11.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#Structured
 * RemittanceInformation11.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#ReferredDocumentInformation
 * StructuredRemittanceInformation13.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#AdditionalRemittanceInformation
 * StructuredRemittanceInformation13.AdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#LineDetails
 * ReferredDocumentInformation7.LineDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#AdditionalReferenceDocument
 * TradeAgreement13.AdditionalReferenceDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#RemittanceInformation
 * RequestedModification6.RemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#Structured
 * RemittanceInformation13.Structured}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate
 * PrivateCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InsuranceCertificate
 * InsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecurityCertificate
 * SecurityCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveryNote DeliveryNote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialDocument
 * FinancialDocument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification11
 * DocumentIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification16
 * DocumentIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification9
 * DocumentIdentification9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice
 * DocumentIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification14
 * DocumentIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification17
 * DocumentIdentification17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification2Choice
 * DocumentIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification21
 * DocumentIdentification21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification12
 * DocumentIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification15
 * DocumentIdentification15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification13
 * DocumentIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification18
 * DocumentIdentification18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification19
 * DocumentIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification20
 * DocumentIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType1
 * ReferredDocumentType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1
 * ReferredDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
 * ReferredDocumentAmount1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceType1
 * CreditorReferenceType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
 * StructuredRemittanceInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation1
 * RemittanceInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice
 * ReferredDocumentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType2
 * ReferredDocumentType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3
 * ReferredDocumentInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount1
 * RemittanceAmount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice
 * CreditorReferenceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceType2
 * CreditorReferenceType2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7
 * StructuredRemittanceInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation5
 * RemittanceInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount2
 * RemittanceAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
 * StructuredRemittanceInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation7
 * RemittanceInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation2
 * RemittanceInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8
 * StructuredRemittanceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation6
 * RemittanceInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
 * StructuredRemittanceInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice
 * RemittanceInformation3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification8
 * DocumentIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber1
 * DocumentNumber1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber2
 * DocumentNumber2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber6
 * DocumentNumber6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber5
 * DocumentNumber5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreementClauses1
 * AgreementClauses1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1
 * DocumentGeneralInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2
 * ReferredDocumentInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification22
 * DocumentIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
 * DocumentGeneralInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification7
 * DocumentIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification23
 * DocumentIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification3
 * DocumentIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification5
 * DocumentIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification1
 * DocumentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission1
 * RequiredSubmission1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification4
 * DocumentIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification6
 * DocumentIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification2
 * DocumentIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification10
 * DocumentIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber3
 * DocumentNumber3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber4
 * DocumentNumber4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber7
 * DocumentNumber7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification24
 * DocumentIdentification24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber9
 * DocumentNumber9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification26
 * DocumentIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber11
 * DocumentNumber11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber8
 * DocumentNumber8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation3
 * RemittanceInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation4
 * RemittanceInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification27
 * DocumentIdentification27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1
 * DocumentLineType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
 * StructuredRemittanceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineIdentification1
 * DocumentLineIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation8
 * RemittanceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4
 * ReferredDocumentInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineInformation1
 * DocumentLineInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DocumentLineType1Choice
 * DocumentLineType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.GarnishmentType1Choice
 * GarnishmentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GarnishmentType1
 * GarnishmentType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation10
 * RemittanceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice
 * ReferredDocumentType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6
 * ReferredDocumentInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12
 * StructuredRemittanceInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType4
 * ReferredDocumentType4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1
 * BusinessLetter1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
 * EncapsulatedBusinessMessage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingAgreementList1
 * FinancingAgreementList1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1
 * ReconciliationList1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1
 * EventDescription1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
 * QualifiedDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
 * SupportingDocumentRequestOrLetter1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification29
 * DocumentIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
 * SupportingDocumentEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
 * DocumentGeneralInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateReference1
 * CertificateReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification28
 * DocumentIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification30
 * DocumentIdentification30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber12
 * DocumentNumber12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation12
 * RemittanceInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation11
 * RemittanceInformation11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
 * StructuredRemittanceInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7
 * ReferredDocumentInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber13
 * DocumentNumber13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification31
 * DocumentIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification32
 * DocumentIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification33
 * DocumentIdentification33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice
 * DocumentIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification38
 * DocumentIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification37
 * DocumentIdentification37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification34
 * DocumentIdentification34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification4Choice
 * DocumentIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber14
 * DocumentNumber14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification48
 * DocumentIdentification48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber15
 * DocumentNumber15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification49
 * DocumentIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2 InvoiceHeader2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation13
 * RemittanceInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredMandateDocument1
 * ReferredMandateDocument1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General information that unambiguously identifies a document, such as identification number and issue date time."
 * </li>
 * </ul>
 */
public class Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Issue date of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#CreationDateTime
	 * DocumentIdentification11.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#CreationDateTime
	 * DocumentIdentification16.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#CreationDateTime
	 * DocumentIdentification12.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#CreationDateTime
	 * DocumentIdentification18.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#ReferredDocumentRelatedDate
	 * StructuredRemittanceInformation6.ReferredDocumentRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#RelatedDate
	 * ReferredDocumentInformation3.RelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#DateOfIssuance
	 * Undertaking4.DateOfIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#DateOfIssuance
	 * Undertaking3.DateOfIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#ReferredDocumentRelatedDate
	 * StructuredRemittanceInformation2.ReferredDocumentRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#CreationDateTime
	 * DocumentIdentification8.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#IssueDate
	 * DocumentGeneralInformation1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#RelatedDate
	 * ReferredDocumentInformation2.RelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#IssueDate
	 * OriginalInvoiceInformation1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#IssueDateTime
	 * InvoiceHeader1.IssueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#DateOfIssue
	 * DocumentIdentification22.DateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#IssueDate
	 * DocumentGeneralInformation2.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7#DateOfIssue
	 * DocumentIdentification7.DateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23#DateOfIssue
	 * DocumentIdentification23.DateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceIdentification1#IssueDate
	 * InvoiceIdentification1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#IssueDate
	 * InsuranceDataSet1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#IssueDate
	 * CertificateDataSet1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#IssueDate
	 * OtherCertificateDataSet1.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Report4#CreationDateTime
	 * Report4.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#CreationDateTime
	 * BillingStatement1.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#CreationDateTime
	 * DocumentIdentification27.CreationDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1#InvoiceDate
	 * BillingReport1.InvoiceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#InvoiceDate
	 * BillingCancellationReport1.InvoiceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#RelatedDate
	 * DocumentLineIdentification1.RelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#RelatedDate
	 * ReferredDocumentInformation4.RelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#IssueDate
	 * CertificateDataSet2.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#RelatedDate
	 * ReferredDocumentInformation6.RelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#IssueDate
	 * OtherCertificateDataSet2.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#Date
	 * BusinessLetter1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#Date
	 * FinancingAgreementList1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#IssueDate
	 * FinancingItemList1.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#Date
	 * ReconciliationList1.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#Date
	 * EventDescription1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#Date
	 * QualifiedDocumentInformation1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#IssueDate
	 * FinancialItemParameters1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Date
	 * SupportingDocumentRequestOrLetter1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#DueDate
	 * SupportingDocumentRequestOrLetter1.DueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#DateOfIssue
	 * DocumentIdentification29.DateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#IssueDate
	 * DocumentGeneralInformation3.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#DateOfIssue
	 * DocumentIdentification28.DateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#RelatedDate
	 * ReferredDocumentInformation7.RelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#CreationDateTime
	 * BillingStatement2.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#IssueDateTime
	 * InvoiceHeader2.IssueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#RelatedDate
	 * ReferredMandateDocument1.RelatedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification11.CreationDateTime, com.tools20022.repository.msg.DocumentIdentification16.CreationDateTime,
					com.tools20022.repository.msg.DocumentIdentification12.CreationDateTime, com.tools20022.repository.msg.DocumentIdentification18.CreationDateTime,
					com.tools20022.repository.msg.StructuredRemittanceInformation6.ReferredDocumentRelatedDate, com.tools20022.repository.msg.ReferredDocumentInformation3.RelatedDate,
					com.tools20022.repository.msg.Undertaking4.DateOfIssuance, com.tools20022.repository.msg.Undertaking3.DateOfIssuance, com.tools20022.repository.msg.StructuredRemittanceInformation2.ReferredDocumentRelatedDate,
					com.tools20022.repository.msg.DocumentIdentification8.CreationDateTime, com.tools20022.repository.msg.DocumentGeneralInformation1.IssueDate, com.tools20022.repository.msg.ReferredDocumentInformation2.RelatedDate,
					com.tools20022.repository.msg.OriginalInvoiceInformation1.IssueDate, com.tools20022.repository.msg.InvoiceHeader1.IssueDateTime, com.tools20022.repository.msg.DocumentIdentification22.DateOfIssue,
					com.tools20022.repository.msg.DocumentGeneralInformation2.IssueDate, com.tools20022.repository.msg.DocumentIdentification7.DateOfIssue, com.tools20022.repository.msg.DocumentIdentification23.DateOfIssue,
					com.tools20022.repository.msg.InvoiceIdentification1.IssueDate, com.tools20022.repository.msg.InsuranceDataSet1.IssueDate, com.tools20022.repository.msg.CertificateDataSet1.IssueDate,
					com.tools20022.repository.msg.OtherCertificateDataSet1.IssueDate, com.tools20022.repository.msg.Report4.CreationDateTime, com.tools20022.repository.msg.BillingStatement1.CreationDateTime,
					com.tools20022.repository.msg.DocumentIdentification27.CreationDateTime, com.tools20022.repository.msg.BillingReport1.InvoiceDate, com.tools20022.repository.msg.BillingCancellationReport1.InvoiceDate,
					com.tools20022.repository.msg.DocumentLineIdentification1.RelatedDate, com.tools20022.repository.msg.ReferredDocumentInformation4.RelatedDate, com.tools20022.repository.msg.CertificateDataSet2.IssueDate,
					com.tools20022.repository.msg.ReferredDocumentInformation6.RelatedDate, com.tools20022.repository.msg.OtherCertificateDataSet2.IssueDate, com.tools20022.repository.msg.BusinessLetter1.Date,
					com.tools20022.repository.msg.FinancingAgreementList1.Date, com.tools20022.repository.msg.FinancingItemList1.IssueDate, com.tools20022.repository.msg.ReconciliationList1.Date,
					com.tools20022.repository.msg.EventDescription1.Date, com.tools20022.repository.msg.QualifiedDocumentInformation1.Date, com.tools20022.repository.msg.FinancialItemParameters1.IssueDate,
					com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Date, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.DueDate, com.tools20022.repository.msg.DocumentIdentification29.DateOfIssue,
					com.tools20022.repository.msg.DocumentGeneralInformation3.IssueDate, com.tools20022.repository.msg.DocumentIdentification28.DateOfIssue, com.tools20022.repository.msg.ReferredDocumentInformation7.RelatedDate,
					com.tools20022.repository.msg.BillingStatement2.CreationDateTime, com.tools20022.repository.msg.InvoiceHeader2.IssueDateTime, com.tools20022.repository.msg.ReferredMandateDocument1.RelatedDate);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies if this document is a copy, a duplicate, or a duplicate of a
	 * copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#CopyDuplicate
	 * DocumentIdentification11.CopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#CopyDuplicate
	 * DocumentIdentification16.CopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#CopyDuplicate
	 * DocumentIdentification12.CopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#CopyDuplicate
	 * DocumentIdentification18.CopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#CopyDuplicate
	 * DocumentIdentification27.CopyDuplicate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CopyDuplicate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification11.CopyDuplicate, com.tools20022.repository.msg.DocumentIdentification16.CopyDuplicate,
					com.tools20022.repository.msg.DocumentIdentification12.CopyDuplicate, com.tools20022.repository.msg.DocumentIdentification18.CopyDuplicate, com.tools20022.repository.msg.DocumentIdentification27.CopyDuplicate);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CopyDuplicateCode.mmObject();
		}
	};
	/**
	 * Specifies where the document is stored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#StoredDocument
	 * ContactPoint.StoredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#RelatedRemittanceInformation
	 * EntryTransaction1.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#RelatedRemittanceInformation
	 * EntryTransaction2.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#RelatedRemittanceInformation
	 * EntryTransaction3.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#RelatedRemittanceInformation
	 * EntryTransaction4.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation1.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation9.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation11.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation13.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation2.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation10.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation12.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation14.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#RelatedRemittanceInformation
	 * NotificationItem3.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#RelatedRemittanceInformation
	 * OriginalItemReference1.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#RelatedRemittanceInformation
	 * NotificationItem4.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#RelatedRemittanceInformation
	 * OriginalItemReference2.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation6.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation8.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation17.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#RelatedRemittanceInformation
	 * OriginalItemReference3.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation18.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#RelatedRemittanceInformation
	 * NotificationItem5.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#RelatedRemittanceInformation
	 * EntryTransaction7.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation20.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#RelatedRemittanceInformation
	 * OriginalItemReference4.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation19.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedRemittanceInformation
	 * EntryTransaction8.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#RelatedRemittanceInformation
	 * NotificationItem6.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation21.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#RelatedRemittanceInformation
	 * DirectDebitTransactionInformation22.RelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfStorage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the document is stored."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfStorage = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction1.RelatedRemittanceInformation, com.tools20022.repository.msg.EntryTransaction2.RelatedRemittanceInformation,
					com.tools20022.repository.msg.EntryTransaction3.RelatedRemittanceInformation, com.tools20022.repository.msg.EntryTransaction4.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation1.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation9.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation11.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation13.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation10.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation14.RelatedRemittanceInformation,
					com.tools20022.repository.msg.NotificationItem3.RelatedRemittanceInformation, com.tools20022.repository.msg.OriginalItemReference1.RelatedRemittanceInformation,
					com.tools20022.repository.msg.NotificationItem4.RelatedRemittanceInformation, com.tools20022.repository.msg.OriginalItemReference2.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation6.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation8.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.RelatedRemittanceInformation, com.tools20022.repository.msg.OriginalItemReference3.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation18.RelatedRemittanceInformation, com.tools20022.repository.msg.NotificationItem5.RelatedRemittanceInformation,
					com.tools20022.repository.msg.EntryTransaction7.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation20.RelatedRemittanceInformation,
					com.tools20022.repository.msg.OriginalItemReference4.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation19.RelatedRemittanceInformation,
					com.tools20022.repository.msg.EntryTransaction8.RelatedRemittanceInformation, com.tools20022.repository.msg.NotificationItem6.RelatedRemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.RelatedRemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation22.RelatedRemittanceInformation);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfStorage";
			definition = "Specifies where the document is stored.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.StoredDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document which is referred to in a payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#AssociatedDocument
	 * PaymentObligation.AssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#PaymentTerms
	 * ReconciliationList1.PaymentTerms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which is referred to in a payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReconciliationList1.PaymentTerms);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Document which is referred to in a payment obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.AssociatedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of the document, for example commercial invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType1#Code
	 * ReferredDocumentType1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType1#Proprietary
	 * ReferredDocumentType1.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1#ReferredDocumentType
	 * ReferredDocumentInformation1.ReferredDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType1#Code
	 * CreditorReferenceType1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType1#Proprietary
	 * CreditorReferenceType1.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice#Code
	 * ReferredDocumentType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice#Proprietary
	 * ReferredDocumentType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#Type
	 * ReferredDocumentInformation3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#Code
	 * CreditorReferenceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#Proprietary
	 * CreditorReferenceType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#ReferredDocumentType
	 * StructuredRemittanceInformation2.ReferredDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#DocumentType
	 * DocumentGeneralInformation1.DocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#Type
	 * ReferredDocumentInformation2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#TypeCode
	 * InvoiceHeader1.TypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#DocumentType
	 * DocumentGeneralInformation2.DocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#Type
	 * DocumentIdentification10.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#Type
	 * DocumentLineIdentification1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#Type
	 * ReferredDocumentInformation4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#Code
	 * DocumentLineType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#Proprietary
	 * DocumentLineType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#Code
	 * GarnishmentType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#Proprietary
	 * GarnishmentType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#Code
	 * ReferredDocumentType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#Proprietary
	 * ReferredDocumentType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#Type
	 * ReferredDocumentInformation6.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#DocumentType
	 * QualifiedDocumentInformation1.DocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Type
	 * SupportingDocumentRequestOrLetter1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#DocumentType
	 * SupportingDocumentEntry1.DocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#DocumentType
	 * DocumentGeneralInformation3.DocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#Type
	 * ReferredDocumentInformation7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#TypeCode
	 * InvoiceHeader2.TypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#Type
	 * ReferredMandateDocument1.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredDocumentType1.Code, com.tools20022.repository.msg.ReferredDocumentType1.Proprietary,
					com.tools20022.repository.msg.ReferredDocumentInformation1.ReferredDocumentType, com.tools20022.repository.msg.CreditorReferenceType1.Code, com.tools20022.repository.msg.CreditorReferenceType1.Proprietary,
					com.tools20022.repository.choice.ReferredDocumentType1Choice.Code, com.tools20022.repository.choice.ReferredDocumentType1Choice.Proprietary, com.tools20022.repository.msg.ReferredDocumentInformation3.Type,
					com.tools20022.repository.choice.CreditorReferenceType1Choice.Code, com.tools20022.repository.choice.CreditorReferenceType1Choice.Proprietary,
					com.tools20022.repository.msg.StructuredRemittanceInformation2.ReferredDocumentType, com.tools20022.repository.msg.DocumentGeneralInformation1.DocumentType,
					com.tools20022.repository.msg.ReferredDocumentInformation2.Type, com.tools20022.repository.msg.InvoiceHeader1.TypeCode, com.tools20022.repository.msg.DocumentGeneralInformation2.DocumentType,
					com.tools20022.repository.msg.DocumentIdentification10.Type, com.tools20022.repository.msg.DocumentLineIdentification1.Type, com.tools20022.repository.msg.ReferredDocumentInformation4.Type,
					com.tools20022.repository.choice.DocumentLineType1Choice.Code, com.tools20022.repository.choice.DocumentLineType1Choice.Proprietary, com.tools20022.repository.choice.GarnishmentType1Choice.Code,
					com.tools20022.repository.choice.GarnishmentType1Choice.Proprietary, com.tools20022.repository.choice.ReferredDocumentType3Choice.Code, com.tools20022.repository.choice.ReferredDocumentType3Choice.Proprietary,
					com.tools20022.repository.msg.ReferredDocumentInformation6.Type, com.tools20022.repository.msg.QualifiedDocumentInformation1.DocumentType, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Type,
					com.tools20022.repository.msg.SupportingDocumentEntry1.DocumentType, com.tools20022.repository.msg.DocumentGeneralInformation3.DocumentType, com.tools20022.repository.msg.ReferredDocumentInformation7.Type,
					com.tools20022.repository.msg.InvoiceHeader2.TypeCode, com.tools20022.repository.msg.ReferredMandateDocument1.Type);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the document, for example commercial invoice.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DocumentTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money and currency of a document. <br>
	 * The amount can be either the original amount due and payable for instance
	 * the ordered amount, or the amount actually remitted for the referred
	 * document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#CreditNoteAmount
	 * ReferredDocumentAmount1Choice.CreditNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#ReferredDocumentAmount
	 * StructuredRemittanceInformation6.ReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#ReferredDocumentAmount
	 * StructuredRemittanceInformation7.ReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#ReferredDocumentAmount
	 * StructuredRemittanceInformation9.ReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#ReferredDocumentAmount
	 * StructuredRemittanceInformation8.ReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#ReferredDocumentAmount
	 * StructuredRemittanceInformation2.ReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#TotalInvoiceAmount
	 * InvoiceTotals1.TotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#TotalInvoiceAmount
	 * ServiceItemTotals1.TotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#TotalInvoiceAmount
	 * InvoiceTotals2.TotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#TotalInvoiceAmount
	 * ServiceCategoryTotals1.TotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#Amount
	 * DocumentLineInformation1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#ReferredDocumentAmount
	 * StructuredRemittanceInformation12.ReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmount
	 * SupportingDocumentEntry1.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmountAfterShipment
	 * SupportingDocumentEntry1.TotalAmountAfterShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmountInContractCurrency
	 * SupportingDocumentEntry1.TotalAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmountAfterShipmentInContractCurrency
	 * SupportingDocumentEntry1.TotalAmountAfterShipmentInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#TransactionAmountInContractCurrency
	 * TransactionCertificateContract1.TransactionAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#ReferredDocumentAmount
	 * StructuredRemittanceInformation13.ReferredDocumentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReferredDocumentAmount1Choice.CreditNoteAmount, com.tools20022.repository.msg.StructuredRemittanceInformation6.ReferredDocumentAmount,
					com.tools20022.repository.msg.StructuredRemittanceInformation7.ReferredDocumentAmount, com.tools20022.repository.msg.StructuredRemittanceInformation9.ReferredDocumentAmount,
					com.tools20022.repository.msg.StructuredRemittanceInformation8.ReferredDocumentAmount, com.tools20022.repository.msg.StructuredRemittanceInformation2.ReferredDocumentAmount,
					com.tools20022.repository.msg.InvoiceTotals1.TotalInvoiceAmount, com.tools20022.repository.msg.ServiceItemTotals1.TotalInvoiceAmount, com.tools20022.repository.msg.InvoiceTotals2.TotalInvoiceAmount,
					com.tools20022.repository.msg.ServiceCategoryTotals1.TotalInvoiceAmount, com.tools20022.repository.msg.DocumentLineInformation1.Amount,
					com.tools20022.repository.msg.StructuredRemittanceInformation12.ReferredDocumentAmount, com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmount,
					com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmountAfterShipment, com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmountInContractCurrency,
					com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmountAfterShipmentInContractCurrency, com.tools20022.repository.msg.TransactionCertificateContract1.TransactionAmountInContractCurrency,
					com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentAmount);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Agreement which is materialised by a document
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#Document
	 * Agreement.Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#GoverningContract
	 * BusinessLetter1.GoverningContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#GoverningContract
	 * EventDescription1.GoverningContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#GoverningContract
	 * FinancialItemParameters1.GoverningContract}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement which is materialised by a document"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Agreement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessLetter1.GoverningContract, com.tools20022.repository.msg.EventDescription1.GoverningContract,
					com.tools20022.repository.msg.FinancialItemParameters1.GoverningContract);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement which is materialised by a document";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place where the document was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#IssuedDocument
	 * Location.IssuedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#PlaceOfIssue
	 * Undertaking3.PlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#PlaceOfIssue
	 * CertificateDataSet1.PlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#PlaceOfIssue
	 * CertificateDataSet2.PlaceOfIssue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the document was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfIssue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking3.PlaceOfIssue, com.tools20022.repository.msg.CertificateDataSet1.PlaceOfIssue, com.tools20022.repository.msg.CertificateDataSet2.PlaceOfIssue);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the document was issued.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.IssuedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unambiguous identification of the version of a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#Version
	 * DocumentIdentification3.Version}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#Version
	 * DocumentIdentification1.Version}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#Version
	 * DocumentIdentification4.Version}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification6#Version
	 * DocumentIdentification6.Version}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#Version
	 * DocumentIdentification2.Version}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#Version
	 * DocumentIdentification10.Version}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the version of a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DocumentVersion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification3.Version, com.tools20022.repository.msg.DocumentIdentification1.Version, com.tools20022.repository.msg.DocumentIdentification4.Version,
					com.tools20022.repository.msg.DocumentIdentification6.Version, com.tools20022.repository.msg.DocumentIdentification2.Version, com.tools20022.repository.msg.DocumentIdentification10.Version);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentVersion";
			definition = "Unambiguous identification of the version of a document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Status of the document (eg delivered, paid, etc.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#Status
	 * BillingStatement1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#RegulatoryRuleValidation
	 * ContractRegistrationStatement1.RegulatoryRuleValidation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Status
	 * BillingStatement2.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the document (eg delivered, paid, etc.)"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingStatement1.Status, com.tools20022.repository.msg.ContractRegistrationStatement1.RegulatoryRuleValidation,
					com.tools20022.repository.msg.BillingStatement2.Status);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the document (eg delivered, paid, etc.)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Reconciliation process for which a document is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#Document
	 * Reconciliation.Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation process for which a document is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process for which a document is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Written undertaking by a bank to honour a demand for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#Document
	 * LetterOfCredit.Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written undertaking by a bank to honour a demand for payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LetterOfCredit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of a document or in the context of
	 * the business linked to the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#Document
	 * DocumentPartyRole.Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DocumentPartyRole
	 * DocumentPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#NotificationInformation
	 * FinancingAgreementList1.NotificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#NotificationInformation
	 * FinancingItemList1.NotificationInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of a document or in the context of the business linked to the document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingAgreementList1.NotificationInformation, com.tools20022.repository.msg.FinancingItemList1.NotificationInformation);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a document or in the context of the business linked to the document.";
			minOccurs = 0;
			type_lazy = () -> DocumentPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of data set in which the document is included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#Type
	 * DocumentIdentification2.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of data set in which the document is included."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DataSetType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification2.Type);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DataSetType";
			definition = "Specifies the type of data set in which the document is included.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DataSetTypeCode.mmObject();
		}
	};
	/**
	 * Transport process for which related documents are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#TransportDocuments
	 * Transport.TransportDocuments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#MatchTransport
	 * RequiredSubmission3.MatchTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#Transport
	 * InsuranceDataSet1.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#Transport
	 * CertificateDataSet2.Transport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport process for which related documents are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequiredSubmission3.MatchTransport, com.tools20022.repository.msg.InsuranceDataSet1.Transport, com.tools20022.repository.msg.CertificateDataSet2.Transport);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process for which related documents are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransportDocuments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication whether the document must be signed or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication whether the document must be signed or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SignedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignedIndicator";
			definition = "Indication whether the document must be signed or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money remitted for the referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#RemittedAmount
	 * ReferredDocumentAmount1Choice.RemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#RemittedAmount
	 * RemittanceAmount1.RemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#RemittedAmount
	 * RemittanceAmount2.RemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#ReferredDocumentAmount
	 * StructuredRemittanceInformation10.ReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#RemittedAmount
	 * Garnishment1.RemittedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remitted for the referred document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RemittedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReferredDocumentAmount1Choice.RemittedAmount, com.tools20022.repository.msg.RemittanceAmount1.RemittedAmount,
					com.tools20022.repository.msg.RemittanceAmount2.RemittedAmount, com.tools20022.repository.msg.StructuredRemittanceInformation10.ReferredDocumentAmount, com.tools20022.repository.msg.Garnishment1.RemittedAmount);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Guarantee that is described in a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#Document
	 * Guarantee.Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee that is described in a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Guarantee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee that is described in a document.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Language used for textual information in the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#LanguageCode
	 * InvoiceHeader1.LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#LanguageCode
	 * EventDescription1.LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#LanguageCode
	 * FinancialItemParameters1.LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#LanguageCode
	 * InvoiceHeader2.LanguageCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used for textual information in the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceHeader1.LanguageCode, com.tools20022.repository.msg.EventDescription1.LanguageCode, com.tools20022.repository.msg.FinancialItemParameters1.LanguageCode,
					com.tools20022.repository.msg.InvoiceHeader2.LanguageCode);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language used for textual information in the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Specifies the function of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#DocumentPurpose
	 * InvoiceHeader1.DocumentPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#DocumentPurpose
	 * FinancialItemParameters1.DocumentPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Subject
	 * SupportingDocumentRequestOrLetter1.Subject}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#DocumentPurpose
	 * InvoiceHeader2.DocumentPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the function of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceHeader1.DocumentPurpose, com.tools20022.repository.msg.FinancialItemParameters1.DocumentPurpose,
					com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Subject, com.tools20022.repository.msg.InvoiceHeader2.DocumentPurpose);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the function of the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a document for instance unique identification of the
	 * purchase order, assigned by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedDocument
	 * GenericIdentification.IdentifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#Name
	 * InvoiceHeader1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#LetterOfCreditIdentification
	 * OtherCollateral2.LetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#LetterOfCreditIdentification
	 * OtherCollateral4.LetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#RequestOrLetterIdentification
	 * SupportingDocumentRequestOrLetter1.RequestOrLetterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#OriginalReferences
	 * SupportingDocumentRequestOrLetter1.OriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#Certificate
	 * TransactionCertificate1.Certificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#OriginalDocument
	 * SupportingDocumentEntry1.OriginalDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateReference1#Identification
	 * CertificateReference1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#ContractReference
	 * TransactionCertificateContract1.ContractReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice#Contract
	 * ContractRegistrationReference1Choice.Contract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#DocumentIdentification
	 * CurrencyControlRecordStatus1.DocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#LetterOfCreditIdentification
	 * OtherCollateral7.LetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#LetterOfCreditIdentification
	 * OtherCollateral5.LetterOfCreditIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#Name
	 * InvoiceHeader2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#MandateReference
	 * Mandate10.MandateReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#MandateReference
	 * Mandate9.MandateReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#MandateReference
	 * Mandate11.MandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#CreditorReference
	 * ReferredMandateDocument1.CreditorReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#MandateReference
	 * Mandate8.MandateReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a document for instance unique identification of the purchase order, assigned by the buyer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DocumentIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceHeader1.Name, com.tools20022.repository.msg.OtherCollateral2.LetterOfCreditIdentification,
					com.tools20022.repository.msg.OtherCollateral4.LetterOfCreditIdentification, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.RequestOrLetterIdentification,
					com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.OriginalReferences, com.tools20022.repository.msg.TransactionCertificate1.Certificate,
					com.tools20022.repository.msg.SupportingDocumentEntry1.OriginalDocument, com.tools20022.repository.msg.CertificateReference1.Identification,
					com.tools20022.repository.msg.TransactionCertificateContract1.ContractReference, com.tools20022.repository.choice.ContractRegistrationReference1Choice.Contract,
					com.tools20022.repository.msg.CurrencyControlRecordStatus1.DocumentIdentification, com.tools20022.repository.msg.OtherCollateral7.LetterOfCreditIdentification,
					com.tools20022.repository.msg.OtherCollateral5.LetterOfCreditIdentification, com.tools20022.repository.msg.InvoiceHeader2.Name, com.tools20022.repository.msg.Mandate10.MandateReference,
					com.tools20022.repository.msg.Mandate9.MandateReference, com.tools20022.repository.msg.Mandate11.MandateReference, com.tools20022.repository.msg.ReferredMandateDocument1.CreditorReference,
					com.tools20022.repository.msg.Mandate8.MandateReference);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentIdentification";
			definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentifiedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Proof of evidence which uses a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Evidence#RelatedDocument
	 * Evidence.RelatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Evidence Evidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Evidence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proof of evidence which uses a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Evidence = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Evidence";
			definition = "Proof of evidence which uses a document.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Evidence.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Evidence.RelatedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which a certificare is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#Documents
	 * CommercialTrade.Documents}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which a certificare is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Trade for which a certificare is issued.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.Documents;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Presentation of documents and statements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#PresentedDocument
	 * Presentation.PresentedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Document11#ElectronicDetails
	 * Document11.ElectronicDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Document8#ElectronicDetails
	 * Document8.ElectronicDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation of documents and statements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Presentation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Document11.ElectronicDetails, com.tools20022.repository.msg.Document8.ElectronicDetails);
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation of documents and statements.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.PresentedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Related document which materialises the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Attachment
	 * RegisteredContract.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related document which materialises the agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Document.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedContract";
			definition = "Related document which materialises the agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Attachment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Document";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentifiedDocument, com.tools20022.repository.entity.ContactPoint.StoredDocument,
						com.tools20022.repository.entity.Location.IssuedDocument, com.tools20022.repository.entity.Agreement.Document, com.tools20022.repository.entity.DocumentPartyRole.Document,
						com.tools20022.repository.entity.PaymentObligation.AssociatedDocument, com.tools20022.repository.entity.Presentation.PresentedDocument, com.tools20022.repository.entity.CommercialTrade.Documents,
						com.tools20022.repository.entity.Transport.TransportDocuments, com.tools20022.repository.entity.LetterOfCredit.Document, com.tools20022.repository.entity.Guarantee.Document,
						com.tools20022.repository.entity.Reconciliation.Document, com.tools20022.repository.entity.Evidence.RelatedDocument, com.tools20022.repository.entity.RegisteredContract.Attachment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation6.ReferredDocumentInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation6.AdditionalRemittanceInformation, com.tools20022.repository.msg.RemittanceInformation1.Unstructured,
						com.tools20022.repository.msg.RemittanceInformation1.Structured, com.tools20022.repository.msg.ReferredDocumentType2.CodeOrProprietary, com.tools20022.repository.msg.CreditorReferenceType2.CodeOrProprietary,
						com.tools20022.repository.msg.StructuredRemittanceInformation7.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation7.AdditionalRemittanceInformation,
						com.tools20022.repository.msg.RemittanceInformation5.Unstructured, com.tools20022.repository.msg.RemittanceInformation5.Structured,
						com.tools20022.repository.msg.StructuredRemittanceInformation9.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation9.AdditionalRemittanceInformation,
						com.tools20022.repository.msg.RemittanceInformation7.Unstructured, com.tools20022.repository.msg.RemittanceInformation7.Structured, com.tools20022.repository.msg.RemittanceInformation2.Unstructured,
						com.tools20022.repository.msg.StructuredRemittanceInformation8.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation8.AdditionalRemittanceInformation,
						com.tools20022.repository.msg.RemittanceInformation6.Unstructured, com.tools20022.repository.msg.RemittanceInformation6.Structured, com.tools20022.repository.choice.RemittanceInformation3Choice.Unstructured,
						com.tools20022.repository.choice.RemittanceInformation3Choice.Structured, com.tools20022.repository.msg.RequestedModification.RemittanceInformation,
						com.tools20022.repository.msg.RequestedModification2.RemittanceInformation, com.tools20022.repository.msg.TradeAgreement6.AdditionalReferenceDocument,
						com.tools20022.repository.msg.RequestedModification3.RemittanceInformation, com.tools20022.repository.msg.RemittanceInformation3.Unstructured, com.tools20022.repository.msg.RemittanceInformation3.Structured,
						com.tools20022.repository.msg.RemittanceInformation4.Unstructured, com.tools20022.repository.msg.RemittanceInformation4.Structured, com.tools20022.repository.msg.DocumentLineType1.CodeOrProprietary,
						com.tools20022.repository.msg.StructuredRemittanceInformation10.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation10.AdditionalRemittanceInformation,
						com.tools20022.repository.msg.RemittanceInformation8.Structured, com.tools20022.repository.msg.ReferredDocumentInformation4.LineDetails, com.tools20022.repository.msg.DocumentLineInformation1.Description,
						com.tools20022.repository.msg.GarnishmentType1.CodeOrProprietary, com.tools20022.repository.msg.RemittanceInformation10.Unstructured, com.tools20022.repository.msg.RemittanceInformation10.Structured,
						com.tools20022.repository.msg.RequestedModification4.RemittanceInformation, com.tools20022.repository.msg.StructuredRemittanceInformation12.ReferredDocumentInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation12.AdditionalRemittanceInformation, com.tools20022.repository.msg.ReferredDocumentType4.CodeOrProprietary,
						com.tools20022.repository.msg.BusinessLetter1.RelatedLetter, com.tools20022.repository.msg.BusinessLetter1.RelatedMessage, com.tools20022.repository.msg.BusinessLetter1.AssociatedDocument,
						com.tools20022.repository.msg.EncapsulatedBusinessMessage1.Header, com.tools20022.repository.msg.EncapsulatedBusinessMessage1.Message, com.tools20022.repository.msg.FinancingAgreementList1.RelatedDocument,
						com.tools20022.repository.msg.FinancingItemList1.RelatedDocument, com.tools20022.repository.msg.ReconciliationList1.RelatedDocument, com.tools20022.repository.msg.ReconciliationList1.AssociatedDocument,
						com.tools20022.repository.msg.EventDescription1.RelatedDocument, com.tools20022.repository.msg.EventDescription1.RelatedLetter, com.tools20022.repository.msg.EventDescription1.RelatedMessage,
						com.tools20022.repository.msg.EventDescription1.AssociatedDocument, com.tools20022.repository.msg.GuaranteeDetails1.AssociatedDocument, com.tools20022.repository.msg.RequestedModification5.RemittanceInformation,
						com.tools20022.repository.msg.RemittanceInformation12.Structured, com.tools20022.repository.msg.RemittanceInformation11.Unstructured, com.tools20022.repository.msg.RemittanceInformation11.Structured,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation13.AdditionalRemittanceInformation,
						com.tools20022.repository.msg.ReferredDocumentInformation7.LineDetails, com.tools20022.repository.msg.TradeAgreement13.AdditionalReferenceDocument,
						com.tools20022.repository.msg.RequestedModification6.RemittanceInformation, com.tools20022.repository.msg.RemittanceInformation13.Structured);
				subType_lazy = () -> Arrays.asList(PrivateCertificate.mmObject(), InsuranceCertificate.mmObject(), SecurityCertificate.mmObject(), TradeCertificate.mmObject(), Assessment.mmObject(), DeliveryNote.mmObject(),
						FinancialDocument.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.IssueDate, com.tools20022.repository.entity.Document.CopyDuplicate, com.tools20022.repository.entity.Document.PlaceOfStorage,
						com.tools20022.repository.entity.Document.PaymentObligation, com.tools20022.repository.entity.Document.Type, com.tools20022.repository.entity.Document.Amount, com.tools20022.repository.entity.Document.Agreement,
						com.tools20022.repository.entity.Document.PlaceOfIssue, com.tools20022.repository.entity.Document.DocumentVersion, com.tools20022.repository.entity.Document.Status,
						com.tools20022.repository.entity.Document.Reconciliation, com.tools20022.repository.entity.Document.LetterOfCredit, com.tools20022.repository.entity.Document.PartyRole,
						com.tools20022.repository.entity.Document.DataSetType, com.tools20022.repository.entity.Document.Transport, com.tools20022.repository.entity.Document.SignedIndicator,
						com.tools20022.repository.entity.Document.RemittedAmount, com.tools20022.repository.entity.Document.Guarantee, com.tools20022.repository.entity.Document.Language, com.tools20022.repository.entity.Document.Purpose,
						com.tools20022.repository.entity.Document.DocumentIdentification, com.tools20022.repository.entity.Document.Evidence, com.tools20022.repository.entity.Document.CommercialTrade,
						com.tools20022.repository.entity.Document.Presentation, com.tools20022.repository.entity.Document.RelatedContract);
				derivationComponent_lazy = () -> Arrays.asList(DocumentIdentification11.mmObject(), DocumentIdentification16.mmObject(), DocumentIdentification9.mmObject(), DocumentIdentification1Choice.mmObject(),
						DocumentIdentification14.mmObject(), DocumentIdentification17.mmObject(), DocumentIdentification2Choice.mmObject(), DocumentIdentification21.mmObject(), DocumentIdentification12.mmObject(),
						DocumentIdentification15.mmObject(), DocumentIdentification13.mmObject(), DocumentIdentification18.mmObject(), DocumentIdentification19.mmObject(), DocumentIdentification20.mmObject(),
						ReferredDocumentType1.mmObject(), ReferredDocumentInformation1.mmObject(), ReferredDocumentAmount1Choice.mmObject(), CreditorReferenceType1.mmObject(), StructuredRemittanceInformation6.mmObject(),
						RemittanceInformation1.mmObject(), ReferredDocumentType1Choice.mmObject(), ReferredDocumentType2.mmObject(), ReferredDocumentInformation3.mmObject(), RemittanceAmount1.mmObject(),
						CreditorReferenceType1Choice.mmObject(), CreditorReferenceType2.mmObject(), StructuredRemittanceInformation7.mmObject(), RemittanceInformation5.mmObject(), RemittanceAmount2.mmObject(),
						StructuredRemittanceInformation9.mmObject(), RemittanceInformation7.mmObject(), RemittanceInformation2.mmObject(), StructuredRemittanceInformation8.mmObject(), RemittanceInformation6.mmObject(),
						StructuredRemittanceInformation2.mmObject(), RemittanceInformation3Choice.mmObject(), DocumentIdentification8.mmObject(), DocumentNumber1.mmObject(), DocumentNumber2.mmObject(), DocumentNumber6.mmObject(),
						DocumentNumber5.mmObject(), AgreementClauses1.mmObject(), DocumentGeneralInformation1.mmObject(), ReferredDocumentInformation2.mmObject(), InvoiceHeader1.mmObject(), DocumentIdentification22.mmObject(),
						DocumentGeneralInformation2.mmObject(), DocumentIdentification7.mmObject(), DocumentIdentification23.mmObject(), DocumentIdentification3.mmObject(), DocumentIdentification5.mmObject(),
						DocumentIdentification1.mmObject(), RequiredSubmission1.mmObject(), DocumentIdentification4.mmObject(), DocumentIdentification6.mmObject(), DocumentIdentification2.mmObject(), DocumentIdentification10.mmObject(),
						DocumentNumber3.mmObject(), DocumentNumber4.mmObject(), DocumentNumber7.mmObject(), DocumentIdentification24.mmObject(), DocumentNumber9.mmObject(), DocumentIdentification26.mmObject(), DocumentNumber11.mmObject(),
						DocumentNumber8.mmObject(), RemittanceInformation3.mmObject(), RemittanceInformation4.mmObject(), DocumentIdentification27.mmObject(), DocumentLineType1.mmObject(), StructuredRemittanceInformation10.mmObject(),
						DocumentLineIdentification1.mmObject(), RemittanceInformation8.mmObject(), ReferredDocumentInformation4.mmObject(), DocumentLineInformation1.mmObject(), DocumentLineType1Choice.mmObject(),
						GarnishmentType1Choice.mmObject(), GarnishmentType1.mmObject(), RemittanceInformation10.mmObject(), ReferredDocumentType3Choice.mmObject(), ReferredDocumentInformation6.mmObject(),
						StructuredRemittanceInformation12.mmObject(), ReferredDocumentType4.mmObject(), BusinessLetter1.mmObject(), EncapsulatedBusinessMessage1.mmObject(), FinancingAgreementList1.mmObject(),
						ReconciliationList1.mmObject(), EventDescription1.mmObject(), QualifiedDocumentInformation1.mmObject(), SupportingDocumentRequestOrLetter1.mmObject(), DocumentIdentification29.mmObject(),
						SupportingDocumentEntry1.mmObject(), DocumentGeneralInformation3.mmObject(), CertificateReference1.mmObject(), DocumentIdentification28.mmObject(), DocumentIdentification30.mmObject(), DocumentNumber12.mmObject(),
						RemittanceInformation12.mmObject(), RemittanceInformation11.mmObject(), StructuredRemittanceInformation13.mmObject(), ReferredDocumentInformation7.mmObject(), DocumentNumber13.mmObject(),
						DocumentIdentification31.mmObject(), DocumentIdentification32.mmObject(), DocumentIdentification33.mmObject(), DocumentIdentification3Choice.mmObject(), DocumentIdentification38.mmObject(),
						DocumentIdentification37.mmObject(), DocumentIdentification34.mmObject(), DocumentIdentification4Choice.mmObject(), DocumentNumber14.mmObject(), DocumentIdentification48.mmObject(), DocumentNumber15.mmObject(),
						DocumentIdentification49.mmObject(), InvoiceHeader2.mmObject(), RemittanceInformation13.mmObject(), ReferredMandateDocument1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}