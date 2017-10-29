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
import com.tools20022.repository.choice.OtherIdentification1Choice;
import com.tools20022.repository.choice.OtherIdentification2Choice;
import com.tools20022.repository.choice.OtherIdentification3Choice;
import com.tools20022.repository.choice.OtherIdentification4Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to a non-standardised identification, such as a
 * proprietary party identification or account identification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="GenericIdentification"
 * src="doc-files/GenericIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
 * GenericIdentification.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForContactPoint
 * GenericIdentification.IdentificationForContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccount
 * GenericIdentification.IdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPartyIdentification
 * GenericIdentification.RelatedPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IssueDate
 * GenericIdentification.IssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#ExpiryDate
 * GenericIdentification.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Scheme
 * GenericIdentification.Scheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForSecuritiesCertificate
 * GenericIdentification.IdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForLot
 * GenericIdentification.IdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#PartyRole
 * GenericIdentification.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForCashProceedsIncome
 * GenericIdentification.IdentificationForCashProceedsIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedStatusReason
 * GenericIdentification.RelatedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForBankTransaction
 * GenericIdentification.IdentificationForBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccountCostReferencePattern
 * GenericIdentification.IdentificationForAccountCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Account
 * GenericIdentification.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSystemIdentification
 * GenericIdentification.RelatedSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInterestName
 * GenericIdentification.IdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCashAccountService
 * GenericIdentification.RelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInvestmentFundClass
 * GenericIdentification.IdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedLocation
 * GenericIdentification.IdentifiedLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSecuritiesIdentification
 * GenericIdentification.RelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedDocument
 * GenericIdentification.IdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPurchaseOrder
 * GenericIdentification.RelatedPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCertificate
 * GenericIdentification.RelatedCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#FundClassification
 * InvestmentFundClass.FundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#GenericIdentification
 * SecuritiesIdentification.GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#GenericIdentification
 * InformationPartyRole.GenericIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#Identification
 * ContactPoint.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
 * PartyIdentificationInformation.OtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Type Account.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#ProprietaryIdentification
 * AccountIdentification.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#CostReferencePattern
 * AccountIdentification.CostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Identification
 * Location.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Identification
 * Scheme.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
 * Document.DocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
 * StatusReason.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#Identification
 * SystemIdentification.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotNumber
 * LotBreakdown.LotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#Identification
 * CashAccountService.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#Number
 * SecuritiesCertificate.Number}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestName
 * Interest.InterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomeType
 * CashProceedsDefinition.IncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#ProprietaryIdentification
 * BankTransaction.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#Identification
 * PurchaseOrder.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Certificate
 * RegisteredContract.Certificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification1Choice#Proprietary
 * OtherIdentification1Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification46#Type
 * GenericIdentification46.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification14#Type
 * GenericIdentification14.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification21#Type
 * GenericIdentification21.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification26#Type
 * GenericIdentification26.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#AllocationIdentification
 * PreAllocation1.AllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#IndividualAllocationIdentification
 * PreAllocation1.IndividualAllocationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32#Type
 * GenericIdentification32.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification35#Type
 * GenericIdentification35.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification31#Type
 * GenericIdentification31.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification33#Type
 * GenericIdentification33.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversedStatus1#DataSourceScheme
 * ReversedStatus1.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectedCancellationStatusReason1Choice#DataSourceScheme
 * RejectedCancellationStatusReason1Choice.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#IssuerCountry
 * GenericIdentification55.IssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification2Choice#Proprietary
 * OtherIdentification2Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification58#Type
 * GenericIdentification58.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification59#Type
 * GenericIdentification59.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification61#Type
 * GenericIdentification61.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification53#Type
 * GenericIdentification53.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification71#Type
 * GenericIdentification71.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification73#Type
 * GenericIdentification73.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification74#Type
 * GenericIdentification74.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification70#Type
 * GenericIdentification70.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification75#Type
 * GenericIdentification75.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification76#Type
 * GenericIdentification76.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification77#Type
 * GenericIdentification77.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification78#Type
 * GenericIdentification78.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification80#Type
 * GenericIdentification80.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#IssuerCountry
 * AlternateIdentification4.IssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification4Choice#Proprietary
 * OtherIdentification4Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification81#IdentificationType
 * GenericIdentification81.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReversedStatus2Choice#DataSourceScheme
 * ReversedStatus2Choice.DataSourceScheme}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#CareOf
 * PostalAddress21.CareOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#IssuerCountry
 * GenericIdentification82.IssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification3Choice#Proprietary
 * OtherIdentification3Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification85#Type
 * GenericIdentification85.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification89#Type
 * GenericIdentification89.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification94#Type
 * GenericIdentification94.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification90#Type
 * GenericIdentification90.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification92#Type
 * GenericIdentification92.Type}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
 * SimpleIdentificationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification1
 * GenericIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification7
 * GenericIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference2
 * AdditionalReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference3
 * AdditionalReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification8
 * GenericIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification9
 * GenericIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification13
 * GenericIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification20
 * GenericIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification25
 * GenericIdentification25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification47
 * GenericIdentification47}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OtherIdentification1Choice
 * OtherIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification44
 * GenericIdentification44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification41
 * GenericIdentification41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification46
 * GenericIdentification46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification10
 * GenericIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification3
 * GenericIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation2
 * SimpleIdentificationInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification4
 * GenericIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReferences
 * AdditionalReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification19
 * GenericIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification24
 * GenericIdentification24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification14
 * GenericIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification37
 * GenericIdentification37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification21
 * GenericIdentification21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification23
 * GenericIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification18
 * GenericIdentification18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification39
 * GenericIdentification39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification26
 * GenericIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification27
 * GenericIdentification27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification22
 * GenericIdentification22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4
 * SimpleIdentificationInformation4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation1
 * SimpleIdentificationInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification28
 * GenericIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification6
 * GenericIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification5
 * GenericIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification34
 * GenericIdentification34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification38
 * GenericIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification29
 * GenericIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification36
 * GenericIdentification36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1
 * ProprietaryBankTransactionCodeStructure1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32
 * GenericIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification35
 * GenericIdentification35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification48
 * GenericIdentification48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification31
 * GenericIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification33
 * GenericIdentification33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification2
 * GenericIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification11
 * GenericIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification16
 * GenericIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification30
 * GenericIdentification30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1
 * BillingSubServiceIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1
 * BillingServiceCommonIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference4
 * AdditionalReference4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification12
 * GenericIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RestrictedIdentification2
 * RestrictedIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RestrictedIdentification1
 * RestrictedIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification17
 * GenericIdentification17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference5
 * AdditionalReference5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation3
 * SimpleIdentificationInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification40
 * GenericIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification15
 * GenericIdentification15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification42
 * GenericIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification49
 * GenericIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification51
 * GenericIdentification51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification55
 * GenericIdentification55}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OtherIdentification2Choice
 * OtherIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification56
 * GenericIdentification56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification58
 * GenericIdentification58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification65
 * GenericIdentification65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification63
 * GenericIdentification63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification66
 * GenericIdentification66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification62
 * GenericIdentification62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification60
 * GenericIdentification60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification64
 * GenericIdentification64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification59
 * GenericIdentification59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification61
 * GenericIdentification61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification67
 * GenericIdentification67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification53
 * GenericIdentification53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification71
 * GenericIdentification71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification73
 * GenericIdentification73}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification74
 * GenericIdentification74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification72
 * GenericIdentification72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification70
 * GenericIdentification70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification75
 * GenericIdentification75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification76
 * GenericIdentification76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification77
 * GenericIdentification77}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference6
 * AdditionalReference6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification78
 * GenericIdentification78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification80
 * GenericIdentification80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification4
 * AlternateIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OtherIdentification4Choice
 * OtherIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference7
 * AdditionalReference7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification81
 * GenericIdentification81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification82
 * GenericIdentification82}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OtherIdentification3Choice
 * OtherIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification84
 * GenericIdentification84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification85
 * GenericIdentification85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification86
 * GenericIdentification86}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification144
 * GenericIdentification144}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification163
 * GenericIdentification163}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification89
 * GenericIdentification89}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification79
 * GenericIdentification79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification94
 * GenericIdentification94}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification90
 * GenericIdentification90}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification93
 * GenericIdentification93}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification92
 * GenericIdentification92}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference8
 * AdditionalReference8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification164
 * GenericIdentification164}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference9
 * AdditionalReference9}</li>
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
 * "GenericIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to a non-standardised identification, such as a proprietary party identification or account identification."
 * </li>
 * </ul>
 */
public class GenericIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name or number assigned by an entity to enable recognition of that
	 * entity, for example account identifier, identification assigned by a
	 * provider to identify its customers.
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
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#Identification
	 * AlternateSecurityIdentification3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation#Identification
	 * SimpleIdentificationInformation.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#Identification
	 * GenericIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification3#Issuer
	 * AccountIdentification3.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#Reference
	 * AdditionalReference2.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#Reference
	 * AdditionalReference3.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#Identification
	 * AlternateSecurityIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification8#Identification
	 * GenericIdentification8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#Identification
	 * GenericIdentification9.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#ClientIdentification
	 * InvestmentAccountOwnershipInformation5.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#ClientIdentification
	 * InvestmentAccountOwnershipInformation2.ClientIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData#Identification
	 * BranchData.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate2#MandateIdentification
	 * DirectDebitMandate2.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#MandateIdentification
	 * DirectDebitMandate3.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#MandateIdentification
	 * DirectDebitMandate4.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#Identification
	 * GenericIdentification13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20#Identification
	 * GenericIdentification20.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification25#Identification
	 * GenericIdentification25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47#Identification
	 * GenericIdentification47.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#HoldingCertificateNumber
	 * BlockedHoldingDetails1.HoldingCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification44#Identification
	 * GenericIdentification44.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification41#Identification
	 * GenericIdentification41.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#ValidatingParty
	 * PartyProfileInformation2.ValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#CheckingParty
	 * PartyProfileInformation2.CheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#ResponsibleParty
	 * PartyProfileInformation2.ResponsibleParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#ClientIdentification
	 * InvestmentAccountOwnershipInformation6.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification46#Identification
	 * GenericIdentification46.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification10#Identification
	 * GenericIdentification10.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#ClientIdentification
	 * InvestmentAccountOwnershipInformation3.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#ClientIdentification
	 * InvestmentAccountOwnershipInformation4.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#ClientIdentification
	 * InvestmentAccountOwnershipInformation7.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#MemberIdentification
	 * ClearingSystemMemberIdentification2.MemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification3#Identification
	 * GenericIdentification3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#Identification
	 * GenericFinancialIdentification1.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#Identification
	 * BranchData2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation2#Identification
	 * SimpleIdentificationInformation2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#Identification
	 * GenericAccountIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification4#Identification
	 * GenericIdentification4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#Identification
	 * GenericOrganisationIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#Identification
	 * GenericPersonIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences#Reference
	 * AdditionalReferences.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13#Identification
	 * SecuritiesAccount13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19#Identification
	 * GenericIdentification19.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount17#Identification
	 * SecuritiesAccount17.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification24#Identification
	 * GenericIdentification24.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification2#Identification
	 * GenericOrganisationIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification1#Identification
	 * AlternateIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#Identification
	 * OtherIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification14#Identification
	 * GenericIdentification14.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37#Identification
	 * GenericIdentification37.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3#Identification
	 * SafekeepingPlaceTypeAndText3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification21#Identification
	 * GenericIdentification21.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1#AlternateIdentification
	 * AlternatePartyIdentification1.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2#AlternateIdentification
	 * AlternatePartyIdentification2.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate1#Number
	 * SecuritiesCertificate1.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2#Identification
	 * OtherIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification23#Identification
	 * GenericIdentification23.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification18#Identification
	 * GenericIdentification18.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification39#Identification
	 * GenericIdentification39.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4#Identification
	 * SafekeepingPlaceTypeAndText4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification26#Identification
	 * GenericIdentification26.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3#AlternateIdentification
	 * AlternatePartyIdentification3.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#Number
	 * SecuritiesCertificate2.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification27#Identification
	 * GenericIdentification27.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#Identification
	 * DocumentIdentification11.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#Identification
	 * SafekeepingPlaceTypeAndText2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#Identification
	 * DocumentIdentification16.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification2#Identification
	 * AlternateIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5#Identification
	 * SafekeepingPlaceTypeAndText5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9#Identification
	 * DocumentIdentification9.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice#AccountServicerDocumentIdentification
	 * DocumentIdentification1Choice.AccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice#AccountOwnerDocumentIdentification
	 * DocumentIdentification1Choice.AccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification14#Identification
	 * DocumentIdentification14.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification17#Identification
	 * DocumentIdentification17.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification2Choice#AccountServicerDocumentIdentification
	 * DocumentIdentification2Choice.AccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification2Choice#AccountOwnerDocumentIdentification
	 * DocumentIdentification2Choice.AccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification21#Identification
	 * DocumentIdentification21.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#Identification
	 * DocumentIdentification12.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15#Identification
	 * DocumentIdentification15.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#Identification
	 * DocumentIdentification13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#Identification
	 * DocumentIdentification18.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification19#Identification
	 * DocumentIdentification19.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification20#Identification
	 * DocumentIdentification20.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification3#Identification
	 * OtherIdentification3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount11#Identification
	 * SecuritiesAccount11.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification22#Identification
	 * GenericIdentification22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount2#Identification
	 * SecuritiesAccount2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount14#Identification
	 * SecuritiesAccount14.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount15#Identification
	 * SecuritiesAccount15.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4#Identification
	 * SimpleIdentificationInformation4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation1#Identification
	 * SimpleIdentificationInformation1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification28#Identification
	 * GenericIdentification28.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount16#Identification
	 * SecuritiesAccount16.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification34#Identification
	 * GenericIdentification34.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification38#Identification
	 * GenericIdentification38.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification29#Identification
	 * GenericIdentification29.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#AlternateIdentification
	 * AlternatePartyIdentification5.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#AlternateIdentification
	 * AlternatePartyIdentification6.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount3#Identification
	 * SecuritiesAccount3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#PriceSource
	 * FinancialInstrumentStipulations.PriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36#Identification
	 * GenericIdentification36.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#PriceSource
	 * FinancialInstrumentStipulations2.PriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1#Code
	 * ProprietaryBankTransactionCodeStructure1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1#Identification
	 * OperationMandate1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1#ReferredDocumentNumber
	 * ReferredDocumentInformation1.ReferredDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification2#Identification
	 * AlternateSecurityIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#Number
	 * ReferredDocumentInformation3.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#Identification
	 * GenericIdentification32.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#ManufacturerIdentification
	 * PointOfInteractionComponent1.ManufacturerIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document9#Identification
	 * Document9.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#MandateIdentification
	 * MandateInformation1.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate1#MandateIdentification
	 * Mandate1.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#MandateIdentification
	 * MandateInformation3.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate3#MandateIdentification
	 * Mandate3.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#MandateIdentification
	 * MandateInformation2.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate2#MandateIdentification
	 * Mandate2.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate4#MandateIdentification
	 * Mandate4.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#MatchingSystemUniqueReference
	 * TradeData1.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData10#StatusOriginator
	 * TradeData10.StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NameAndAddress8#AlternativeIdentifier
	 * NameAndAddress8.AlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#ReportingJurisdiction
	 * RegulatoryReporting1.ReportingJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#ExecutionVenue
	 * RegulatoryReporting1.ExecutionVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement2#RelatedReference
	 * TradeAgreement2.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement4#RelatedReference
	 * TradeAgreement4.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification1#AccountIdentificationWithCustodian
	 * FundIdentification1.AccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification2#AccountIdentificationWithCustodian
	 * FundIdentification2.AccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification3#AccountIdentificationWithCustodian
	 * FundIdentification3.AccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification4#AccountIdentificationWithCustodian
	 * FundIdentification4.AccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement5#RelatedReference
	 * TradeAgreement5.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#StatusOriginator
	 * TradeData9.StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#StatusOriginator
	 * TradeData7.StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35#Identification
	 * GenericIdentification35.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#ManufacturerIdentification
	 * PointOfInteractionComponent2.ManufacturerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentIdentification1#ProviderIdentification
	 * PointOfInteractionComponentIdentification1.ProviderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification48#Identification
	 * GenericIdentification48.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#Assigner
	 * PointOfInteractionComponentAssessment1.Assigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification31#Identification
	 * GenericIdentification31.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#CashierIdentification
	 * SaleContext1.CashierIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderIdentification1#CardholderIdentificationValue
	 * CardholderIdentification1.CardholderIdentificationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification33#Identification
	 * GenericIdentification33.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters3#SecuritiesSettlementSystemIdentification
	 * FundSettlementParameters3.SecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification11#Identification
	 * GenericIdentification11.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#SecuritiesSettlementSystemIdentification
	 * FundSettlementParameters4.SecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#DocumentReferenceNumber
	 * StructuredRemittanceInformation2.DocumentReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#Identification
	 * AlternateFinancialInstrumentIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition#AccountIdentification
	 * EligiblePosition.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3#AccountIdentification
	 * SafekeepingAccount3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#AccountIdentification
	 * SafekeepingAccount4.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#AccountIdentification
	 * MeetingInstructionDetailedStatus.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition1#AccountIdentification
	 * EligiblePosition1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#Identification
	 * DocumentIdentification8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice#CashAccountIdentification
	 * AccountIdentification2Choice.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice#SecuritiesAccountIdentification
	 * AccountIdentification2Choice.SecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount7#AccountIdentification
	 * SecuritiesAccount7.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#AccountIdentification
	 * SecuritiesAccount9.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification16#Identification
	 * GenericIdentification16.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#SecuritiesAccountIdentification
	 * ProceedsDelivery1.SecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#AccountIdentification
	 * SecuritiesAccount12.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#AccountIdentification
	 * CorporateActionMovement1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#AccountIdentification
	 * SecuritiesAccount8.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#AccountIdentification
	 * SecuritiesAccount10.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#SecuritiesAccountIdentification
	 * SecuritiesAccount6.SecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification1#Identification
	 * IdentificationModification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#Identification
	 * IdentificationModification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#StatusOriginator
	 * TradeStatus1.StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#DocumentNumber
	 * DocumentGeneralInformation1.DocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#DocumentNumber
	 * ReferredDocumentInformation2.DocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#DocumentNumber
	 * OriginalInvoiceInformation1.DocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation1#Identification
	 * LegalOrganisation1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#Identification
	 * InvoiceHeader1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#Identification
	 * DocumentIdentification22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#DocumentNumber
	 * DocumentGeneralInformation2.DocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#QuotationDocumentIdentification
	 * TradeAgreement6.QuotationDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#ContractDocumentIdentification
	 * TradeAgreement6.ContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#BuyerOrderIdentificationDocument
	 * TradeAgreement6.BuyerOrderIdentificationDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7#Identification
	 * DocumentIdentification7.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#LetterOfCreditReferencedDocument
	 * TradeSettlement1.LetterOfCreditReferencedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23#Identification
	 * DocumentIdentification23.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#DeliveryNoteIdentification
	 * LineItem10.DeliveryNoteIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#Identification
	 * DocumentIdentification3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5#Identification
	 * DocumentIdentification5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#Identification
	 * DocumentIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AirportDescription1#AirportName
	 * AirportDescription1.AirportName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#Identification
	 * DocumentIdentification4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification6#Identification
	 * DocumentIdentification6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#Identification
	 * DocumentIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#Identification
	 * DocumentIdentification10.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#TransitLocation
	 * MultimodalTransport2.TransitLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceIdentification1#InvoiceNumber
	 * InvoiceIdentification1.InvoiceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#InsuranceDocumentIdentification
	 * InsuranceDataSet1.InsuranceDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#CertificateIdentification
	 * CertificateDataSet1.CertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#CertificateIdentification
	 * OtherCertificateDataSet1.CertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#Identification
	 * GenericIdentification30.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement2#AgreementIdentification
	 * Agreement2.AgreementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#Identification
	 * AccountIdentification5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#AlternateIdentification
	 * AlternatePartyIdentification4.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#Issuer
	 * BillingSubServiceIdentification1.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#Identification
	 * BillingSubServiceIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1#Identification
	 * BillingServiceCommonIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#InvoiceNumber
	 * BillingTaxRegion1.InvoiceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#StatementIdentification
	 * BillingStatement1.StatementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#Reference
	 * AdditionalReference4.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount5#Identification
	 * SecuritiesAccount5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification12#Identification
	 * GenericIdentification12.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RestrictedIdentification2#Identification
	 * RestrictedIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RestrictedIdentification1#Identification
	 * RestrictedIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification17#Identification
	 * GenericIdentification17.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference5#Reference
	 * AdditionalReference5.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation3#Identification
	 * SimpleIdentificationInformation3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#Identification
	 * AlternateSecurityIdentification4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification40#Identification
	 * GenericIdentification40.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification15#Identification
	 * GenericIdentification15.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PriceSource
	 * Debt2.PriceSource}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#Identification
	 * Agreement1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#Identification
	 * DocumentIdentification27.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#Identification
	 * SafekeepingPlaceTypeAndText1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#BillingIdentification
	 * BillingReport1.BillingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#BillingIdentification
	 * BillingCancellationReport1.BillingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#BillingIdentification
	 * BillingSearchCriteria1.BillingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#ClientIdentification
	 * InvestmentAccountOwnershipInformation8.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#ClientIdentification
	 * InvestmentAccountOwnershipInformation9.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#ValidatingParty
	 * PartyProfileInformation3.ValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#CheckingParty
	 * PartyProfileInformation3.CheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#ResponsibleParty
	 * PartyProfileInformation3.ResponsibleParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1#Issuer
	 * DocumentLineType1.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#RemittanceIdentification
	 * RemittanceInformation8.RemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#Identification
	 * DocumentLineInformation1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount22#Identification
	 * SecuritiesAccount22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#DataSetIdentification
	 * CertificateDataSet2.DataSetIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#CertificateIdentification
	 * CertificateDataSet2.CertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification49#Identification
	 * GenericIdentification49.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification51#Identification
	 * GenericIdentification51.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#ExecutionVenue
	 * RegulatoryReporting4.ExecutionVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1#ReportingJurisdiction
	 * CounterpartySideTransactionReporting1.ReportingJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1#ReportingJurisdiction
	 * TradingSideTransactionReporting1.ReportingJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2#FullLocalLanguageSecurityName
	 * UpdatedAdditionalInformation6SD2.FullLocalLanguageSecurityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2SD1#LocalLanguageSecurityName
	 * OtherIdentification2SD1.LocalLanguageSecurityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#ClientIdentification
	 * InvestmentAccountOwnershipInformation10.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#Identification
	 * GenericIdentification55.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#ClientIdentification
	 * InvestmentAccountOwnershipInformation11.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#ValidatingParty
	 * PartyProfileInformation4.ValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#CheckingParty
	 * PartyProfileInformation4.CheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#ResponsibleParty
	 * PartyProfileInformation4.ResponsibleParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate7#MandateIdentification
	 * Mandate7.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate6#MandateIdentification
	 * Mandate6.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate5#MandateIdentification
	 * Mandate5.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#Number
	 * ReferredDocumentInformation6.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#CertificateIdentification
	 * OtherCertificateDataSet2.CertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification56#Identification
	 * GenericIdentification56.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification58#Identification
	 * GenericIdentification58.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification4#Identification
	 * OtherIdentification4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#AccountIdentification
	 * SafekeepingAccount6.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification65#Identification
	 * GenericIdentification65.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification63#Identification
	 * GenericIdentification63.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification66#Identification
	 * GenericIdentification66.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification62#Identification
	 * GenericIdentification62.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification60#Identification
	 * GenericIdentification60.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification64#Identification
	 * GenericIdentification64.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification59#Identification
	 * GenericIdentification59.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification61#Identification
	 * GenericIdentification61.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification67#Identification
	 * GenericIdentification67.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53#Identification
	 * GenericIdentification53.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71#Identification
	 * GenericIdentification71.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73#Identification
	 * GenericIdentification73.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification74#Identification
	 * GenericIdentification74.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72#Identification
	 * GenericIdentification72.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification70#Identification
	 * GenericIdentification70.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification75#Identification
	 * GenericIdentification75.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification76#Identification
	 * GenericIdentification76.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#LetterIdentifier
	 * BusinessLetter1.LetterIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#ItemListIdentifier
	 * QualifiedDocumentInformation1.ItemListIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#ItemIdentifier
	 * QualifiedDocumentInformation1.ItemIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1#Processor
	 * ATMCommandIdentification1.Processor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification77#Identification
	 * GenericIdentification77.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#Reference
	 * AdditionalReference6.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount24#Identification
	 * SecuritiesAccount24.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#AlternateIdentification
	 * AlternatePartyIdentification7.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification78#Identification
	 * GenericIdentification78.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#Identification
	 * SafekeepingPlaceTypeAndText6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#Identification
	 * DocumentIdentification29.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#EntryIdentification
	 * SupportingDocumentEntry1.EntryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#DocumentNumber
	 * DocumentGeneralInformation3.DocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#ContractDocumentIdentification
	 * TradeContract1.ContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#InterestScheduleIdentification
	 * InterestPaymentDateRange1.InterestScheduleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#Identification
	 * LegalOrganisation2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#Identification
	 * DocumentIdentification28.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#CertificateRecordIdentification
	 * TransactionCertificateRecord1.CertificateRecordIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#Code
	 * ContractClosureReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#Proprietary
	 * ContractClosureReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount26#Identification
	 * SecuritiesAccount26.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4#Number
	 * SecuritiesCertificate4.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8#Identification
	 * SafekeepingPlaceTypeAndText8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount25#Identification
	 * SecuritiesAccount25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification80#Identification
	 * GenericIdentification80.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#RemittanceIdentification
	 * RemittanceInformation12.RemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#Number
	 * ReferredDocumentInformation7.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#StatementIdentification
	 * BillingStatement2.StatementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#Identification
	 * AlternateIdentification4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31#Identification
	 * DocumentIdentification31.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#Identification
	 * DocumentIdentification32.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification33#Identification
	 * DocumentIdentification33.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice#AccountServicerDocumentIdentification
	 * DocumentIdentification3Choice.AccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice#AccountOwnerDocumentIdentification
	 * DocumentIdentification3Choice.AccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#Reference
	 * AdditionalReference7.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification81#Identification
	 * GenericIdentification81.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#MandateIdentification
	 * DirectDebitMandate5.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#Identification
	 * AlternateSecurityIdentification7.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#ClientIdentification
	 * InvestmentAccountOwnershipInformation12.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#Identification
	 * GenericIdentification82.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#ValidatingParty
	 * PartyProfileInformation5.ValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#CheckingParty
	 * PartyProfileInformation5.CheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#ResponsibleParty
	 * PartyProfileInformation5.ResponsibleParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#ClientIdentification
	 * InvestmentAccountOwnershipInformation13.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#HoldingCertificateNumber
	 * BlockedHoldingDetails2.HoldingCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#AgreementIdentification
	 * Agreement4.AgreementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#AlternateIdentification
	 * AlternatePartyIdentification8.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38#Identification
	 * DocumentIdentification38.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37#Identification
	 * DocumentIdentification37.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification34#Identification
	 * DocumentIdentification34.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification84#Identification
	 * GenericIdentification84.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification4Choice#AccountServicerDocumentIdentification
	 * DocumentIdentification4Choice.AccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification4Choice#AccountOwnerDocumentIdentification
	 * DocumentIdentification4Choice.AccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText9#Identification
	 * SafekeepingPlaceTypeAndText9.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification85#Identification
	 * GenericIdentification85.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText15#Identification
	 * SafekeepingPlaceTypeAndText15.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9#AlternateIdentification
	 * AlternatePartyIdentification9.AlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification86#Identification
	 * GenericIdentification86.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount33#Identification
	 * SecuritiesAccount33.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount27#Identification
	 * SecuritiesAccount27.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate5#Number
	 * SecuritiesCertificate5.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification144#Identification
	 * GenericIdentification144.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification163#Identification
	 * GenericIdentification163.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount34#Identification
	 * SecuritiesAccount34.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification49#Identification
	 * DocumentIdentification49.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification89#Identification
	 * GenericIdentification89.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25#Identification
	 * SafekeepingPlaceTypeAndText25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification79#Identification
	 * GenericIdentification79.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#CashierIdentification
	 * SaleContext2.CashierIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification94#Identification
	 * GenericIdentification94.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#Identification
	 * GenericIdentification90.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification93#Identification
	 * GenericIdentification93.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification92#Identification
	 * GenericIdentification92.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1#AccountServicerIdentification
	 * GenericIdentificationSD1.AccountServicerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1#AccountOwnerIdentification
	 * GenericIdentificationSD1.AccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#Identification
	 * InvoiceHeader2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#QuotationDocumentIdentification
	 * TradeAgreement13.QuotationDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#ContractDocumentIdentification
	 * TradeAgreement13.ContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#BuyerOrderIdentificationDocument
	 * TradeAgreement13.BuyerOrderIdentificationDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#DeliveryNoteIdentification
	 * LineItem16.DeliveryNoteIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketClaimDetailsSD1#AccountServicerIdentification
	 * MarketClaimDetailsSD1.AccountServicerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketClaimDetailsSD1#AccountOwnerIdentification
	 * MarketClaimDetailsSD1.AccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueIdentification2#Identification
	 * TradingVenueIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#Reference
	 * AdditionalReference8.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#SecuritiesSettlementSystemIdentification
	 * FundSettlementParameters11.SecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification164#Identification
	 * GenericIdentification164.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#SecuritiesSettlementSystemIdentification
	 * FundSettlementParameters12.SecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#ClientIdentification
	 * InvestmentAccountOwnershipInformation15.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#ClientIdentification
	 * InvestmentAccountOwnershipInformation14.ClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#MandateIdentification
	 * DirectDebitMandate6.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#Reference
	 * AdditionalReference9.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#ExecutionVenue
	 * RegulatoryReporting6.ExecutionVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#StatusOriginator
	 * TradeData14.StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#StatusOriginator
	 * TradeData12.StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#StatusOriginator
	 * TradeData15.StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#MandateIdentification
	 * Mandate10.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#RemittanceIdentification
	 * RemittanceInformation13.RemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#MandateIdentification
	 * Mandate9.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#MandateIdentification
	 * Mandate11.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#Number
	 * ReferredMandateDocument1.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#MandateIdentification
	 * Mandate8.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#StatusOriginator
	 * TradeData16.StatusOriginator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification3.Identification, com.tools20022.repository.msg.SimpleIdentificationInformation.Identification,
					com.tools20022.repository.msg.GenericIdentification1.Identification, com.tools20022.repository.msg.AccountIdentification3.Issuer, com.tools20022.repository.msg.AdditionalReference2.Reference,
					com.tools20022.repository.msg.AdditionalReference3.Reference, com.tools20022.repository.msg.AlternateSecurityIdentification1.Identification, com.tools20022.repository.msg.GenericIdentification8.Identification,
					com.tools20022.repository.msg.GenericIdentification9.Identification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.ClientIdentification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.ClientIdentification, com.tools20022.repository.msg.BranchData.Identification,
					com.tools20022.repository.msg.DirectDebitMandate2.MandateIdentification, com.tools20022.repository.msg.DirectDebitMandate3.MandateIdentification, com.tools20022.repository.msg.DirectDebitMandate4.MandateIdentification,
					com.tools20022.repository.msg.GenericIdentification13.Identification, com.tools20022.repository.msg.GenericIdentification20.Identification, com.tools20022.repository.msg.GenericIdentification25.Identification,
					com.tools20022.repository.msg.GenericIdentification47.Identification, com.tools20022.repository.msg.BlockedHoldingDetails1.HoldingCertificateNumber, com.tools20022.repository.msg.GenericIdentification44.Identification,
					com.tools20022.repository.msg.GenericIdentification41.Identification, com.tools20022.repository.msg.PartyProfileInformation2.ValidatingParty, com.tools20022.repository.msg.PartyProfileInformation2.CheckingParty,
					com.tools20022.repository.msg.PartyProfileInformation2.ResponsibleParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.ClientIdentification,
					com.tools20022.repository.msg.GenericIdentification46.Identification, com.tools20022.repository.msg.GenericIdentification10.Identification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.ClientIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.ClientIdentification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.ClientIdentification, com.tools20022.repository.msg.ClearingSystemMemberIdentification2.MemberIdentification,
					com.tools20022.repository.msg.GenericIdentification3.Identification, com.tools20022.repository.msg.GenericFinancialIdentification1.Identification, com.tools20022.repository.msg.BranchData2.Identification,
					com.tools20022.repository.msg.SimpleIdentificationInformation2.Identification, com.tools20022.repository.msg.GenericAccountIdentification1.Identification,
					com.tools20022.repository.msg.GenericIdentification4.Identification, com.tools20022.repository.msg.GenericOrganisationIdentification1.Identification,
					com.tools20022.repository.msg.GenericPersonIdentification1.Identification, com.tools20022.repository.msg.AdditionalReferences.Reference, com.tools20022.repository.msg.SecuritiesAccount13.Identification,
					com.tools20022.repository.msg.GenericIdentification19.Identification, com.tools20022.repository.msg.SecuritiesAccount17.Identification, com.tools20022.repository.msg.GenericIdentification24.Identification,
					com.tools20022.repository.msg.GenericOrganisationIdentification2.Identification, com.tools20022.repository.msg.AlternateIdentification1.Identification, com.tools20022.repository.msg.OtherIdentification1.Identification,
					com.tools20022.repository.msg.GenericIdentification14.Identification, com.tools20022.repository.msg.GenericIdentification37.Identification, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3.Identification,
					com.tools20022.repository.msg.GenericIdentification21.Identification, com.tools20022.repository.msg.AlternatePartyIdentification1.AlternateIdentification,
					com.tools20022.repository.msg.AlternatePartyIdentification2.AlternateIdentification, com.tools20022.repository.msg.SecuritiesCertificate1.Number, com.tools20022.repository.msg.OtherIdentification2.Identification,
					com.tools20022.repository.msg.GenericIdentification23.Identification, com.tools20022.repository.msg.GenericIdentification18.Identification, com.tools20022.repository.msg.GenericIdentification39.Identification,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4.Identification, com.tools20022.repository.msg.GenericIdentification26.Identification,
					com.tools20022.repository.msg.AlternatePartyIdentification3.AlternateIdentification, com.tools20022.repository.msg.SecuritiesCertificate2.Number, com.tools20022.repository.msg.GenericIdentification27.Identification,
					com.tools20022.repository.msg.DocumentIdentification11.Identification, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2.Identification, com.tools20022.repository.msg.DocumentIdentification16.Identification,
					com.tools20022.repository.msg.AlternateIdentification2.Identification, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5.Identification, com.tools20022.repository.msg.DocumentIdentification9.Identification,
					com.tools20022.repository.choice.DocumentIdentification1Choice.AccountServicerDocumentIdentification, com.tools20022.repository.choice.DocumentIdentification1Choice.AccountOwnerDocumentIdentification,
					com.tools20022.repository.msg.DocumentIdentification14.Identification, com.tools20022.repository.msg.DocumentIdentification17.Identification,
					com.tools20022.repository.choice.DocumentIdentification2Choice.AccountServicerDocumentIdentification, com.tools20022.repository.choice.DocumentIdentification2Choice.AccountOwnerDocumentIdentification,
					com.tools20022.repository.msg.DocumentIdentification21.Identification, com.tools20022.repository.msg.DocumentIdentification12.Identification, com.tools20022.repository.msg.DocumentIdentification15.Identification,
					com.tools20022.repository.msg.DocumentIdentification13.Identification, com.tools20022.repository.msg.DocumentIdentification18.Identification, com.tools20022.repository.msg.DocumentIdentification19.Identification,
					com.tools20022.repository.msg.DocumentIdentification20.Identification, com.tools20022.repository.msg.OtherIdentification3.Identification, com.tools20022.repository.msg.SecuritiesAccount11.Identification,
					com.tools20022.repository.msg.GenericIdentification22.Identification, com.tools20022.repository.msg.SecuritiesAccount2.Identification, com.tools20022.repository.msg.SecuritiesAccount14.Identification,
					com.tools20022.repository.msg.SecuritiesAccount15.Identification, com.tools20022.repository.msg.SimpleIdentificationInformation4.Identification,
					com.tools20022.repository.msg.SimpleIdentificationInformation1.Identification, com.tools20022.repository.msg.GenericIdentification28.Identification, com.tools20022.repository.msg.SecuritiesAccount16.Identification,
					com.tools20022.repository.msg.GenericIdentification34.Identification, com.tools20022.repository.msg.GenericIdentification38.Identification, com.tools20022.repository.msg.GenericIdentification29.Identification,
					com.tools20022.repository.msg.AlternatePartyIdentification5.AlternateIdentification, com.tools20022.repository.msg.AlternatePartyIdentification6.AlternateIdentification,
					com.tools20022.repository.msg.SecuritiesAccount3.Identification, com.tools20022.repository.msg.FinancialInstrumentStipulations.PriceSource, com.tools20022.repository.msg.GenericIdentification36.Identification,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.PriceSource, com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1.Code, com.tools20022.repository.msg.OperationMandate1.Identification,
					com.tools20022.repository.msg.ReferredDocumentInformation1.ReferredDocumentNumber, com.tools20022.repository.msg.AlternateSecurityIdentification2.Identification,
					com.tools20022.repository.msg.ReferredDocumentInformation3.Number, com.tools20022.repository.msg.GenericIdentification32.Identification,
					com.tools20022.repository.msg.PointOfInteractionComponent1.ManufacturerIdentification, com.tools20022.repository.msg.Document9.Identification, com.tools20022.repository.msg.MandateInformation1.MandateIdentification,
					com.tools20022.repository.msg.Mandate1.MandateIdentification, com.tools20022.repository.msg.MandateInformation3.MandateIdentification, com.tools20022.repository.msg.Mandate3.MandateIdentification,
					com.tools20022.repository.msg.MandateInformation2.MandateIdentification, com.tools20022.repository.msg.Mandate2.MandateIdentification, com.tools20022.repository.msg.Mandate4.MandateIdentification,
					com.tools20022.repository.msg.TradeData1.MatchingSystemUniqueReference, com.tools20022.repository.msg.TradeData10.StatusOriginator, com.tools20022.repository.msg.NameAndAddress8.AlternativeIdentifier,
					com.tools20022.repository.msg.RegulatoryReporting1.ReportingJurisdiction, com.tools20022.repository.msg.RegulatoryReporting1.ExecutionVenue, com.tools20022.repository.msg.TradeAgreement2.RelatedReference,
					com.tools20022.repository.msg.TradeAgreement4.RelatedReference, com.tools20022.repository.msg.FundIdentification1.AccountIdentificationWithCustodian,
					com.tools20022.repository.msg.FundIdentification2.AccountIdentificationWithCustodian, com.tools20022.repository.msg.FundIdentification3.AccountIdentificationWithCustodian,
					com.tools20022.repository.msg.FundIdentification4.AccountIdentificationWithCustodian, com.tools20022.repository.msg.TradeAgreement5.RelatedReference, com.tools20022.repository.msg.TradeData9.StatusOriginator,
					com.tools20022.repository.msg.TradeData7.StatusOriginator, com.tools20022.repository.msg.GenericIdentification35.Identification, com.tools20022.repository.msg.PointOfInteractionComponent2.ManufacturerIdentification,
					com.tools20022.repository.msg.PointOfInteractionComponentIdentification1.ProviderIdentification, com.tools20022.repository.msg.GenericIdentification48.Identification,
					com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.Assigner, com.tools20022.repository.msg.GenericIdentification31.Identification, com.tools20022.repository.msg.SaleContext1.CashierIdentification,
					com.tools20022.repository.msg.CardholderIdentification1.CardholderIdentificationValue, com.tools20022.repository.msg.GenericIdentification33.Identification,
					com.tools20022.repository.msg.FundSettlementParameters3.SecuritiesSettlementSystemIdentification, com.tools20022.repository.msg.GenericIdentification11.Identification,
					com.tools20022.repository.msg.FundSettlementParameters4.SecuritiesSettlementSystemIdentification, com.tools20022.repository.msg.StructuredRemittanceInformation2.DocumentReferenceNumber,
					com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.Identification, com.tools20022.repository.msg.EligiblePosition.AccountIdentification,
					com.tools20022.repository.msg.SafekeepingAccount3.AccountIdentification, com.tools20022.repository.msg.SafekeepingAccount4.AccountIdentification,
					com.tools20022.repository.msg.MeetingInstructionDetailedStatus.AccountIdentification, com.tools20022.repository.msg.EligiblePosition1.AccountIdentification,
					com.tools20022.repository.msg.DocumentIdentification8.Identification, com.tools20022.repository.choice.AccountIdentification2Choice.CashAccountIdentification,
					com.tools20022.repository.choice.AccountIdentification2Choice.SecuritiesAccountIdentification, com.tools20022.repository.msg.SecuritiesAccount7.AccountIdentification,
					com.tools20022.repository.msg.SecuritiesAccount9.AccountIdentification, com.tools20022.repository.msg.GenericIdentification16.Identification,
					com.tools20022.repository.msg.ProceedsDelivery1.SecuritiesAccountIdentification, com.tools20022.repository.msg.SecuritiesAccount12.AccountIdentification,
					com.tools20022.repository.msg.CorporateActionMovement1.AccountIdentification, com.tools20022.repository.msg.SecuritiesAccount8.AccountIdentification,
					com.tools20022.repository.msg.SecuritiesAccount10.AccountIdentification, com.tools20022.repository.msg.SecuritiesAccount6.SecuritiesAccountIdentification,
					com.tools20022.repository.msg.IdentificationModification1.Identification, com.tools20022.repository.msg.IdentificationModification2.Identification, com.tools20022.repository.msg.TradeStatus1.StatusOriginator,
					com.tools20022.repository.msg.DocumentGeneralInformation1.DocumentNumber, com.tools20022.repository.msg.ReferredDocumentInformation2.DocumentNumber,
					com.tools20022.repository.msg.OriginalInvoiceInformation1.DocumentNumber, com.tools20022.repository.msg.LegalOrganisation1.Identification, com.tools20022.repository.msg.InvoiceHeader1.Identification,
					com.tools20022.repository.msg.DocumentIdentification22.Identification, com.tools20022.repository.msg.DocumentGeneralInformation2.DocumentNumber,
					com.tools20022.repository.msg.TradeAgreement6.QuotationDocumentIdentification, com.tools20022.repository.msg.TradeAgreement6.ContractDocumentIdentification,
					com.tools20022.repository.msg.TradeAgreement6.BuyerOrderIdentificationDocument, com.tools20022.repository.msg.DocumentIdentification7.Identification,
					com.tools20022.repository.msg.TradeSettlement1.LetterOfCreditReferencedDocument, com.tools20022.repository.msg.DocumentIdentification23.Identification,
					com.tools20022.repository.msg.LineItem10.DeliveryNoteIdentification, com.tools20022.repository.msg.DocumentIdentification3.Identification, com.tools20022.repository.msg.DocumentIdentification5.Identification,
					com.tools20022.repository.msg.DocumentIdentification1.Identification, com.tools20022.repository.msg.AirportDescription1.AirportName, com.tools20022.repository.msg.DocumentIdentification4.Identification,
					com.tools20022.repository.msg.DocumentIdentification6.Identification, com.tools20022.repository.msg.DocumentIdentification2.Identification, com.tools20022.repository.msg.DocumentIdentification10.Identification,
					com.tools20022.repository.msg.MultimodalTransport2.TransitLocation, com.tools20022.repository.msg.InvoiceIdentification1.InvoiceNumber, com.tools20022.repository.msg.InsuranceDataSet1.InsuranceDocumentIdentification,
					com.tools20022.repository.msg.CertificateDataSet1.CertificateIdentification, com.tools20022.repository.msg.OtherCertificateDataSet1.CertificateIdentification,
					com.tools20022.repository.msg.GenericIdentification30.Identification, com.tools20022.repository.msg.Agreement2.AgreementIdentification, com.tools20022.repository.msg.AccountIdentification5.Identification,
					com.tools20022.repository.msg.AlternatePartyIdentification4.AlternateIdentification, com.tools20022.repository.msg.BillingSubServiceIdentification1.Issuer,
					com.tools20022.repository.msg.BillingSubServiceIdentification1.Identification, com.tools20022.repository.msg.BillingServiceCommonIdentification1.Identification,
					com.tools20022.repository.msg.BillingTaxRegion1.InvoiceNumber, com.tools20022.repository.msg.BillingStatement1.StatementIdentification, com.tools20022.repository.msg.AdditionalReference4.Reference,
					com.tools20022.repository.msg.SecuritiesAccount5.Identification, com.tools20022.repository.msg.GenericIdentification12.Identification, com.tools20022.repository.msg.RestrictedIdentification2.Identification,
					com.tools20022.repository.msg.RestrictedIdentification1.Identification, com.tools20022.repository.msg.GenericIdentification17.Identification, com.tools20022.repository.msg.AdditionalReference5.Reference,
					com.tools20022.repository.msg.SimpleIdentificationInformation3.Identification, com.tools20022.repository.msg.AlternateSecurityIdentification4.Identification,
					com.tools20022.repository.msg.GenericIdentification40.Identification, com.tools20022.repository.msg.GenericIdentification15.Identification, com.tools20022.repository.msg.Debt2.PriceSource,
					com.tools20022.repository.msg.Agreement1.Identification, com.tools20022.repository.msg.DocumentIdentification27.Identification, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1.Identification,
					com.tools20022.repository.msg.BillingReport1.BillingIdentification, com.tools20022.repository.msg.BillingCancellationReport1.BillingIdentification,
					com.tools20022.repository.msg.BillingSearchCriteria1.BillingIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.ClientIdentification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.ClientIdentification, com.tools20022.repository.msg.PartyProfileInformation3.ValidatingParty,
					com.tools20022.repository.msg.PartyProfileInformation3.CheckingParty, com.tools20022.repository.msg.PartyProfileInformation3.ResponsibleParty, com.tools20022.repository.msg.DocumentLineType1.Issuer,
					com.tools20022.repository.msg.RemittanceInformation8.RemittanceIdentification, com.tools20022.repository.msg.DocumentLineInformation1.Identification, com.tools20022.repository.msg.SecuritiesAccount22.Identification,
					com.tools20022.repository.msg.CertificateDataSet2.DataSetIdentification, com.tools20022.repository.msg.CertificateDataSet2.CertificateIdentification, com.tools20022.repository.msg.GenericIdentification49.Identification,
					com.tools20022.repository.msg.GenericIdentification51.Identification, com.tools20022.repository.msg.RegulatoryReporting4.ExecutionVenue,
					com.tools20022.repository.msg.CounterpartySideTransactionReporting1.ReportingJurisdiction, com.tools20022.repository.msg.TradingSideTransactionReporting1.ReportingJurisdiction,
					com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2.FullLocalLanguageSecurityName, com.tools20022.repository.msg.OtherIdentification2SD1.LocalLanguageSecurityName,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.ClientIdentification, com.tools20022.repository.msg.GenericIdentification55.Identification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.ClientIdentification, com.tools20022.repository.msg.PartyProfileInformation4.ValidatingParty,
					com.tools20022.repository.msg.PartyProfileInformation4.CheckingParty, com.tools20022.repository.msg.PartyProfileInformation4.ResponsibleParty, com.tools20022.repository.msg.Mandate7.MandateIdentification,
					com.tools20022.repository.msg.Mandate6.MandateIdentification, com.tools20022.repository.msg.Mandate5.MandateIdentification, com.tools20022.repository.msg.ReferredDocumentInformation6.Number,
					com.tools20022.repository.msg.OtherCertificateDataSet2.CertificateIdentification, com.tools20022.repository.msg.GenericIdentification56.Identification,
					com.tools20022.repository.msg.GenericIdentification58.Identification, com.tools20022.repository.msg.OtherIdentification4.Identification, com.tools20022.repository.msg.SafekeepingAccount6.AccountIdentification,
					com.tools20022.repository.msg.GenericIdentification65.Identification, com.tools20022.repository.msg.GenericIdentification63.Identification, com.tools20022.repository.msg.GenericIdentification66.Identification,
					com.tools20022.repository.msg.GenericIdentification62.Identification, com.tools20022.repository.msg.GenericIdentification60.Identification, com.tools20022.repository.msg.GenericIdentification64.Identification,
					com.tools20022.repository.msg.GenericIdentification59.Identification, com.tools20022.repository.msg.GenericIdentification61.Identification, com.tools20022.repository.msg.GenericIdentification67.Identification,
					com.tools20022.repository.msg.GenericIdentification53.Identification, com.tools20022.repository.msg.GenericIdentification71.Identification, com.tools20022.repository.msg.GenericIdentification73.Identification,
					com.tools20022.repository.msg.GenericIdentification74.Identification, com.tools20022.repository.msg.GenericIdentification72.Identification, com.tools20022.repository.msg.GenericIdentification70.Identification,
					com.tools20022.repository.msg.GenericIdentification75.Identification, com.tools20022.repository.msg.GenericIdentification76.Identification, com.tools20022.repository.msg.BusinessLetter1.LetterIdentifier,
					com.tools20022.repository.msg.QualifiedDocumentInformation1.ItemListIdentifier, com.tools20022.repository.msg.QualifiedDocumentInformation1.ItemIdentifier,
					com.tools20022.repository.msg.ATMCommandIdentification1.Processor, com.tools20022.repository.msg.GenericIdentification77.Identification, com.tools20022.repository.msg.AdditionalReference6.Reference,
					com.tools20022.repository.msg.SecuritiesAccount24.Identification, com.tools20022.repository.msg.AlternatePartyIdentification7.AlternateIdentification,
					com.tools20022.repository.msg.GenericIdentification78.Identification, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6.Identification, com.tools20022.repository.msg.DocumentIdentification29.Identification,
					com.tools20022.repository.msg.SupportingDocumentEntry1.EntryIdentification, com.tools20022.repository.msg.DocumentGeneralInformation3.DocumentNumber,
					com.tools20022.repository.msg.TradeContract1.ContractDocumentIdentification, com.tools20022.repository.msg.InterestPaymentDateRange1.InterestScheduleIdentification,
					com.tools20022.repository.msg.LegalOrganisation2.Identification, com.tools20022.repository.msg.DocumentIdentification28.Identification,
					com.tools20022.repository.msg.TransactionCertificateRecord1.CertificateRecordIdentification, com.tools20022.repository.choice.ContractClosureReason1Choice.Code,
					com.tools20022.repository.choice.ContractClosureReason1Choice.Proprietary, com.tools20022.repository.msg.SecuritiesAccount26.Identification, com.tools20022.repository.msg.SecuritiesCertificate4.Number,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8.Identification, com.tools20022.repository.msg.SecuritiesAccount25.Identification, com.tools20022.repository.msg.GenericIdentification80.Identification,
					com.tools20022.repository.msg.RemittanceInformation12.RemittanceIdentification, com.tools20022.repository.msg.ReferredDocumentInformation7.Number, com.tools20022.repository.msg.BillingStatement2.StatementIdentification,
					com.tools20022.repository.msg.AlternateIdentification4.Identification, com.tools20022.repository.msg.DocumentIdentification31.Identification, com.tools20022.repository.msg.DocumentIdentification32.Identification,
					com.tools20022.repository.msg.DocumentIdentification33.Identification, com.tools20022.repository.choice.DocumentIdentification3Choice.AccountServicerDocumentIdentification,
					com.tools20022.repository.choice.DocumentIdentification3Choice.AccountOwnerDocumentIdentification, com.tools20022.repository.msg.AdditionalReference7.Reference,
					com.tools20022.repository.msg.GenericIdentification81.Identification, com.tools20022.repository.msg.DirectDebitMandate5.MandateIdentification,
					com.tools20022.repository.msg.AlternateSecurityIdentification7.Identification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.ClientIdentification,
					com.tools20022.repository.msg.GenericIdentification82.Identification, com.tools20022.repository.msg.PartyProfileInformation5.ValidatingParty, com.tools20022.repository.msg.PartyProfileInformation5.CheckingParty,
					com.tools20022.repository.msg.PartyProfileInformation5.ResponsibleParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.ClientIdentification,
					com.tools20022.repository.msg.BlockedHoldingDetails2.HoldingCertificateNumber, com.tools20022.repository.msg.Agreement4.AgreementIdentification,
					com.tools20022.repository.msg.AlternatePartyIdentification8.AlternateIdentification, com.tools20022.repository.msg.DocumentIdentification38.Identification,
					com.tools20022.repository.msg.DocumentIdentification37.Identification, com.tools20022.repository.msg.DocumentIdentification34.Identification, com.tools20022.repository.msg.GenericIdentification84.Identification,
					com.tools20022.repository.choice.DocumentIdentification4Choice.AccountServicerDocumentIdentification, com.tools20022.repository.choice.DocumentIdentification4Choice.AccountOwnerDocumentIdentification,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText9.Identification, com.tools20022.repository.msg.GenericIdentification85.Identification,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText15.Identification, com.tools20022.repository.msg.AlternatePartyIdentification9.AlternateIdentification,
					com.tools20022.repository.msg.GenericIdentification86.Identification, com.tools20022.repository.msg.SecuritiesAccount33.Identification, com.tools20022.repository.msg.SecuritiesAccount27.Identification,
					com.tools20022.repository.msg.SecuritiesCertificate5.Number, com.tools20022.repository.msg.GenericIdentification144.Identification, com.tools20022.repository.msg.GenericIdentification163.Identification,
					com.tools20022.repository.msg.SecuritiesAccount34.Identification, com.tools20022.repository.msg.DocumentIdentification49.Identification, com.tools20022.repository.msg.GenericIdentification89.Identification,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25.Identification, com.tools20022.repository.msg.GenericIdentification79.Identification, com.tools20022.repository.msg.SaleContext2.CashierIdentification,
					com.tools20022.repository.msg.GenericIdentification94.Identification, com.tools20022.repository.msg.GenericIdentification90.Identification, com.tools20022.repository.msg.GenericIdentification93.Identification,
					com.tools20022.repository.msg.GenericIdentification92.Identification, com.tools20022.repository.msg.GenericIdentificationSD1.AccountServicerIdentification,
					com.tools20022.repository.msg.GenericIdentificationSD1.AccountOwnerIdentification, com.tools20022.repository.msg.InvoiceHeader2.Identification,
					com.tools20022.repository.msg.TradeAgreement13.QuotationDocumentIdentification, com.tools20022.repository.msg.TradeAgreement13.ContractDocumentIdentification,
					com.tools20022.repository.msg.TradeAgreement13.BuyerOrderIdentificationDocument, com.tools20022.repository.msg.LineItem16.DeliveryNoteIdentification,
					com.tools20022.repository.msg.MarketClaimDetailsSD1.AccountServicerIdentification, com.tools20022.repository.msg.MarketClaimDetailsSD1.AccountOwnerIdentification,
					com.tools20022.repository.msg.TradingVenueIdentification2.Identification, com.tools20022.repository.msg.AdditionalReference8.Reference,
					com.tools20022.repository.msg.FundSettlementParameters11.SecuritiesSettlementSystemIdentification, com.tools20022.repository.msg.GenericIdentification164.Identification,
					com.tools20022.repository.msg.FundSettlementParameters12.SecuritiesSettlementSystemIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.ClientIdentification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.ClientIdentification, com.tools20022.repository.msg.DirectDebitMandate6.MandateIdentification,
					com.tools20022.repository.msg.AdditionalReference9.Reference, com.tools20022.repository.msg.RegulatoryReporting6.ExecutionVenue, com.tools20022.repository.msg.TradeData14.StatusOriginator,
					com.tools20022.repository.msg.TradeData12.StatusOriginator, com.tools20022.repository.msg.TradeData15.StatusOriginator, com.tools20022.repository.msg.Mandate10.MandateIdentification,
					com.tools20022.repository.msg.RemittanceInformation13.RemittanceIdentification, com.tools20022.repository.msg.Mandate9.MandateIdentification, com.tools20022.repository.msg.Mandate11.MandateIdentification,
					com.tools20022.repository.msg.ReferredMandateDocument1.Number, com.tools20022.repository.msg.Mandate8.MandateIdentification, com.tools20022.repository.msg.TradeData16.StatusOriginator);
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Contact point which uses a generic identification as identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#Identification
	 * ContactPoint.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact point which uses a generic identification as identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForContactPoint = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForContactPoint";
			definition = "Contact point which uses a generic identification as identification.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account Identification which uses a generic identification as proprietary
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#ProprietaryIdentification
	 * AccountIdentification.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account Identification which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccount";
			definition = "Account Identification which uses a generic identification as proprietary identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party identified with a scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identified with a scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPartyIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Party identified with a scheme.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at which the identification was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#IssueDate
	 * GenericIdentification9.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification44#IssueDate
	 * GenericIdentification44.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#IssueDate
	 * GenericIdentification55.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#IssueDate
	 * AlternateIdentification4.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#IssueDate
	 * GenericIdentification82.IssueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification9.IssueDate, com.tools20022.repository.msg.GenericIdentification44.IssueDate,
					com.tools20022.repository.msg.GenericIdentification55.IssueDate, com.tools20022.repository.msg.AlternateIdentification4.IssueDate, com.tools20022.repository.msg.GenericIdentification82.IssueDate);
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date at which the identification expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#ExpiryDate
	 * GenericIdentification9.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification44#ExpiryDate
	 * GenericIdentification44.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#ExpiryDate
	 * GenericIdentification55.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#ExpiryDate
	 * AlternateIdentification4.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#ExpiryDate
	 * GenericIdentification82.ExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification9.ExpiryDate, com.tools20022.repository.msg.GenericIdentification44.ExpiryDate,
					com.tools20022.repository.msg.GenericIdentification55.ExpiryDate, com.tools20022.repository.msg.AlternateIdentification4.ExpiryDate, com.tools20022.repository.msg.GenericIdentification82.ExpiryDate);
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Information regarding an enumerated code list and its owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#Identification
	 * Scheme.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#SchemeName
	 * GenericFinancialIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#SchemeName
	 * GenericAccountIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#SchemeName
	 * GenericOrganisationIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#SchemeName
	 * GenericPersonIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification2#SchemeName
	 * GenericOrganisationIdentification2.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueIdentification2#Type
	 * TradingVenueIdentification2.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding an enumerated code list and its owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Scheme = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericFinancialIdentification1.SchemeName, com.tools20022.repository.msg.GenericAccountIdentification1.SchemeName,
					com.tools20022.repository.msg.GenericOrganisationIdentification1.SchemeName, com.tools20022.repository.msg.GenericPersonIdentification1.SchemeName,
					com.tools20022.repository.msg.GenericOrganisationIdentification2.SchemeName, com.tools20022.repository.msg.TradingVenueIdentification2.Type);
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding an enumerated code list and its owner.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities certificate which uses a generic identification as certificate
	 * number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#Number
	 * SecuritiesCertificate.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForSecuritiesCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities certificate which uses a generic identification as certificate number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForSecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSecuritiesCertificate";
			definition = "Securities certificate which uses a generic identification as certificate number.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.Number;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lot breakdown which uses a generic identification as lot number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#LotNumber
	 * LotBreakdown.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lot breakdown which uses a generic identification as lot number."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForLot = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForLot";
			definition = "Lot breakdown which uses a generic identification as lot number.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.LotNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entity that assigns the identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#GenericIdentification
	 * InformationPartyRole.GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#Issuer
	 * ProprietaryQuantity3.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity2#Issuer
	 * ProprietaryQuantity2.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity5#Issuer
	 * ProprietaryQuantity5.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity4#Issuer
	 * ProprietaryQuantity4.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification6#Issuer
	 * PersonIdentification6.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity6#Issuer
	 * ProprietaryQuantity6.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity8#Issuer
	 * ProprietaryQuantity8.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#Issuer
	 * ProprietaryQuantity7.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity10#Issuer
	 * ProprietaryQuantity10.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity9#Issuer
	 * ProprietaryQuantity9.Issuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProprietaryQuantity3.Issuer, com.tools20022.repository.msg.ProprietaryQuantity2.Issuer, com.tools20022.repository.msg.ProprietaryQuantity5.Issuer,
					com.tools20022.repository.msg.ProprietaryQuantity4.Issuer, com.tools20022.repository.msg.PersonIdentification6.Issuer, com.tools20022.repository.msg.ProprietaryQuantity6.Issuer,
					com.tools20022.repository.msg.ProprietaryQuantity8.Issuer, com.tools20022.repository.msg.ProprietaryQuantity7.Issuer, com.tools20022.repository.msg.ProprietaryQuantity10.Issuer,
					com.tools20022.repository.msg.ProprietaryQuantity9.Issuer);
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Entity that assigns the identification.";
			minOccurs = 0;
			type_lazy = () -> InformationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.GenericIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash proceeds definition which uses a generic identification as type of
	 * income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomeType
	 * CashProceedsDefinition.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForCashProceedsIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition which uses a generic identification as type of income."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForCashProceedsIncome = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForCashProceedsIncome";
			definition = "Cash proceeds definition which uses a generic identification as type of income.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.IncomeType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status reason for which a data source scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
	 * StatusReason.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status reason for which a data source scheme is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedStatusReason = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStatusReason";
			definition = "Specifies the status reason for which a data source scheme is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.DataSourceScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bank transaction which uses a generic identification as proprietary
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#ProprietaryIdentification
	 * BankTransaction.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForBankTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank transaction which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForBankTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForBankTransaction";
			definition = "Bank transaction which uses a generic identification as proprietary identification.";
			minOccurs = 0;
			type_lazy = () -> BankTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account identification for which a cost reference pattern is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#CostReferencePattern
	 * AccountIdentification.CostReferencePattern}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccountCostReferencePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification for which a cost reference pattern is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForAccountCostReferencePattern = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccountCostReferencePattern";
			definition = "Account identification for which a cost reference pattern is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.CostReferencePattern;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account for which a type is specified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#Type
	 * Account.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which a type is specified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a type is specified";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Type;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System identification which uses a generic identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#Identification
	 * SystemIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System identification which uses a generic identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSystemIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSystemIdentification";
			definition = "System identification which uses a generic identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest which uses a generic identification as name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestName
	 * Interest.InterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest which uses a generic identification as name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForInterestName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInterestName";
			definition = "Interest which uses a generic identification as name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash account service identified in a generic way.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#Identification
	 * CashAccountService.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account service identified in a generic way."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashAccountService";
			definition = "Cash account service identified in a generic way.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund class which uses a generic identification as fund
	 * classification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#FundClassification
	 * InvestmentFundClass.FundClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class which uses a generic identification as fund classification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInvestmentFundClass";
			definition = "Investment fund class which uses a generic identification as fund classification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.FundClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#Identification
	 * Location.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedLocation";
			definition = "Location for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities identification for which generic identification elements and
	 * scheme are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#GenericIdentification
	 * SecuritiesIdentification.GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities identification for which generic identification elements and scheme are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which generic identification elements and scheme are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
	 * Document.DocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedDocument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedDocument";
			definition = "Document for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Purchase order for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#Identification
	 * PurchaseOrder.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purchase order for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPurchaseOrder";
			definition = "Purchase order for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PurchaseOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Related certificate against which all transactions in the scope of the
	 * regulatory requirements are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Certificate
	 * RegisteredContract.Certificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related certificate against which all transactions in the scope of the regulatory requirements are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCertificate";
			definition = "Related certificate against which all transactions in the scope of the regulatory requirements are registered.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Certificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification";
				definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.FundClassification, com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification,
						com.tools20022.repository.entity.InformationPartyRole.GenericIdentification, com.tools20022.repository.entity.ContactPoint.Identification,
						com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification, com.tools20022.repository.entity.Account.Type, com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification,
						com.tools20022.repository.entity.AccountIdentification.CostReferencePattern, com.tools20022.repository.entity.Location.Identification, com.tools20022.repository.entity.Scheme.Identification,
						com.tools20022.repository.entity.Document.DocumentIdentification, com.tools20022.repository.entity.StatusReason.DataSourceScheme, com.tools20022.repository.entity.SystemIdentification.Identification,
						com.tools20022.repository.entity.LotBreakdown.LotNumber, com.tools20022.repository.entity.CashAccountService.Identification, com.tools20022.repository.entity.SecuritiesCertificate.Number,
						com.tools20022.repository.entity.Interest.InterestName, com.tools20022.repository.entity.CashProceedsDefinition.IncomeType, com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification,
						com.tools20022.repository.entity.PurchaseOrder.Identification, com.tools20022.repository.entity.RegisteredContract.Certificate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OtherIdentification1Choice.Proprietary, com.tools20022.repository.msg.GenericIdentification46.Type,
						com.tools20022.repository.msg.GenericIdentification14.Type, com.tools20022.repository.msg.GenericIdentification21.Type, com.tools20022.repository.msg.GenericIdentification26.Type,
						com.tools20022.repository.msg.PreAllocation1.AllocationIdentification, com.tools20022.repository.msg.PreAllocation1.IndividualAllocationIdentification, com.tools20022.repository.msg.GenericIdentification32.Type,
						com.tools20022.repository.msg.GenericIdentification35.Type, com.tools20022.repository.msg.GenericIdentification31.Type, com.tools20022.repository.msg.GenericIdentification33.Type,
						com.tools20022.repository.msg.ReversedStatus1.DataSourceScheme, com.tools20022.repository.choice.RejectedCancellationStatusReason1Choice.DataSourceScheme,
						com.tools20022.repository.msg.GenericIdentification55.IssuerCountry, com.tools20022.repository.choice.OtherIdentification2Choice.Proprietary, com.tools20022.repository.msg.GenericIdentification58.Type,
						com.tools20022.repository.msg.GenericIdentification59.Type, com.tools20022.repository.msg.GenericIdentification61.Type, com.tools20022.repository.msg.GenericIdentification53.Type,
						com.tools20022.repository.msg.GenericIdentification71.Type, com.tools20022.repository.msg.GenericIdentification73.Type, com.tools20022.repository.msg.GenericIdentification74.Type,
						com.tools20022.repository.msg.GenericIdentification70.Type, com.tools20022.repository.msg.GenericIdentification75.Type, com.tools20022.repository.msg.GenericIdentification76.Type,
						com.tools20022.repository.msg.GenericIdentification77.Type, com.tools20022.repository.msg.GenericIdentification78.Type, com.tools20022.repository.msg.GenericIdentification80.Type,
						com.tools20022.repository.msg.AlternateIdentification4.IssuerCountry, com.tools20022.repository.choice.OtherIdentification4Choice.Proprietary,
						com.tools20022.repository.msg.GenericIdentification81.IdentificationType, com.tools20022.repository.choice.ReversedStatus2Choice.DataSourceScheme, com.tools20022.repository.msg.PostalAddress21.CareOf,
						com.tools20022.repository.msg.GenericIdentification82.IssuerCountry, com.tools20022.repository.choice.OtherIdentification3Choice.Proprietary, com.tools20022.repository.msg.GenericIdentification85.Type,
						com.tools20022.repository.msg.GenericIdentification89.Type, com.tools20022.repository.msg.GenericIdentification94.Type, com.tools20022.repository.msg.GenericIdentification90.Type,
						com.tools20022.repository.msg.GenericIdentification92.Type);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.Identification, com.tools20022.repository.entity.GenericIdentification.IdentificationForContactPoint,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccount, com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification,
						com.tools20022.repository.entity.GenericIdentification.IssueDate, com.tools20022.repository.entity.GenericIdentification.ExpiryDate, com.tools20022.repository.entity.GenericIdentification.Scheme,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForSecuritiesCertificate, com.tools20022.repository.entity.GenericIdentification.IdentificationForLot,
						com.tools20022.repository.entity.GenericIdentification.PartyRole, com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome,
						com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason, com.tools20022.repository.entity.GenericIdentification.IdentificationForBankTransaction,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.GenericIdentification.Account,
						com.tools20022.repository.entity.GenericIdentification.RelatedSystemIdentification, com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName,
						com.tools20022.repository.entity.GenericIdentification.RelatedCashAccountService, com.tools20022.repository.entity.GenericIdentification.IdentificationForInvestmentFundClass,
						com.tools20022.repository.entity.GenericIdentification.IdentifiedLocation, com.tools20022.repository.entity.GenericIdentification.RelatedSecuritiesIdentification,
						com.tools20022.repository.entity.GenericIdentification.IdentifiedDocument, com.tools20022.repository.entity.GenericIdentification.RelatedPurchaseOrder,
						com.tools20022.repository.entity.GenericIdentification.RelatedCertificate);
				derivationComponent_lazy = () -> Arrays.asList(SimpleIdentificationInformation.mmObject(), GenericIdentification1.mmObject(), GenericIdentification7.mmObject(), AdditionalReference2.mmObject(),
						AdditionalReference3.mmObject(), GenericIdentification8.mmObject(), GenericIdentification9.mmObject(), GenericIdentification13.mmObject(), GenericIdentification20.mmObject(), GenericIdentification25.mmObject(),
						GenericIdentification47.mmObject(), OtherIdentification1Choice.mmObject(), GenericIdentification44.mmObject(), GenericIdentification41.mmObject(), GenericIdentification46.mmObject(),
						GenericIdentification10.mmObject(), GenericIdentification3.mmObject(), SimpleIdentificationInformation2.mmObject(), GenericIdentification4.mmObject(), AdditionalReferences.mmObject(),
						GenericIdentification19.mmObject(), GenericIdentification24.mmObject(), GenericIdentification14.mmObject(), GenericIdentification37.mmObject(), GenericIdentification21.mmObject(), GenericIdentification23.mmObject(),
						GenericIdentification18.mmObject(), GenericIdentification39.mmObject(), GenericIdentification26.mmObject(), GenericIdentification27.mmObject(), GenericIdentification22.mmObject(),
						SimpleIdentificationInformation4.mmObject(), SimpleIdentificationInformation1.mmObject(), GenericIdentification28.mmObject(), GenericIdentification6.mmObject(), GenericIdentification5.mmObject(),
						GenericIdentification34.mmObject(), GenericIdentification38.mmObject(), GenericIdentification29.mmObject(), GenericIdentification36.mmObject(), ProprietaryBankTransactionCodeStructure1.mmObject(),
						GenericIdentification32.mmObject(), GenericIdentification35.mmObject(), GenericIdentification48.mmObject(), GenericIdentification31.mmObject(), GenericIdentification33.mmObject(), GenericIdentification2.mmObject(),
						GenericIdentification11.mmObject(), GenericIdentification16.mmObject(), GenericIdentification30.mmObject(), BillingSubServiceIdentification1.mmObject(), BillingServiceCommonIdentification1.mmObject(),
						AdditionalReference4.mmObject(), GenericIdentification12.mmObject(), RestrictedIdentification2.mmObject(), RestrictedIdentification1.mmObject(), GenericIdentification17.mmObject(), AdditionalReference5.mmObject(),
						SimpleIdentificationInformation3.mmObject(), GenericIdentification40.mmObject(), GenericIdentification15.mmObject(), GenericIdentification42.mmObject(), GenericIdentification49.mmObject(),
						GenericIdentification51.mmObject(), GenericIdentification55.mmObject(), OtherIdentification2Choice.mmObject(), GenericIdentification56.mmObject(), GenericIdentification58.mmObject(),
						GenericIdentification65.mmObject(), GenericIdentification63.mmObject(), GenericIdentification66.mmObject(), GenericIdentification62.mmObject(), GenericIdentification60.mmObject(), GenericIdentification64.mmObject(),
						GenericIdentification59.mmObject(), GenericIdentification61.mmObject(), GenericIdentification67.mmObject(), GenericIdentification53.mmObject(), GenericIdentification71.mmObject(), GenericIdentification73.mmObject(),
						GenericIdentification74.mmObject(), GenericIdentification72.mmObject(), GenericIdentification70.mmObject(), GenericIdentification75.mmObject(), GenericIdentification76.mmObject(), GenericIdentification77.mmObject(),
						AdditionalReference6.mmObject(), GenericIdentification78.mmObject(), GenericIdentification80.mmObject(), AlternateIdentification4.mmObject(), OtherIdentification4Choice.mmObject(), AdditionalReference7.mmObject(),
						GenericIdentification81.mmObject(), GenericIdentification82.mmObject(), OtherIdentification3Choice.mmObject(), GenericIdentification84.mmObject(), GenericIdentification85.mmObject(),
						GenericIdentification86.mmObject(), GenericIdentification144.mmObject(), GenericIdentification163.mmObject(), GenericIdentification89.mmObject(), GenericIdentification79.mmObject(),
						GenericIdentification94.mmObject(), GenericIdentification90.mmObject(), GenericIdentification93.mmObject(), GenericIdentification92.mmObject(), AdditionalReference8.mmObject(), GenericIdentification164.mmObject(),
						AdditionalReference9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}