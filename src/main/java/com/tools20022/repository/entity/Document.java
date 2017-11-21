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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CopyDuplicateCode;
import com.tools20022.repository.codeset.DataSetTypeCode;
import com.tools20022.repository.codeset.DocumentTypeCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmIssueDate
 * Document.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCopyDuplicate
 * Document.mmCopyDuplicate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
 * Document.mmPlaceOfStorage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
 * Document.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmType
 * Document.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAmount
 * Document.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAgreement
 * Document.mmAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
 * Document.mmPlaceOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDocumentVersion
 * Document.mmDocumentVersion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmStatus
 * Document.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmReconciliation
 * Document.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLetterOfCredit
 * Document.mmLetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPartyRole
 * Document.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDataSetType
 * Document.mmDataSetType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmTransport
 * Document.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmSignedIndicator
 * Document.mmSignedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
 * Document.mmRemittedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmGuarantee
 * Document.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLanguage
 * Document.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPurpose
 * Document.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmEvidence
 * Document.mmEvidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
 * Document.mmCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPresentation
 * Document.mmPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRelatedContract
 * Document.mmRelatedContract}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
 * ContactPoint.mmStoredDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
 * Location.mmIssuedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDocument
 * Agreement.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
 * DocumentPartyRole.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
 * PaymentObligation.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
 * Presentation.mmPresentedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
 * CommercialTrade.mmDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
 * Transport.mmTransportDocuments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
 * LetterOfCredit.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
 * Guarantee.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
 * Reconciliation.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
 * Evidence.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
 * RegisteredContract.mmAttachment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentInformation
 * StructuredRemittanceInformation6.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation6.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation1#mmUnstructured
 * RemittanceInformation1.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation1#mmStructured
 * RemittanceInformation1.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType2#mmCodeOrProprietary
 * ReferredDocumentType2.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType2#mmCodeOrProprietary
 * CreditorReferenceType2.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmReferredDocumentInformation
 * StructuredRemittanceInformation7.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation7.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation5#mmUnstructured
 * RemittanceInformation5.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation5#mmStructured
 * RemittanceInformation5.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentInformation
 * StructuredRemittanceInformation9.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation9.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#mmUnstructured
 * RemittanceInformation7.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#mmStructured
 * RemittanceInformation7.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation2#mmUnstructured
 * RemittanceInformation2.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmReferredDocumentInformation
 * StructuredRemittanceInformation8.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation8.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation6#mmUnstructured
 * RemittanceInformation6.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation6#mmStructured
 * RemittanceInformation6.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice#mmUnstructured
 * RemittanceInformation3Choice.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice#mmStructured
 * RemittanceInformation3Choice.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRemittanceInformation
 * RequestedModification.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmRemittanceInformation
 * RequestedModification2.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmAdditionalReferenceDocument
 * TradeAgreement6.mmAdditionalReferenceDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmRemittanceInformation
 * RequestedModification3.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation3#mmUnstructured
 * RemittanceInformation3.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation3#mmStructured
 * RemittanceInformation3.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation4#mmUnstructured
 * RemittanceInformation4.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation4#mmStructured
 * RemittanceInformation4.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineType1#mmCodeOrProprietary
 * DocumentLineType1.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentInformation
 * StructuredRemittanceInformation10.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation10.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#mmStructured
 * RemittanceInformation8.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmLineDetails
 * ReferredDocumentInformation4.mmLineDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmDescription
 * DocumentLineInformation1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GarnishmentType1#mmCodeOrProprietary
 * GarnishmentType1.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#mmUnstructured
 * RemittanceInformation10.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#mmStructured
 * RemittanceInformation10.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmRemittanceInformation
 * RequestedModification4.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmReferredDocumentInformation
 * StructuredRemittanceInformation12.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation12.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType4#mmCodeOrProprietary
 * ReferredDocumentType4.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmRelatedLetter
 * BusinessLetter1.mmRelatedLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmRelatedMessage
 * BusinessLetter1.mmRelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmAssociatedDocument
 * BusinessLetter1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmHeader
 * EncapsulatedBusinessMessage1.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmMessage
 * EncapsulatedBusinessMessage1.mmMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmRelatedDocument
 * FinancingAgreementList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmRelatedDocument
 * FinancingItemList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmRelatedDocument
 * ReconciliationList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmAssociatedDocument
 * ReconciliationList1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedDocument
 * EventDescription1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedLetter
 * EventDescription1.mmRelatedLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedMessage
 * EventDescription1.mmRelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmAssociatedDocument
 * EventDescription1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmAssociatedDocument
 * GuaranteeDetails1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmRemittanceInformation
 * RequestedModification5.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmStructured
 * RemittanceInformation12.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#mmUnstructured
 * RemittanceInformation11.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#mmStructured
 * RemittanceInformation11.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentInformation
 * StructuredRemittanceInformation13.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation13.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmLineDetails
 * ReferredDocumentInformation7.mmLineDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmAdditionalReferenceDocument
 * TradeAgreement13.mmAdditionalReferenceDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmRemittanceInformation
 * RequestedModification6.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmStructured
 * RemittanceInformation13.mmStructured}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ISODateTime issueDate;
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmCreationDateTime
	 * DocumentIdentification11.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#mmCreationDateTime
	 * DocumentIdentification16.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#mmCreationDateTime
	 * DocumentIdentification12.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#mmCreationDateTime
	 * DocumentIdentification18.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentRelatedDate
	 * StructuredRemittanceInformation6.mmReferredDocumentRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmRelatedDate
	 * ReferredDocumentInformation3.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmDateOfIssuance
	 * Undertaking4.mmDateOfIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmDateOfIssuance
	 * Undertaking3.mmDateOfIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentRelatedDate
	 * StructuredRemittanceInformation2.mmReferredDocumentRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#mmCreationDateTime
	 * DocumentIdentification8.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#mmIssueDate
	 * DocumentGeneralInformation1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#mmRelatedDate
	 * ReferredDocumentInformation2.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#mmIssueDate
	 * OriginalInvoiceInformation1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmIssueDateTime
	 * InvoiceHeader1.mmIssueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#mmDateOfIssue
	 * DocumentIdentification22.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmIssueDate
	 * DocumentGeneralInformation2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7#mmDateOfIssue
	 * DocumentIdentification7.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23#mmDateOfIssue
	 * DocumentIdentification23.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceIdentification1#mmIssueDate
	 * InvoiceIdentification1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmIssueDate
	 * InsuranceDataSet1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmIssueDate
	 * CertificateDataSet1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmIssueDate
	 * OtherCertificateDataSet1.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmCreationDateTime
	 * Report4.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmCreationDateTime
	 * BillingStatement1.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#mmCreationDateTime
	 * DocumentIdentification27.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmInvoiceDate
	 * BillingReport1.mmInvoiceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmInvoiceDate
	 * BillingCancellationReport1.mmInvoiceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#mmRelatedDate
	 * DocumentLineIdentification1.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmRelatedDate
	 * ReferredDocumentInformation4.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmIssueDate
	 * CertificateDataSet2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#mmRelatedDate
	 * ReferredDocumentInformation6.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmIssueDate
	 * OtherCertificateDataSet2.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmDate
	 * BusinessLetter1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmDate
	 * FinancingAgreementList1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmIssueDate
	 * FinancingItemList1.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#mmDate
	 * ReconciliationList1.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#mmDate
	 * EventDescription1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmDate
	 * QualifiedDocumentInformation1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmIssueDate
	 * FinancialItemParameters1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDate
	 * SupportingDocumentRequestOrLetter1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDueDate
	 * SupportingDocumentRequestOrLetter1.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#mmDateOfIssue
	 * DocumentIdentification29.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmIssueDate
	 * DocumentGeneralInformation3.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#mmDateOfIssue
	 * DocumentIdentification28.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmRelatedDate
	 * ReferredDocumentInformation7.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCreationDateTime
	 * BillingStatement2.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIssueDateTime
	 * InvoiceHeader2.mmIssueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmRelatedDate
	 * ReferredMandateDocument1.mmRelatedDate}</li>
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
	public static final MMBusinessAttribute mmIssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification11.mmCreationDateTime, DocumentIdentification16.mmCreationDateTime, DocumentIdentification12.mmCreationDateTime, DocumentIdentification18.mmCreationDateTime,
					StructuredRemittanceInformation6.mmReferredDocumentRelatedDate, ReferredDocumentInformation3.mmRelatedDate, Undertaking4.mmDateOfIssuance, Undertaking3.mmDateOfIssuance,
					StructuredRemittanceInformation2.mmReferredDocumentRelatedDate, DocumentIdentification8.mmCreationDateTime, DocumentGeneralInformation1.mmIssueDate, ReferredDocumentInformation2.mmRelatedDate,
					OriginalInvoiceInformation1.mmIssueDate, InvoiceHeader1.mmIssueDateTime, DocumentIdentification22.mmDateOfIssue, DocumentGeneralInformation2.mmIssueDate, DocumentIdentification7.mmDateOfIssue,
					DocumentIdentification23.mmDateOfIssue, InvoiceIdentification1.mmIssueDate, InsuranceDataSet1.mmIssueDate, CertificateDataSet1.mmIssueDate, OtherCertificateDataSet1.mmIssueDate, Report4.mmCreationDateTime,
					BillingStatement1.mmCreationDateTime, DocumentIdentification27.mmCreationDateTime, BillingReport1.mmInvoiceDate, BillingCancellationReport1.mmInvoiceDate, DocumentLineIdentification1.mmRelatedDate,
					ReferredDocumentInformation4.mmRelatedDate, CertificateDataSet2.mmIssueDate, ReferredDocumentInformation6.mmRelatedDate, OtherCertificateDataSet2.mmIssueDate, BusinessLetter1.mmDate, FinancingAgreementList1.mmDate,
					FinancingItemList1.mmIssueDate, ReconciliationList1.mmDate, EventDescription1.mmDate, QualifiedDocumentInformation1.mmDate, FinancialItemParameters1.mmIssueDate, SupportingDocumentRequestOrLetter1.mmDate,
					SupportingDocumentRequestOrLetter1.mmDueDate, DocumentIdentification29.mmDateOfIssue, DocumentGeneralInformation3.mmIssueDate, DocumentIdentification28.mmDateOfIssue, ReferredDocumentInformation7.mmRelatedDate,
					BillingStatement2.mmCreationDateTime, InvoiceHeader2.mmIssueDateTime, ReferredMandateDocument1.mmRelatedDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getIssueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyDuplicateCode copyDuplicate;
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmCopyDuplicate
	 * DocumentIdentification11.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#mmCopyDuplicate
	 * DocumentIdentification16.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#mmCopyDuplicate
	 * DocumentIdentification12.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#mmCopyDuplicate
	 * DocumentIdentification18.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#mmCopyDuplicate
	 * DocumentIdentification27.mmCopyDuplicate}</li>
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
	public static final MMBusinessAttribute mmCopyDuplicate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification11.mmCopyDuplicate, DocumentIdentification16.mmCopyDuplicate, DocumentIdentification12.mmCopyDuplicate, DocumentIdentification18.mmCopyDuplicate,
					DocumentIdentification27.mmCopyDuplicate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CopyDuplicateCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getCopyDuplicate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> placeOfStorage;
	/**
	 * Specifies where the document is stored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
	 * ContactPoint.mmStoredDocument}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedRemittanceInformation
	 * EntryTransaction1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedRemittanceInformation
	 * EntryTransaction2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRelatedRemittanceInformation
	 * EntryTransaction3.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedRemittanceInformation
	 * EntryTransaction4.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation9.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation11.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation13.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation10.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation12.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation14.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmRelatedRemittanceInformation
	 * NotificationItem3.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmRelatedRemittanceInformation
	 * OriginalItemReference1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmRelatedRemittanceInformation
	 * NotificationItem4.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmRelatedRemittanceInformation
	 * OriginalItemReference2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation6.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation8.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation17.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmRelatedRemittanceInformation
	 * OriginalItemReference3.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation18.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmRelatedRemittanceInformation
	 * NotificationItem5.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedRemittanceInformation
	 * EntryTransaction7.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation20.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmRelatedRemittanceInformation
	 * OriginalItemReference4.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation19.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedRemittanceInformation
	 * EntryTransaction8.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmRelatedRemittanceInformation
	 * NotificationItem6.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation21.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation22.mmRelatedRemittanceInformation}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfStorage = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmRelatedRemittanceInformation, EntryTransaction2.mmRelatedRemittanceInformation, EntryTransaction3.mmRelatedRemittanceInformation,
					EntryTransaction4.mmRelatedRemittanceInformation, DirectDebitTransactionInformation1.mmRelatedRemittanceInformation, DirectDebitTransactionInformation9.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation11.mmRelatedRemittanceInformation, DirectDebitTransactionInformation13.mmRelatedRemittanceInformation, DirectDebitTransactionInformation2.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation10.mmRelatedRemittanceInformation, DirectDebitTransactionInformation12.mmRelatedRemittanceInformation, DirectDebitTransactionInformation14.mmRelatedRemittanceInformation,
					NotificationItem3.mmRelatedRemittanceInformation, OriginalItemReference1.mmRelatedRemittanceInformation, NotificationItem4.mmRelatedRemittanceInformation, OriginalItemReference2.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation6.mmRelatedRemittanceInformation, DirectDebitTransactionInformation8.mmRelatedRemittanceInformation, DirectDebitTransactionInformation17.mmRelatedRemittanceInformation,
					OriginalItemReference3.mmRelatedRemittanceInformation, DirectDebitTransactionInformation18.mmRelatedRemittanceInformation, NotificationItem5.mmRelatedRemittanceInformation,
					EntryTransaction7.mmRelatedRemittanceInformation, DirectDebitTransactionInformation20.mmRelatedRemittanceInformation, OriginalItemReference4.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation19.mmRelatedRemittanceInformation, EntryTransaction8.mmRelatedRemittanceInformation, NotificationItem6.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation21.mmRelatedRemittanceInformation, DirectDebitTransactionInformation22.mmRelatedRemittanceInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfStorage";
			definition = "Specifies where the document is stored.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmStoredDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected PaymentObligation paymentObligation;
	/**
	 * Document which is referred to in a payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentTerms
	 * ReconciliationList1.mmPaymentTerms}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ReconciliationList1.mmPaymentTerms);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Document which is referred to in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected DocumentTypeCode type;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType1#mmCode
	 * ReferredDocumentType1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType1#mmProprietary
	 * ReferredDocumentType1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1#mmReferredDocumentType
	 * ReferredDocumentInformation1.mmReferredDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType1#mmCode
	 * CreditorReferenceType1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType1#mmProprietary
	 * CreditorReferenceType1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice#mmCode
	 * ReferredDocumentType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice#mmProprietary
	 * ReferredDocumentType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmType
	 * ReferredDocumentInformation3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#mmCode
	 * CreditorReferenceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#mmProprietary
	 * CreditorReferenceType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentType
	 * StructuredRemittanceInformation2.mmReferredDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#mmDocumentType
	 * DocumentGeneralInformation1.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#mmType
	 * ReferredDocumentInformation2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmTypeCode
	 * InvoiceHeader1.mmTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmDocumentType
	 * DocumentGeneralInformation2.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#mmType
	 * DocumentIdentification10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#mmType
	 * DocumentLineIdentification1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmType
	 * ReferredDocumentInformation4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#mmCode
	 * DocumentLineType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#mmProprietary
	 * DocumentLineType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#mmCode
	 * GarnishmentType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#mmProprietary
	 * GarnishmentType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#mmCode
	 * ReferredDocumentType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#mmProprietary
	 * ReferredDocumentType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#mmType
	 * ReferredDocumentInformation6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmDocumentType
	 * QualifiedDocumentInformation1.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmType
	 * SupportingDocumentRequestOrLetter1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmDocumentType
	 * SupportingDocumentEntry1.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmDocumentType
	 * DocumentGeneralInformation3.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmType
	 * ReferredDocumentInformation7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmTypeCode
	 * InvoiceHeader2.mmTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmType
	 * ReferredMandateDocument1.mmType}</li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentType1.mmCode, ReferredDocumentType1.mmProprietary, ReferredDocumentInformation1.mmReferredDocumentType, CreditorReferenceType1.mmCode, CreditorReferenceType1.mmProprietary,
					ReferredDocumentType1Choice.mmCode, ReferredDocumentType1Choice.mmProprietary, ReferredDocumentInformation3.mmType, CreditorReferenceType1Choice.mmCode, CreditorReferenceType1Choice.mmProprietary,
					StructuredRemittanceInformation2.mmReferredDocumentType, DocumentGeneralInformation1.mmDocumentType, ReferredDocumentInformation2.mmType, InvoiceHeader1.mmTypeCode, DocumentGeneralInformation2.mmDocumentType,
					DocumentIdentification10.mmType, DocumentLineIdentification1.mmType, ReferredDocumentInformation4.mmType, DocumentLineType1Choice.mmCode, DocumentLineType1Choice.mmProprietary, GarnishmentType1Choice.mmCode,
					GarnishmentType1Choice.mmProprietary, ReferredDocumentType3Choice.mmCode, ReferredDocumentType3Choice.mmProprietary, ReferredDocumentInformation6.mmType, QualifiedDocumentInformation1.mmDocumentType,
					SupportingDocumentRequestOrLetter1.mmType, SupportingDocumentEntry1.mmDocumentType, DocumentGeneralInformation3.mmDocumentType, ReferredDocumentInformation7.mmType, InvoiceHeader2.mmTypeCode,
					ReferredMandateDocument1.mmType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DocumentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmCreditNoteAmount
	 * ReferredDocumentAmount1Choice.mmCreditNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentAmount
	 * StructuredRemittanceInformation6.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmReferredDocumentAmount
	 * StructuredRemittanceInformation7.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentAmount
	 * StructuredRemittanceInformation9.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmReferredDocumentAmount
	 * StructuredRemittanceInformation8.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentAmount
	 * StructuredRemittanceInformation2.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#mmTotalInvoiceAmount
	 * InvoiceTotals1.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmTotalInvoiceAmount
	 * ServiceItemTotals1.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#mmTotalInvoiceAmount
	 * InvoiceTotals2.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmTotalInvoiceAmount
	 * ServiceCategoryTotals1.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmAmount
	 * DocumentLineInformation1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmReferredDocumentAmount
	 * StructuredRemittanceInformation12.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmount
	 * SupportingDocumentEntry1.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipment
	 * SupportingDocumentEntry1.mmTotalAmountAfterShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountInContractCurrency
	 * SupportingDocumentEntry1.mmTotalAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipmentInContractCurrency
	 * SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmTransactionAmountInContractCurrency
	 * TransactionCertificateContract1.mmTransactionAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentAmount
	 * StructuredRemittanceInformation13.mmReferredDocumentAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentAmount1Choice.mmCreditNoteAmount, StructuredRemittanceInformation6.mmReferredDocumentAmount, StructuredRemittanceInformation7.mmReferredDocumentAmount,
					StructuredRemittanceInformation9.mmReferredDocumentAmount, StructuredRemittanceInformation8.mmReferredDocumentAmount, StructuredRemittanceInformation2.mmReferredDocumentAmount, InvoiceTotals1.mmTotalInvoiceAmount,
					ServiceItemTotals1.mmTotalInvoiceAmount, InvoiceTotals2.mmTotalInvoiceAmount, ServiceCategoryTotals1.mmTotalInvoiceAmount, DocumentLineInformation1.mmAmount, StructuredRemittanceInformation12.mmReferredDocumentAmount,
					SupportingDocumentEntry1.mmTotalAmount, SupportingDocumentEntry1.mmTotalAmountAfterShipment, SupportingDocumentEntry1.mmTotalAmountInContractCurrency,
					SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency, TransactionCertificateContract1.mmTransactionAmountInContractCurrency, StructuredRemittanceInformation13.mmReferredDocumentAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Agreement> agreement;
	/**
	 * Agreement which is materialised by a document
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmGoverningContract
	 * BusinessLetter1.mmGoverningContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmGoverningContract
	 * EventDescription1.mmGoverningContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmGoverningContract
	 * FinancialItemParameters1.mmGoverningContract}</li>
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
	public static final MMBusinessAssociationEnd mmAgreement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BusinessLetter1.mmGoverningContract, EventDescription1.mmGoverningContract, FinancialItemParameters1.mmGoverningContract);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement which is materialised by a document";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};
	protected Location placeOfIssue;
	/**
	 * Place where the document was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
	 * Location.mmIssuedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmPlaceOfIssue
	 * Undertaking3.mmPlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmPlaceOfIssue
	 * CertificateDataSet1.mmPlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmPlaceOfIssue
	 * CertificateDataSet2.mmPlaceOfIssue}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfIssue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking3.mmPlaceOfIssue, CertificateDataSet1.mmPlaceOfIssue, CertificateDataSet2.mmPlaceOfIssue);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the document was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmIssuedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Number documentVersion;
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#mmVersion
	 * DocumentIdentification3.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#mmVersion
	 * DocumentIdentification1.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#mmVersion
	 * DocumentIdentification4.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification6#mmVersion
	 * DocumentIdentification6.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#mmVersion
	 * DocumentIdentification2.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#mmVersion
	 * DocumentIdentification10.mmVersion}</li>
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
	public static final MMBusinessAttribute mmDocumentVersion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification3.mmVersion, DocumentIdentification1.mmVersion, DocumentIdentification4.mmVersion, DocumentIdentification6.mmVersion, DocumentIdentification2.mmVersion,
					DocumentIdentification10.mmVersion);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentVersion";
			definition = "Unambiguous identification of the version of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getDocumentVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text status;
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
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmStatus
	 * BillingStatement1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmRegulatoryRuleValidation
	 * ContractRegistrationStatement1.mmRegulatoryRuleValidation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatus
	 * BillingStatement2.mmStatus}</li>
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
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BillingStatement1.mmStatus, ContractRegistrationStatement1.mmRegulatoryRuleValidation, BillingStatement2.mmStatus);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the document (eg delivered, paid, etc.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Reconciliation> reconciliation;
	/**
	 * Reconciliation process for which a document is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
	 * Reconciliation.mmDocument}</li>
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
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process for which a document is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	protected LetterOfCredit letterOfCredit;
	/**
	 * Written undertaking by a bank to honour a demand for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
	 * LetterOfCredit.mmDocument}</li>
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
	public static final MMBusinessAssociationEnd mmLetterOfCredit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DocumentPartyRole> partyRole;
	/**
	 * Role played by a party in the context of a document or in the context of
	 * the business linked to the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
	 * DocumentPartyRole.mmDocument}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmNotificationInformation
	 * FinancingAgreementList1.mmNotificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmNotificationInformation
	 * FinancingItemList1.mmNotificationInformation}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancingAgreementList1.mmNotificationInformation, FinancingItemList1.mmNotificationInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a document or in the context of the business linked to the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.mmObject();
		}
	};
	protected DataSetTypeCode dataSetType;
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#mmType
	 * DocumentIdentification2.mmType}</li>
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
	public static final MMBusinessAttribute mmDataSetType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification2.mmType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSetType";
			definition = "Specifies the type of data set in which the document is included.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getDataSetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Transport transport;
	/**
	 * Transport process for which related documents are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
	 * Transport.mmTransportDocuments}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchTransport
	 * RequiredSubmission3.mmMatchTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmTransport
	 * InsuranceDataSet1.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmTransport
	 * CertificateDataSet2.mmTransport}</li>
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
	public static final MMBusinessAssociationEnd mmTransport = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RequiredSubmission3.mmMatchTransport, InsuranceDataSet1.mmTransport, CertificateDataSet2.mmTransport);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process for which related documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmTransportDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected YesNoIndicator signedIndicator;
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
	public static final MMBusinessAttribute mmSignedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignedIndicator";
			definition = "Indication whether the document must be signed or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getSignedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount remittedAmount;
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
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmRemittedAmount
	 * ReferredDocumentAmount1Choice.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmRemittedAmount
	 * RemittanceAmount1.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmRemittedAmount
	 * RemittanceAmount2.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentAmount
	 * StructuredRemittanceInformation10.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmRemittedAmount
	 * Garnishment1.mmRemittedAmount}</li>
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
	public static final MMBusinessAttribute mmRemittedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentAmount1Choice.mmRemittedAmount, RemittanceAmount1.mmRemittedAmount, RemittanceAmount2.mmRemittedAmount, StructuredRemittanceInformation10.mmReferredDocumentAmount,
					Garnishment1.mmRemittedAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getRemittedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Guarantee> guarantee;
	/**
	 * Guarantee that is described in a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
	 * Guarantee.mmDocument}</li>
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
	public static final MMBusinessAssociationEnd mmGuarantee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee that is described in a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	protected LanguageCode language;
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmLanguageCode
	 * InvoiceHeader1.mmLanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmLanguageCode
	 * EventDescription1.mmLanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmLanguageCode
	 * FinancialItemParameters1.mmLanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmLanguageCode
	 * InvoiceHeader2.mmLanguageCode}</li>
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
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader1.mmLanguageCode, EventDescription1.mmLanguageCode, FinancialItemParameters1.mmLanguageCode, InvoiceHeader2.mmLanguageCode);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language used for textual information in the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text purpose;
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmDocumentPurpose
	 * InvoiceHeader1.mmDocumentPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmDocumentPurpose
	 * FinancialItemParameters1.mmDocumentPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmSubject
	 * SupportingDocumentRequestOrLetter1.mmSubject}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmDocumentPurpose
	 * InvoiceHeader2.mmDocumentPurpose}</li>
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
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader1.mmDocumentPurpose, FinancialItemParameters1.mmDocumentPurpose, SupportingDocumentRequestOrLetter1.mmSubject, InvoiceHeader2.mmDocumentPurpose);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the function of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification documentIdentification;
	/**
	 * Identification of a document for instance unique identification of the
	 * purchase order, assigned by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
	 * GenericIdentification.mmIdentifiedDocument}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmName
	 * InvoiceHeader1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmLetterOfCreditIdentification
	 * OtherCollateral2.mmLetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmLetterOfCreditIdentification
	 * OtherCollateral4.mmLetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmRequestOrLetterIdentification
	 * SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmOriginalReferences
	 * SupportingDocumentRequestOrLetter1.mmOriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#mmCertificate
	 * TransactionCertificate1.mmCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmOriginalDocument
	 * SupportingDocumentEntry1.mmOriginalDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateReference1#mmIdentification
	 * CertificateReference1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmContractReference
	 * TransactionCertificateContract1.mmContractReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice#mmContract
	 * ContractRegistrationReference1Choice.mmContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmDocumentIdentification
	 * CurrencyControlRecordStatus1.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmLetterOfCreditIdentification
	 * OtherCollateral7.mmLetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmLetterOfCreditIdentification
	 * OtherCollateral5.mmLetterOfCreditIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmName
	 * InvoiceHeader2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmMandateReference
	 * Mandate10.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmMandateReference
	 * Mandate9.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmMandateReference
	 * Mandate11.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmCreditorReference
	 * ReferredMandateDocument1.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmMandateReference
	 * Mandate8.mmMandateReference}</li>
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
	public static final MMBusinessAssociationEnd mmDocumentIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader1.mmName, OtherCollateral2.mmLetterOfCreditIdentification, OtherCollateral4.mmLetterOfCreditIdentification, SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification,
					SupportingDocumentRequestOrLetter1.mmOriginalReferences, TransactionCertificate1.mmCertificate, SupportingDocumentEntry1.mmOriginalDocument, CertificateReference1.mmIdentification,
					TransactionCertificateContract1.mmContractReference, ContractRegistrationReference1Choice.mmContract, CurrencyControlRecordStatus1.mmDocumentIdentification, OtherCollateral7.mmLetterOfCreditIdentification,
					OtherCollateral5.mmLetterOfCreditIdentification, InvoiceHeader2.mmName, Mandate10.mmMandateReference, Mandate9.mmMandateReference, Mandate11.mmMandateReference, ReferredMandateDocument1.mmCreditorReference,
					Mandate8.mmMandateReference);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentIdentification";
			definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Evidence> evidence;
	/**
	 * Proof of evidence which uses a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
	 * Evidence.mmRelatedDocument}</li>
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
	public static final MMBusinessAssociationEnd mmEvidence = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Evidence";
			definition = "Proof of evidence which uses a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Evidence.mmRelatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Evidence.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTrade> commercialTrade;
	/**
	 * Trade for which a certificare is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
	 * CommercialTrade.mmDocuments}</li>
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
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Trade for which a certificare is issued.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected Presentation presentation;
	/**
	 * Presentation of documents and statements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
	 * Presentation.mmPresentedDocument}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Document11#mmElectronicDetails
	 * Document11.mmElectronicDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Document8#mmElectronicDetails
	 * Document8.mmElectronicDetails}</li>
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
	public static final MMBusinessAssociationEnd mmPresentation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Document11.mmElectronicDetails, Document8.mmElectronicDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation of documents and statements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.mmPresentedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
		}
	};
	protected RegisteredContract relatedContract;
	/**
	 * Related document which materialises the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
	 * RegisteredContract.mmAttachment}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedContract";
			definition = "Related document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmAttachment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Document";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument, com.tools20022.repository.entity.ContactPoint.mmStoredDocument,
						com.tools20022.repository.entity.Location.mmIssuedDocument, com.tools20022.repository.entity.Agreement.mmDocument, com.tools20022.repository.entity.DocumentPartyRole.mmDocument,
						com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument, com.tools20022.repository.entity.Presentation.mmPresentedDocument, com.tools20022.repository.entity.CommercialTrade.mmDocuments,
						com.tools20022.repository.entity.Transport.mmTransportDocuments, com.tools20022.repository.entity.LetterOfCredit.mmDocument, com.tools20022.repository.entity.Guarantee.mmDocument,
						com.tools20022.repository.entity.Reconciliation.mmDocument, com.tools20022.repository.entity.Evidence.mmRelatedDocument, com.tools20022.repository.entity.RegisteredContract.mmAttachment);
				derivationElement_lazy = () -> Arrays.asList(StructuredRemittanceInformation6.mmReferredDocumentInformation, StructuredRemittanceInformation6.mmAdditionalRemittanceInformation, RemittanceInformation1.mmUnstructured,
						RemittanceInformation1.mmStructured, ReferredDocumentType2.mmCodeOrProprietary, CreditorReferenceType2.mmCodeOrProprietary, StructuredRemittanceInformation7.mmReferredDocumentInformation,
						StructuredRemittanceInformation7.mmAdditionalRemittanceInformation, RemittanceInformation5.mmUnstructured, RemittanceInformation5.mmStructured, StructuredRemittanceInformation9.mmReferredDocumentInformation,
						StructuredRemittanceInformation9.mmAdditionalRemittanceInformation, RemittanceInformation7.mmUnstructured, RemittanceInformation7.mmStructured, RemittanceInformation2.mmUnstructured,
						StructuredRemittanceInformation8.mmReferredDocumentInformation, StructuredRemittanceInformation8.mmAdditionalRemittanceInformation, RemittanceInformation6.mmUnstructured, RemittanceInformation6.mmStructured,
						RemittanceInformation3Choice.mmUnstructured, RemittanceInformation3Choice.mmStructured, RequestedModification.mmRemittanceInformation, RequestedModification2.mmRemittanceInformation,
						TradeAgreement6.mmAdditionalReferenceDocument, RequestedModification3.mmRemittanceInformation, RemittanceInformation3.mmUnstructured, RemittanceInformation3.mmStructured, RemittanceInformation4.mmUnstructured,
						RemittanceInformation4.mmStructured, DocumentLineType1.mmCodeOrProprietary, StructuredRemittanceInformation10.mmReferredDocumentInformation, StructuredRemittanceInformation10.mmAdditionalRemittanceInformation,
						RemittanceInformation8.mmStructured, ReferredDocumentInformation4.mmLineDetails, DocumentLineInformation1.mmDescription, GarnishmentType1.mmCodeOrProprietary, RemittanceInformation10.mmUnstructured,
						RemittanceInformation10.mmStructured, RequestedModification4.mmRemittanceInformation, StructuredRemittanceInformation12.mmReferredDocumentInformation,
						StructuredRemittanceInformation12.mmAdditionalRemittanceInformation, ReferredDocumentType4.mmCodeOrProprietary, BusinessLetter1.mmRelatedLetter, BusinessLetter1.mmRelatedMessage,
						BusinessLetter1.mmAssociatedDocument, EncapsulatedBusinessMessage1.mmHeader, EncapsulatedBusinessMessage1.mmMessage, FinancingAgreementList1.mmRelatedDocument, FinancingItemList1.mmRelatedDocument,
						ReconciliationList1.mmRelatedDocument, ReconciliationList1.mmAssociatedDocument, EventDescription1.mmRelatedDocument, EventDescription1.mmRelatedLetter, EventDescription1.mmRelatedMessage,
						EventDescription1.mmAssociatedDocument, GuaranteeDetails1.mmAssociatedDocument, RequestedModification5.mmRemittanceInformation, RemittanceInformation12.mmStructured, RemittanceInformation11.mmUnstructured,
						RemittanceInformation11.mmStructured, StructuredRemittanceInformation13.mmReferredDocumentInformation, StructuredRemittanceInformation13.mmAdditionalRemittanceInformation, ReferredDocumentInformation7.mmLineDetails,
						TradeAgreement13.mmAdditionalReferenceDocument, RequestedModification6.mmRemittanceInformation, RemittanceInformation13.mmStructured);
				subType_lazy = () -> Arrays.asList(PrivateCertificate.mmObject(), InsuranceCertificate.mmObject(), SecurityCertificate.mmObject(), TradeCertificate.mmObject(), Assessment.mmObject(), DeliveryNote.mmObject(),
						FinancialDocument.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.mmIssueDate, com.tools20022.repository.entity.Document.mmCopyDuplicate, com.tools20022.repository.entity.Document.mmPlaceOfStorage,
						com.tools20022.repository.entity.Document.mmPaymentObligation, com.tools20022.repository.entity.Document.mmType, com.tools20022.repository.entity.Document.mmAmount,
						com.tools20022.repository.entity.Document.mmAgreement, com.tools20022.repository.entity.Document.mmPlaceOfIssue, com.tools20022.repository.entity.Document.mmDocumentVersion,
						com.tools20022.repository.entity.Document.mmStatus, com.tools20022.repository.entity.Document.mmReconciliation, com.tools20022.repository.entity.Document.mmLetterOfCredit,
						com.tools20022.repository.entity.Document.mmPartyRole, com.tools20022.repository.entity.Document.mmDataSetType, com.tools20022.repository.entity.Document.mmTransport,
						com.tools20022.repository.entity.Document.mmSignedIndicator, com.tools20022.repository.entity.Document.mmRemittedAmount, com.tools20022.repository.entity.Document.mmGuarantee,
						com.tools20022.repository.entity.Document.mmLanguage, com.tools20022.repository.entity.Document.mmPurpose, com.tools20022.repository.entity.Document.mmDocumentIdentification,
						com.tools20022.repository.entity.Document.mmEvidence, com.tools20022.repository.entity.Document.mmCommercialTrade, com.tools20022.repository.entity.Document.mmPresentation,
						com.tools20022.repository.entity.Document.mmRelatedContract);
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

			@Override
			public Class<?> getInstanceClass() {
				return Document.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODateTime issueDate) {
		this.issueDate = issueDate;
	}

	public CopyDuplicateCode getCopyDuplicate() {
		return copyDuplicate;
	}

	public void setCopyDuplicate(CopyDuplicateCode copyDuplicate) {
		this.copyDuplicate = copyDuplicate;
	}

	public List<ContactPoint> getPlaceOfStorage() {
		return placeOfStorage;
	}

	public void setPlaceOfStorage(List<com.tools20022.repository.entity.ContactPoint> placeOfStorage) {
		this.placeOfStorage = placeOfStorage;
	}

	public PaymentObligation getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(com.tools20022.repository.entity.PaymentObligation paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public DocumentTypeCode getType() {
		return type;
	}

	public void setType(DocumentTypeCode type) {
		this.type = type;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
	}

	public List<Agreement> getAgreement() {
		return agreement;
	}

	public void setAgreement(List<com.tools20022.repository.entity.Agreement> agreement) {
		this.agreement = agreement;
	}

	public Location getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(com.tools20022.repository.entity.Location placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public Number getDocumentVersion() {
		return documentVersion;
	}

	public void setDocumentVersion(Number documentVersion) {
		this.documentVersion = documentVersion;
	}

	public Max140Text getStatus() {
		return status;
	}

	public void setStatus(Max140Text status) {
		this.status = status;
	}

	public List<Reconciliation> getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(List<com.tools20022.repository.entity.Reconciliation> reconciliation) {
		this.reconciliation = reconciliation;
	}

	public LetterOfCredit getLetterOfCredit() {
		return letterOfCredit;
	}

	public void setLetterOfCredit(com.tools20022.repository.entity.LetterOfCredit letterOfCredit) {
		this.letterOfCredit = letterOfCredit;
	}

	public List<DocumentPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.DocumentPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public DataSetTypeCode getDataSetType() {
		return dataSetType;
	}

	public void setDataSetType(DataSetTypeCode dataSetType) {
		this.dataSetType = dataSetType;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = transport;
	}

	public YesNoIndicator getSignedIndicator() {
		return signedIndicator;
	}

	public void setSignedIndicator(YesNoIndicator signedIndicator) {
		this.signedIndicator = signedIndicator;
	}

	public CurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public void setRemittedAmount(CurrencyAndAmount remittedAmount) {
		this.remittedAmount = remittedAmount;
	}

	public List<Guarantee> getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(List<com.tools20022.repository.entity.Guarantee> guarantee) {
		this.guarantee = guarantee;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	public GenericIdentification getDocumentIdentification() {
		return documentIdentification;
	}

	public void setDocumentIdentification(com.tools20022.repository.entity.GenericIdentification documentIdentification) {
		this.documentIdentification = documentIdentification;
	}

	public List<Evidence> getEvidence() {
		return evidence;
	}

	public void setEvidence(List<com.tools20022.repository.entity.Evidence> evidence) {
		this.evidence = evidence;
	}

	public List<CommercialTrade> getCommercialTrade() {
		return commercialTrade;
	}

	public void setCommercialTrade(List<com.tools20022.repository.entity.CommercialTrade> commercialTrade) {
		this.commercialTrade = commercialTrade;
	}

	public Presentation getPresentation() {
		return presentation;
	}

	public void setPresentation(com.tools20022.repository.entity.Presentation presentation) {
		this.presentation = presentation;
	}

	public RegisteredContract getRelatedContract() {
		return relatedContract;
	}

	public void setRelatedContract(com.tools20022.repository.entity.RegisteredContract relatedContract) {
		this.relatedContract = relatedContract;
	}
}