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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
 * GenericIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForContactPoint
 * GenericIdentification.mmIdentificationForContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
 * GenericIdentification.mmIdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIssueDate
 * GenericIdentification.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmExpiryDate
 * GenericIdentification.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
 * GenericIdentification.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
 * GenericIdentification.mmIdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmPartyRole
 * GenericIdentification.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForCashProceedsIncome
 * GenericIdentification.mmIdentificationForCashProceedsIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
 * GenericIdentification.mmRelatedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForBankTransaction
 * GenericIdentification.mmIdentificationForBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
 * GenericIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSystemIdentification
 * GenericIdentification.mmRelatedSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
 * GenericIdentification.mmRelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedLocation
 * GenericIdentification.mmIdentifiedLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPurchaseOrder
 * GenericIdentification.mmRelatedPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCertificate
 * GenericIdentification.mmRelatedCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
 * InvestmentFundClass.mmFundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
 * InformationPartyRole.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
 * ContactPoint.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmType
 * Account.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
 * AccountIdentification.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
 * AccountIdentification.mmCostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIdentification
 * Location.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
 * Scheme.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
 * StatusReason.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
 * SystemIdentification.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
 * LotBreakdown.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
 * CashAccountService.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
 * SecuritiesCertificate.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
 * CashProceedsDefinition.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
 * BankTransaction.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
 * PurchaseOrder.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
 * RegisteredContract.mmCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification1Choice#mmProprietary
 * OtherIdentification1Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification46#mmType
 * GenericIdentification46.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification14#mmType
 * GenericIdentification14.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification21#mmType
 * GenericIdentification21.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification26#mmType
 * GenericIdentification26.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#mmAllocationIdentification
 * PreAllocation1.mmAllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#mmIndividualAllocationIdentification
 * PreAllocation1.mmIndividualAllocationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32#mmType
 * GenericIdentification32.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification35#mmType
 * GenericIdentification35.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification31#mmType
 * GenericIdentification31.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification33#mmType
 * GenericIdentification33.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversedStatus1#mmDataSourceScheme
 * ReversedStatus1.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectedCancellationStatusReason1Choice#mmDataSourceScheme
 * RejectedCancellationStatusReason1Choice.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#mmIssuerCountry
 * GenericIdentification55.mmIssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification2Choice#mmProprietary
 * OtherIdentification2Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification58#mmType
 * GenericIdentification58.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification59#mmType
 * GenericIdentification59.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification61#mmType
 * GenericIdentification61.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification53#mmType
 * GenericIdentification53.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification71#mmType
 * GenericIdentification71.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification73#mmType
 * GenericIdentification73.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification74#mmType
 * GenericIdentification74.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification70#mmType
 * GenericIdentification70.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification75#mmType
 * GenericIdentification75.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification76#mmType
 * GenericIdentification76.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification77#mmType
 * GenericIdentification77.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification78#mmType
 * GenericIdentification78.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification80#mmType
 * GenericIdentification80.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssuerCountry
 * AlternateIdentification4.mmIssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification4Choice#mmProprietary
 * OtherIdentification4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification81#mmIdentificationType
 * GenericIdentification81.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReversedStatus2Choice#mmDataSourceScheme
 * ReversedStatus2Choice.mmDataSourceScheme}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmCareOf
 * PostalAddress21.mmCareOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIssuerCountry
 * GenericIdentification82.mmIssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification3Choice#mmProprietary
 * OtherIdentification3Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification85#mmType
 * GenericIdentification85.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification89#mmType
 * GenericIdentification89.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification94#mmType
 * GenericIdentification94.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification90#mmType
 * GenericIdentification90.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification92#mmType
 * GenericIdentification92.mmType}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification165
 * GenericIdentification165}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification166
 * GenericIdentification166}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification169
 * GenericIdentification169}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StressedProduct1
 * StressedProduct1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification168
 * GenericIdentification168}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification172
 * GenericIdentification172}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification167
 * GenericIdentification167}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification170
 * GenericIdentification170}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageReference1
 * MessageReference1}</li>
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
	protected Max35Text identification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#mmIdentification
	 * AlternateSecurityIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation#mmIdentification
	 * SimpleIdentificationInformation.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmIdentification
	 * GenericIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification3#mmIssuer
	 * AccountIdentification3.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmReference
	 * AdditionalReference2.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReference
	 * AdditionalReference3.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmIdentification
	 * AlternateSecurityIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification8#mmIdentification
	 * GenericIdentification8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#mmIdentification
	 * GenericIdentification9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmClientIdentification
	 * InvestmentAccountOwnershipInformation5.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmClientIdentification
	 * InvestmentAccountOwnershipInformation2.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchData#mmIdentification
	 * BranchData.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate2#mmMandateIdentification
	 * DirectDebitMandate2.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmMandateIdentification
	 * DirectDebitMandate3.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmMandateIdentification
	 * DirectDebitMandate4.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmIdentification
	 * GenericIdentification13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20#mmIdentification
	 * GenericIdentification20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification25#mmIdentification
	 * GenericIdentification25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47#mmIdentification
	 * GenericIdentification47.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#mmHoldingCertificateNumber
	 * BlockedHoldingDetails1.mmHoldingCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification44#mmIdentification
	 * GenericIdentification44.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification41#mmIdentification
	 * GenericIdentification41.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmValidatingParty
	 * PartyProfileInformation2.mmValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCheckingParty
	 * PartyProfileInformation2.mmCheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmResponsibleParty
	 * PartyProfileInformation2.mmResponsibleParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmClientIdentification
	 * InvestmentAccountOwnershipInformation6.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification46#mmIdentification
	 * GenericIdentification46.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification10#mmIdentification
	 * GenericIdentification10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmClientIdentification
	 * InvestmentAccountOwnershipInformation3.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmClientIdentification
	 * InvestmentAccountOwnershipInformation4.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmClientIdentification
	 * InvestmentAccountOwnershipInformation7.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#mmMemberIdentification
	 * ClearingSystemMemberIdentification2.mmMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification3#mmIdentification
	 * GenericIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmIdentification
	 * GenericFinancialIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchData2#mmIdentification
	 * BranchData2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation2#mmIdentification
	 * SimpleIdentificationInformation2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmIdentification
	 * GenericAccountIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification4#mmIdentification
	 * GenericIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmIdentification
	 * GenericOrganisationIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmIdentification
	 * GenericPersonIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences#mmReference
	 * AdditionalReferences.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13#mmIdentification
	 * SecuritiesAccount13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19#mmIdentification
	 * GenericIdentification19.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount17#mmIdentification
	 * SecuritiesAccount17.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification24#mmIdentification
	 * GenericIdentification24.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification2#mmIdentification
	 * GenericOrganisationIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification1#mmIdentification
	 * AlternateIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmIdentification
	 * OtherIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification14#mmIdentification
	 * GenericIdentification14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37#mmIdentification
	 * GenericIdentification37.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3#mmIdentification
	 * SafekeepingPlaceTypeAndText3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification21#mmIdentification
	 * GenericIdentification21.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1#mmAlternateIdentification
	 * AlternatePartyIdentification1.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2#mmAlternateIdentification
	 * AlternatePartyIdentification2.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate1#mmNumber
	 * SecuritiesCertificate1.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2#mmIdentification
	 * OtherIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification23#mmIdentification
	 * GenericIdentification23.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification18#mmIdentification
	 * GenericIdentification18.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification39#mmIdentification
	 * GenericIdentification39.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4#mmIdentification
	 * SafekeepingPlaceTypeAndText4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification26#mmIdentification
	 * GenericIdentification26.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3#mmAlternateIdentification
	 * AlternatePartyIdentification3.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#mmNumber
	 * SecuritiesCertificate2.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification27#mmIdentification
	 * GenericIdentification27.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmIdentification
	 * DocumentIdentification11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#mmIdentification
	 * SafekeepingPlaceTypeAndText2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#mmIdentification
	 * DocumentIdentification16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification2#mmIdentification
	 * AlternateIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5#mmIdentification
	 * SafekeepingPlaceTypeAndText5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9#mmIdentification
	 * DocumentIdentification9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice#mmAccountServicerDocumentIdentification
	 * DocumentIdentification1Choice.mmAccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice#mmAccountOwnerDocumentIdentification
	 * DocumentIdentification1Choice.mmAccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification14#mmIdentification
	 * DocumentIdentification14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification17#mmIdentification
	 * DocumentIdentification17.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification2Choice#mmAccountServicerDocumentIdentification
	 * DocumentIdentification2Choice.mmAccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification2Choice#mmAccountOwnerDocumentIdentification
	 * DocumentIdentification2Choice.mmAccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification21#mmIdentification
	 * DocumentIdentification21.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#mmIdentification
	 * DocumentIdentification12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15#mmIdentification
	 * DocumentIdentification15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#mmIdentification
	 * DocumentIdentification13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#mmIdentification
	 * DocumentIdentification18.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification19#mmIdentification
	 * DocumentIdentification19.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification20#mmIdentification
	 * DocumentIdentification20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification3#mmIdentification
	 * OtherIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount11#mmIdentification
	 * SecuritiesAccount11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification22#mmIdentification
	 * GenericIdentification22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount2#mmIdentification
	 * SecuritiesAccount2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount14#mmIdentification
	 * SecuritiesAccount14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount15#mmIdentification
	 * SecuritiesAccount15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4#mmIdentification
	 * SimpleIdentificationInformation4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation1#mmIdentification
	 * SimpleIdentificationInformation1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification28#mmIdentification
	 * GenericIdentification28.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount16#mmIdentification
	 * SecuritiesAccount16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification34#mmIdentification
	 * GenericIdentification34.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification38#mmIdentification
	 * GenericIdentification38.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification29#mmIdentification
	 * GenericIdentification29.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#mmAlternateIdentification
	 * AlternatePartyIdentification5.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#mmAlternateIdentification
	 * AlternatePartyIdentification6.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount3#mmIdentification
	 * SecuritiesAccount3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPriceSource
	 * FinancialInstrumentStipulations.mmPriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36#mmIdentification
	 * GenericIdentification36.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceSource
	 * FinancialInstrumentStipulations2.mmPriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1#mmCode
	 * ProprietaryBankTransactionCodeStructure1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1#mmIdentification
	 * OperationMandate1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1#mmReferredDocumentNumber
	 * ReferredDocumentInformation1.mmReferredDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification2#mmIdentification
	 * AlternateSecurityIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmNumber
	 * ReferredDocumentInformation3.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#mmIdentification
	 * GenericIdentification32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#mmManufacturerIdentification
	 * PointOfInteractionComponent1.mmManufacturerIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Document9#mmIdentification
	 * Document9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#mmMandateIdentification
	 * MandateInformation1.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate1#mmMandateIdentification
	 * Mandate1.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#mmMandateIdentification
	 * MandateInformation3.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate3#mmMandateIdentification
	 * Mandate3.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmMandateIdentification
	 * MandateInformation2.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate2#mmMandateIdentification
	 * Mandate2.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate4#mmMandateIdentification
	 * Mandate4.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmMatchingSystemUniqueReference
	 * TradeData1.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData10#mmStatusOriginator
	 * TradeData10.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NameAndAddress8#mmAlternativeIdentifier
	 * NameAndAddress8.mmAlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmReportingJurisdiction
	 * RegulatoryReporting1.mmReportingJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmExecutionVenue
	 * RegulatoryReporting1.mmExecutionVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement2#mmRelatedReference
	 * TradeAgreement2.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement4#mmRelatedReference
	 * TradeAgreement4.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification1#mmAccountIdentificationWithCustodian
	 * FundIdentification1.mmAccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification2#mmAccountIdentificationWithCustodian
	 * FundIdentification2.mmAccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification3#mmAccountIdentificationWithCustodian
	 * FundIdentification3.mmAccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundIdentification4#mmAccountIdentificationWithCustodian
	 * FundIdentification4.mmAccountIdentificationWithCustodian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement5#mmRelatedReference
	 * TradeAgreement5.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#mmStatusOriginator
	 * TradeData9.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmStatusOriginator
	 * TradeData7.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35#mmIdentification
	 * GenericIdentification35.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmManufacturerIdentification
	 * PointOfInteractionComponent2.mmManufacturerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentIdentification1#mmProviderIdentification
	 * PointOfInteractionComponentIdentification1.mmProviderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification48#mmIdentification
	 * GenericIdentification48.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#mmAssigner
	 * PointOfInteractionComponentAssessment1.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification31#mmIdentification
	 * GenericIdentification31.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmCashierIdentification
	 * SaleContext1.mmCashierIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderIdentification1#mmCardholderIdentificationValue
	 * CardholderIdentification1.mmCardholderIdentificationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification33#mmIdentification
	 * GenericIdentification33.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters3#mmSecuritiesSettlementSystemIdentification
	 * FundSettlementParameters3.mmSecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification11#mmIdentification
	 * GenericIdentification11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmSecuritiesSettlementSystemIdentification
	 * FundSettlementParameters4.mmSecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmDocumentReferenceNumber
	 * StructuredRemittanceInformation2.mmDocumentReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmIdentification
	 * AlternateFinancialInstrumentIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition#mmAccountIdentification
	 * EligiblePosition.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3#mmAccountIdentification
	 * SafekeepingAccount3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmAccountIdentification
	 * SafekeepingAccount4.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmAccountIdentification
	 * MeetingInstructionDetailedStatus.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition1#mmAccountIdentification
	 * EligiblePosition1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#mmIdentification
	 * DocumentIdentification8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice#mmCashAccountIdentification
	 * AccountIdentification2Choice.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice#mmSecuritiesAccountIdentification
	 * AccountIdentification2Choice.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount7#mmAccountIdentification
	 * SecuritiesAccount7.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmAccountIdentification
	 * SecuritiesAccount9.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification16#mmIdentification
	 * GenericIdentification16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmSecuritiesAccountIdentification
	 * ProceedsDelivery1.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmAccountIdentification
	 * SecuritiesAccount12.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmAccountIdentification
	 * CorporateActionMovement1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmAccountIdentification
	 * SecuritiesAccount8.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmAccountIdentification
	 * SecuritiesAccount10.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#mmSecuritiesAccountIdentification
	 * SecuritiesAccount6.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification1#mmIdentification
	 * IdentificationModification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#mmIdentification
	 * IdentificationModification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusOriginator
	 * TradeStatus1.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#mmDocumentNumber
	 * DocumentGeneralInformation1.mmDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#mmDocumentNumber
	 * ReferredDocumentInformation2.mmDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#mmDocumentNumber
	 * OriginalInvoiceInformation1.mmDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation1#mmIdentification
	 * LegalOrganisation1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmIdentification
	 * InvoiceHeader1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#mmIdentification
	 * DocumentIdentification22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmDocumentNumber
	 * DocumentGeneralInformation2.mmDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmQuotationDocumentIdentification
	 * TradeAgreement6.mmQuotationDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmContractDocumentIdentification
	 * TradeAgreement6.mmContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmBuyerOrderIdentificationDocument
	 * TradeAgreement6.mmBuyerOrderIdentificationDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7#mmIdentification
	 * DocumentIdentification7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmLetterOfCreditReferencedDocument
	 * TradeSettlement1.mmLetterOfCreditReferencedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23#mmIdentification
	 * DocumentIdentification23.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmDeliveryNoteIdentification
	 * LineItem10.mmDeliveryNoteIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#mmIdentification
	 * DocumentIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5#mmIdentification
	 * DocumentIdentification5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#mmIdentification
	 * DocumentIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AirportDescription1#mmAirportName
	 * AirportDescription1.mmAirportName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#mmIdentification
	 * DocumentIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification6#mmIdentification
	 * DocumentIdentification6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#mmIdentification
	 * DocumentIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#mmIdentification
	 * DocumentIdentification10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmTransitLocation
	 * MultimodalTransport2.mmTransitLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceIdentification1#mmInvoiceNumber
	 * InvoiceIdentification1.mmInvoiceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuranceDocumentIdentification
	 * InsuranceDataSet1.mmInsuranceDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmCertificateIdentification
	 * CertificateDataSet1.mmCertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmCertificateIdentification
	 * OtherCertificateDataSet1.mmCertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#mmIdentification
	 * GenericIdentification30.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementIdentification
	 * Agreement2.mmAgreementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#mmIdentification
	 * AccountIdentification5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#mmAlternateIdentification
	 * AlternatePartyIdentification4.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#mmIssuer
	 * BillingSubServiceIdentification1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#mmIdentification
	 * BillingSubServiceIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1#mmIdentification
	 * BillingServiceCommonIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmInvoiceNumber
	 * BillingTaxRegion1.mmInvoiceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmStatementIdentification
	 * BillingStatement1.mmStatementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#mmReference
	 * AdditionalReference4.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount5#mmIdentification
	 * SecuritiesAccount5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification12#mmIdentification
	 * GenericIdentification12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RestrictedIdentification2#mmIdentification
	 * RestrictedIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RestrictedIdentification1#mmIdentification
	 * RestrictedIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification17#mmIdentification
	 * GenericIdentification17.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference5#mmReference
	 * AdditionalReference5.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation3#mmIdentification
	 * SimpleIdentificationInformation3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmIdentification
	 * AlternateSecurityIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification40#mmIdentification
	 * GenericIdentification40.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification15#mmIdentification
	 * GenericIdentification15.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPriceSource
	 * Debt2.mmPriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement1#mmIdentification
	 * Agreement1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#mmIdentification
	 * DocumentIdentification27.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#mmIdentification
	 * SafekeepingPlaceTypeAndText1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmBillingIdentification
	 * BillingReport1.mmBillingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmBillingIdentification
	 * BillingCancellationReport1.mmBillingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmBillingIdentification
	 * BillingSearchCriteria1.mmBillingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmClientIdentification
	 * InvestmentAccountOwnershipInformation8.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmClientIdentification
	 * InvestmentAccountOwnershipInformation9.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmValidatingParty
	 * PartyProfileInformation3.mmValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingParty
	 * PartyProfileInformation3.mmCheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmResponsibleParty
	 * PartyProfileInformation3.mmResponsibleParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1#mmIssuer
	 * DocumentLineType1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#mmRemittanceIdentification
	 * RemittanceInformation8.mmRemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmIdentification
	 * DocumentLineInformation1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmIdentification
	 * SecuritiesAccount22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmDataSetIdentification
	 * CertificateDataSet2.mmDataSetIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmCertificateIdentification
	 * CertificateDataSet2.mmCertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification49#mmIdentification
	 * GenericIdentification49.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification51#mmIdentification
	 * GenericIdentification51.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionVenue
	 * RegulatoryReporting4.mmExecutionVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1#mmReportingJurisdiction
	 * CounterpartySideTransactionReporting1.mmReportingJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1#mmReportingJurisdiction
	 * TradingSideTransactionReporting1.mmReportingJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2#mmFullLocalLanguageSecurityName
	 * UpdatedAdditionalInformation6SD2.mmFullLocalLanguageSecurityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2SD1#mmLocalLanguageSecurityName
	 * OtherIdentification2SD1.mmLocalLanguageSecurityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmClientIdentification
	 * InvestmentAccountOwnershipInformation10.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#mmIdentification
	 * GenericIdentification55.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmClientIdentification
	 * InvestmentAccountOwnershipInformation11.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmValidatingParty
	 * PartyProfileInformation4.mmValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCheckingParty
	 * PartyProfileInformation4.mmCheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmResponsibleParty
	 * PartyProfileInformation4.mmResponsibleParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate7#mmMandateIdentification
	 * Mandate7.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate6#mmMandateIdentification
	 * Mandate6.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate5#mmMandateIdentification
	 * Mandate5.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#mmNumber
	 * ReferredDocumentInformation6.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmCertificateIdentification
	 * OtherCertificateDataSet2.mmCertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification56#mmIdentification
	 * GenericIdentification56.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification58#mmIdentification
	 * GenericIdentification58.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification4#mmIdentification
	 * OtherIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmAccountIdentification
	 * SafekeepingAccount6.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification65#mmIdentification
	 * GenericIdentification65.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification63#mmIdentification
	 * GenericIdentification63.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification66#mmIdentification
	 * GenericIdentification66.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification62#mmIdentification
	 * GenericIdentification62.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification60#mmIdentification
	 * GenericIdentification60.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification64#mmIdentification
	 * GenericIdentification64.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification59#mmIdentification
	 * GenericIdentification59.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification61#mmIdentification
	 * GenericIdentification61.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification67#mmIdentification
	 * GenericIdentification67.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53#mmIdentification
	 * GenericIdentification53.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71#mmIdentification
	 * GenericIdentification71.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73#mmIdentification
	 * GenericIdentification73.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification74#mmIdentification
	 * GenericIdentification74.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72#mmIdentification
	 * GenericIdentification72.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification70#mmIdentification
	 * GenericIdentification70.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification75#mmIdentification
	 * GenericIdentification75.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification76#mmIdentification
	 * GenericIdentification76.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmLetterIdentifier
	 * BusinessLetter1.mmLetterIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmItemListIdentifier
	 * QualifiedDocumentInformation1.mmItemListIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmItemIdentifier
	 * QualifiedDocumentInformation1.mmItemIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1#mmProcessor
	 * ATMCommandIdentification1.mmProcessor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification77#mmIdentification
	 * GenericIdentification77.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmReference
	 * AdditionalReference6.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmIdentification
	 * SecuritiesAccount24.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#mmAlternateIdentification
	 * AlternatePartyIdentification7.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification3#mmIdentification
	 * AlternateIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification78#mmIdentification
	 * GenericIdentification78.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#mmIdentification
	 * SafekeepingPlaceTypeAndText6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTradeVenueCriteria1Choice#mmAnyMIC
	 * SecuritiesTradeVenueCriteria1Choice.mmAnyMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#mmIdentification
	 * DocumentIdentification29.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmEntryIdentification
	 * SupportingDocumentEntry1.mmEntryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmDocumentNumber
	 * DocumentGeneralInformation3.mmDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmContractDocumentIdentification
	 * TradeContract1.mmContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#mmInterestScheduleIdentification
	 * InterestPaymentDateRange1.mmInterestScheduleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmIdentification
	 * LegalOrganisation2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#mmIdentification
	 * DocumentIdentification28.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#mmCertificateRecordIdentification
	 * TransactionCertificateRecord1.mmCertificateRecordIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#mmCode
	 * ContractClosureReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#mmProprietary
	 * ContractClosureReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmIdentification
	 * SecuritiesAccount26.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4#mmNumber
	 * SecuritiesCertificate4.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8#mmIdentification
	 * SafekeepingPlaceTypeAndText8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount25#mmIdentification
	 * SecuritiesAccount25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification80#mmIdentification
	 * GenericIdentification80.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmRemittanceIdentification
	 * RemittanceInformation12.mmRemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmNumber
	 * ReferredDocumentInformation7.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatementIdentification
	 * BillingStatement2.mmStatementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIdentification
	 * AlternateIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31#mmIdentification
	 * DocumentIdentification31.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#mmIdentification
	 * DocumentIdentification32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification33#mmIdentification
	 * DocumentIdentification33.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice#mmAccountServicerDocumentIdentification
	 * DocumentIdentification3Choice.mmAccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice#mmAccountOwnerDocumentIdentification
	 * DocumentIdentification3Choice.mmAccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#mmReference
	 * AdditionalReference7.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification81#mmIdentification
	 * GenericIdentification81.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmMandateIdentification
	 * DirectDebitMandate5.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#mmIdentification
	 * AlternateSecurityIdentification7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmClientIdentification
	 * InvestmentAccountOwnershipInformation12.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIdentification
	 * GenericIdentification82.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmValidatingParty
	 * PartyProfileInformation5.mmValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingParty
	 * PartyProfileInformation5.mmCheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmResponsibleParty
	 * PartyProfileInformation5.mmResponsibleParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmClientIdentification
	 * InvestmentAccountOwnershipInformation13.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmHoldingCertificateNumber
	 * BlockedHoldingDetails2.mmHoldingCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementIdentification
	 * Agreement4.mmAgreementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#mmAlternateIdentification
	 * AlternatePartyIdentification8.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38#mmIdentification
	 * DocumentIdentification38.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37#mmIdentification
	 * DocumentIdentification37.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification34#mmIdentification
	 * DocumentIdentification34.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification84#mmIdentification
	 * GenericIdentification84.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification4Choice#mmAccountServicerDocumentIdentification
	 * DocumentIdentification4Choice.mmAccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification4Choice#mmAccountOwnerDocumentIdentification
	 * DocumentIdentification4Choice.mmAccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText9#mmIdentification
	 * SafekeepingPlaceTypeAndText9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification85#mmIdentification
	 * GenericIdentification85.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText15#mmIdentification
	 * SafekeepingPlaceTypeAndText15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9#mmAlternateIdentification
	 * AlternatePartyIdentification9.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification86#mmIdentification
	 * GenericIdentification86.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount33#mmIdentification
	 * SecuritiesAccount33.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount27#mmIdentification
	 * SecuritiesAccount27.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate5#mmNumber
	 * SecuritiesCertificate5.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification144#mmIdentification
	 * GenericIdentification144.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification163#mmIdentification
	 * GenericIdentification163.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount34#mmIdentification
	 * SecuritiesAccount34.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification49#mmIdentification
	 * DocumentIdentification49.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification89#mmIdentification
	 * GenericIdentification89.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25#mmIdentification
	 * SafekeepingPlaceTypeAndText25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification79#mmIdentification
	 * GenericIdentification79.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmCashierIdentification
	 * SaleContext2.mmCashierIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification94#mmIdentification
	 * GenericIdentification94.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmIdentification
	 * GenericIdentification90.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification93#mmIdentification
	 * GenericIdentification93.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification92#mmIdentification
	 * GenericIdentification92.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1#mmAccountServicerIdentification
	 * GenericIdentificationSD1.mmAccountServicerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1#mmAccountOwnerIdentification
	 * GenericIdentificationSD1.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIdentification
	 * InvoiceHeader2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmQuotationDocumentIdentification
	 * TradeAgreement13.mmQuotationDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmContractDocumentIdentification
	 * TradeAgreement13.mmContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmBuyerOrderIdentificationDocument
	 * TradeAgreement13.mmBuyerOrderIdentificationDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmDeliveryNoteIdentification
	 * LineItem16.mmDeliveryNoteIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketClaimDetailsSD1#mmAccountServicerIdentification
	 * MarketClaimDetailsSD1.mmAccountServicerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketClaimDetailsSD1#mmAccountOwnerIdentification
	 * MarketClaimDetailsSD1.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueIdentification2#mmIdentification
	 * TradingVenueIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2#mmBillingIdentification
	 * BillingSearchCriteria2.mmBillingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmBillingIdentification
	 * BillingReport2.mmBillingIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPriceSource
	 * Debt3.mmPriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReference
	 * AdditionalReference8.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSecuritiesSettlementSystemIdentification
	 * FundSettlementParameters11.mmSecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification164#mmIdentification
	 * GenericIdentification164.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmSecuritiesSettlementSystemIdentification
	 * FundSettlementParameters12.mmSecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmClientIdentification
	 * InvestmentAccountOwnershipInformation15.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmClientIdentification
	 * InvestmentAccountOwnershipInformation14.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmMandateIdentification
	 * DirectDebitMandate6.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmReference
	 * AdditionalReference9.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionVenue
	 * RegulatoryReporting6.mmExecutionVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmStatusOriginator
	 * TradeData14.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmStatusOriginator
	 * TradeData12.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmStatusOriginator
	 * TradeData15.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmMandateIdentification
	 * Mandate10.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmRemittanceIdentification
	 * RemittanceInformation13.mmRemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmMandateIdentification
	 * Mandate9.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmMandateIdentification
	 * Mandate11.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmNumber
	 * ReferredMandateDocument1.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmMandateIdentification
	 * Mandate8.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmStatusOriginator
	 * TradeData16.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification165#mmIdentification
	 * GenericIdentification165.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification165#mmDescription
	 * GenericIdentification165.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification166#mmIdentification
	 * GenericIdentification166.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification166#mmDescription
	 * GenericIdentification166.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification169#mmIdentification
	 * GenericIdentification169.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification169#mmDescription
	 * GenericIdentification169.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StressedProduct1#mmIdentification
	 * StressedProduct1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification168#mmIdentification
	 * GenericIdentification168.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification168#mmDescription
	 * GenericIdentification168.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification172#mmIdentification
	 * GenericIdentification172.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification172#mmDescription
	 * GenericIdentification172.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification167#mmIdentification
	 * GenericIdentification167.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification167#mmDescription
	 * GenericIdentification167.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification170#mmIdentification
	 * GenericIdentification170.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification170#mmDescription
	 * GenericIdentification170.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification50#mmIdentification
	 * DocumentIdentification50.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageReference1#mmReference
	 * MessageReference1.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmIdentification
	 * InvoiceHeader3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmDeliveryNoteIdentification
	 * LineItem17.mmDeliveryNoteIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmQuotationDocumentIdentification
	 * TradeAgreement16.mmQuotationDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmContractDocumentIdentification
	 * TradeAgreement16.mmContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmBuyerOrderIdentificationDocument
	 * TradeAgreement16.mmBuyerOrderIdentificationDocument}</li>
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
	public static final MMBusinessAttribute<GenericIdentification, Max35Text> mmIdentification = new MMBusinessAttribute<GenericIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmIdentification, SimpleIdentificationInformation.mmIdentification, GenericIdentification1.mmIdentification, AccountIdentification3.mmIssuer,
					AdditionalReference2.mmReference, AdditionalReference3.mmReference, AlternateSecurityIdentification1.mmIdentification, GenericIdentification8.mmIdentification, GenericIdentification9.mmIdentification,
					InvestmentAccountOwnershipInformation5.mmClientIdentification, InvestmentAccountOwnershipInformation2.mmClientIdentification, BranchData.mmIdentification, DirectDebitMandate2.mmMandateIdentification,
					DirectDebitMandate3.mmMandateIdentification, DirectDebitMandate4.mmMandateIdentification, GenericIdentification13.mmIdentification, GenericIdentification20.mmIdentification, GenericIdentification25.mmIdentification,
					GenericIdentification47.mmIdentification, BlockedHoldingDetails1.mmHoldingCertificateNumber, GenericIdentification44.mmIdentification, GenericIdentification41.mmIdentification,
					PartyProfileInformation2.mmValidatingParty, PartyProfileInformation2.mmCheckingParty, PartyProfileInformation2.mmResponsibleParty, InvestmentAccountOwnershipInformation6.mmClientIdentification,
					GenericIdentification46.mmIdentification, GenericIdentification10.mmIdentification, InvestmentAccountOwnershipInformation3.mmClientIdentification, InvestmentAccountOwnershipInformation4.mmClientIdentification,
					InvestmentAccountOwnershipInformation7.mmClientIdentification, ClearingSystemMemberIdentification2.mmMemberIdentification, GenericIdentification3.mmIdentification, GenericFinancialIdentification1.mmIdentification,
					BranchData2.mmIdentification, SimpleIdentificationInformation2.mmIdentification, GenericAccountIdentification1.mmIdentification, GenericIdentification4.mmIdentification,
					GenericOrganisationIdentification1.mmIdentification, GenericPersonIdentification1.mmIdentification, AdditionalReferences.mmReference, SecuritiesAccount13.mmIdentification, GenericIdentification19.mmIdentification,
					SecuritiesAccount17.mmIdentification, GenericIdentification24.mmIdentification, GenericOrganisationIdentification2.mmIdentification, AlternateIdentification1.mmIdentification, OtherIdentification1.mmIdentification,
					GenericIdentification14.mmIdentification, GenericIdentification37.mmIdentification, SafekeepingPlaceTypeAndText3.mmIdentification, GenericIdentification21.mmIdentification,
					AlternatePartyIdentification1.mmAlternateIdentification, AlternatePartyIdentification2.mmAlternateIdentification, SecuritiesCertificate1.mmNumber, OtherIdentification2.mmIdentification,
					GenericIdentification23.mmIdentification, GenericIdentification18.mmIdentification, GenericIdentification39.mmIdentification, SafekeepingPlaceTypeAndText4.mmIdentification, GenericIdentification26.mmIdentification,
					AlternatePartyIdentification3.mmAlternateIdentification, SecuritiesCertificate2.mmNumber, GenericIdentification27.mmIdentification, DocumentIdentification11.mmIdentification,
					SafekeepingPlaceTypeAndText2.mmIdentification, DocumentIdentification16.mmIdentification, AlternateIdentification2.mmIdentification, SafekeepingPlaceTypeAndText5.mmIdentification,
					DocumentIdentification9.mmIdentification, DocumentIdentification1Choice.mmAccountServicerDocumentIdentification, DocumentIdentification1Choice.mmAccountOwnerDocumentIdentification,
					DocumentIdentification14.mmIdentification, DocumentIdentification17.mmIdentification, DocumentIdentification2Choice.mmAccountServicerDocumentIdentification,
					DocumentIdentification2Choice.mmAccountOwnerDocumentIdentification, DocumentIdentification21.mmIdentification, DocumentIdentification12.mmIdentification, DocumentIdentification15.mmIdentification,
					DocumentIdentification13.mmIdentification, DocumentIdentification18.mmIdentification, DocumentIdentification19.mmIdentification, DocumentIdentification20.mmIdentification, OtherIdentification3.mmIdentification,
					SecuritiesAccount11.mmIdentification, GenericIdentification22.mmIdentification, SecuritiesAccount2.mmIdentification, SecuritiesAccount14.mmIdentification, SecuritiesAccount15.mmIdentification,
					SimpleIdentificationInformation4.mmIdentification, SimpleIdentificationInformation1.mmIdentification, GenericIdentification28.mmIdentification, SecuritiesAccount16.mmIdentification,
					GenericIdentification34.mmIdentification, GenericIdentification38.mmIdentification, GenericIdentification29.mmIdentification, AlternatePartyIdentification5.mmAlternateIdentification,
					AlternatePartyIdentification6.mmAlternateIdentification, SecuritiesAccount3.mmIdentification, FinancialInstrumentStipulations.mmPriceSource, GenericIdentification36.mmIdentification,
					FinancialInstrumentStipulations2.mmPriceSource, ProprietaryBankTransactionCodeStructure1.mmCode, OperationMandate1.mmIdentification, ReferredDocumentInformation1.mmReferredDocumentNumber,
					AlternateSecurityIdentification2.mmIdentification, ReferredDocumentInformation3.mmNumber, GenericIdentification32.mmIdentification, PointOfInteractionComponent1.mmManufacturerIdentification, Document9.mmIdentification,
					MandateInformation1.mmMandateIdentification, Mandate1.mmMandateIdentification, MandateInformation3.mmMandateIdentification, Mandate3.mmMandateIdentification, MandateInformation2.mmMandateIdentification,
					Mandate2.mmMandateIdentification, Mandate4.mmMandateIdentification, TradeData1.mmMatchingSystemUniqueReference, TradeData10.mmStatusOriginator, NameAndAddress8.mmAlternativeIdentifier,
					RegulatoryReporting1.mmReportingJurisdiction, RegulatoryReporting1.mmExecutionVenue, TradeAgreement2.mmRelatedReference, TradeAgreement4.mmRelatedReference, FundIdentification1.mmAccountIdentificationWithCustodian,
					FundIdentification2.mmAccountIdentificationWithCustodian, FundIdentification3.mmAccountIdentificationWithCustodian, FundIdentification4.mmAccountIdentificationWithCustodian, TradeAgreement5.mmRelatedReference,
					TradeData9.mmStatusOriginator, TradeData7.mmStatusOriginator, GenericIdentification35.mmIdentification, PointOfInteractionComponent2.mmManufacturerIdentification,
					PointOfInteractionComponentIdentification1.mmProviderIdentification, GenericIdentification48.mmIdentification, PointOfInteractionComponentAssessment1.mmAssigner, GenericIdentification31.mmIdentification,
					SaleContext1.mmCashierIdentification, CardholderIdentification1.mmCardholderIdentificationValue, GenericIdentification33.mmIdentification, FundSettlementParameters3.mmSecuritiesSettlementSystemIdentification,
					GenericIdentification11.mmIdentification, FundSettlementParameters4.mmSecuritiesSettlementSystemIdentification, StructuredRemittanceInformation2.mmDocumentReferenceNumber,
					AlternateFinancialInstrumentIdentification1.mmIdentification, EligiblePosition.mmAccountIdentification, SafekeepingAccount3.mmAccountIdentification, SafekeepingAccount4.mmAccountIdentification,
					MeetingInstructionDetailedStatus.mmAccountIdentification, EligiblePosition1.mmAccountIdentification, DocumentIdentification8.mmIdentification, AccountIdentification2Choice.mmCashAccountIdentification,
					AccountIdentification2Choice.mmSecuritiesAccountIdentification, SecuritiesAccount7.mmAccountIdentification, SecuritiesAccount9.mmAccountIdentification, GenericIdentification16.mmIdentification,
					ProceedsDelivery1.mmSecuritiesAccountIdentification, SecuritiesAccount12.mmAccountIdentification, CorporateActionMovement1.mmAccountIdentification, SecuritiesAccount8.mmAccountIdentification,
					SecuritiesAccount10.mmAccountIdentification, SecuritiesAccount6.mmSecuritiesAccountIdentification, IdentificationModification1.mmIdentification, IdentificationModification2.mmIdentification,
					TradeStatus1.mmStatusOriginator, DocumentGeneralInformation1.mmDocumentNumber, ReferredDocumentInformation2.mmDocumentNumber, OriginalInvoiceInformation1.mmDocumentNumber, LegalOrganisation1.mmIdentification,
					InvoiceHeader1.mmIdentification, DocumentIdentification22.mmIdentification, DocumentGeneralInformation2.mmDocumentNumber, TradeAgreement6.mmQuotationDocumentIdentification,
					TradeAgreement6.mmContractDocumentIdentification, TradeAgreement6.mmBuyerOrderIdentificationDocument, DocumentIdentification7.mmIdentification, TradeSettlement1.mmLetterOfCreditReferencedDocument,
					DocumentIdentification23.mmIdentification, LineItem10.mmDeliveryNoteIdentification, DocumentIdentification3.mmIdentification, DocumentIdentification5.mmIdentification, DocumentIdentification1.mmIdentification,
					AirportDescription1.mmAirportName, DocumentIdentification4.mmIdentification, DocumentIdentification6.mmIdentification, DocumentIdentification2.mmIdentification, DocumentIdentification10.mmIdentification,
					MultimodalTransport2.mmTransitLocation, InvoiceIdentification1.mmInvoiceNumber, InsuranceDataSet1.mmInsuranceDocumentIdentification, CertificateDataSet1.mmCertificateIdentification,
					OtherCertificateDataSet1.mmCertificateIdentification, GenericIdentification30.mmIdentification, Agreement2.mmAgreementIdentification, AccountIdentification5.mmIdentification,
					AlternatePartyIdentification4.mmAlternateIdentification, BillingSubServiceIdentification1.mmIssuer, BillingSubServiceIdentification1.mmIdentification, BillingServiceCommonIdentification1.mmIdentification,
					BillingTaxRegion1.mmInvoiceNumber, BillingStatement1.mmStatementIdentification, AdditionalReference4.mmReference, SecuritiesAccount5.mmIdentification, GenericIdentification12.mmIdentification,
					RestrictedIdentification2.mmIdentification, RestrictedIdentification1.mmIdentification, GenericIdentification17.mmIdentification, AdditionalReference5.mmReference, SimpleIdentificationInformation3.mmIdentification,
					AlternateSecurityIdentification4.mmIdentification, GenericIdentification40.mmIdentification, GenericIdentification15.mmIdentification, Debt2.mmPriceSource, Agreement1.mmIdentification,
					DocumentIdentification27.mmIdentification, SafekeepingPlaceTypeAndText1.mmIdentification, BillingReport1.mmBillingIdentification, BillingCancellationReport1.mmBillingIdentification,
					BillingSearchCriteria1.mmBillingIdentification, InvestmentAccountOwnershipInformation8.mmClientIdentification, InvestmentAccountOwnershipInformation9.mmClientIdentification, PartyProfileInformation3.mmValidatingParty,
					PartyProfileInformation3.mmCheckingParty, PartyProfileInformation3.mmResponsibleParty, DocumentLineType1.mmIssuer, RemittanceInformation8.mmRemittanceIdentification, DocumentLineInformation1.mmIdentification,
					SecuritiesAccount22.mmIdentification, CertificateDataSet2.mmDataSetIdentification, CertificateDataSet2.mmCertificateIdentification, GenericIdentification49.mmIdentification, GenericIdentification51.mmIdentification,
					RegulatoryReporting4.mmExecutionVenue, CounterpartySideTransactionReporting1.mmReportingJurisdiction, TradingSideTransactionReporting1.mmReportingJurisdiction,
					UpdatedAdditionalInformation6SD2.mmFullLocalLanguageSecurityName, OtherIdentification2SD1.mmLocalLanguageSecurityName, InvestmentAccountOwnershipInformation10.mmClientIdentification,
					GenericIdentification55.mmIdentification, InvestmentAccountOwnershipInformation11.mmClientIdentification, PartyProfileInformation4.mmValidatingParty, PartyProfileInformation4.mmCheckingParty,
					PartyProfileInformation4.mmResponsibleParty, Mandate7.mmMandateIdentification, Mandate6.mmMandateIdentification, Mandate5.mmMandateIdentification, ReferredDocumentInformation6.mmNumber,
					OtherCertificateDataSet2.mmCertificateIdentification, GenericIdentification56.mmIdentification, GenericIdentification58.mmIdentification, OtherIdentification4.mmIdentification,
					SafekeepingAccount6.mmAccountIdentification, GenericIdentification65.mmIdentification, GenericIdentification63.mmIdentification, GenericIdentification66.mmIdentification, GenericIdentification62.mmIdentification,
					GenericIdentification60.mmIdentification, GenericIdentification64.mmIdentification, GenericIdentification59.mmIdentification, GenericIdentification61.mmIdentification, GenericIdentification67.mmIdentification,
					GenericIdentification53.mmIdentification, GenericIdentification71.mmIdentification, GenericIdentification73.mmIdentification, GenericIdentification74.mmIdentification, GenericIdentification72.mmIdentification,
					GenericIdentification70.mmIdentification, GenericIdentification75.mmIdentification, GenericIdentification76.mmIdentification, BusinessLetter1.mmLetterIdentifier, QualifiedDocumentInformation1.mmItemListIdentifier,
					QualifiedDocumentInformation1.mmItemIdentifier, ATMCommandIdentification1.mmProcessor, GenericIdentification77.mmIdentification, AdditionalReference6.mmReference, SecuritiesAccount24.mmIdentification,
					AlternatePartyIdentification7.mmAlternateIdentification, AlternateIdentification3.mmIdentification, GenericIdentification78.mmIdentification, SafekeepingPlaceTypeAndText6.mmIdentification,
					SecuritiesTradeVenueCriteria1Choice.mmAnyMIC, DocumentIdentification29.mmIdentification, SupportingDocumentEntry1.mmEntryIdentification, DocumentGeneralInformation3.mmDocumentNumber,
					TradeContract1.mmContractDocumentIdentification, InterestPaymentDateRange1.mmInterestScheduleIdentification, LegalOrganisation2.mmIdentification, DocumentIdentification28.mmIdentification,
					TransactionCertificateRecord1.mmCertificateRecordIdentification, ContractClosureReason1Choice.mmCode, ContractClosureReason1Choice.mmProprietary, SecuritiesAccount26.mmIdentification, SecuritiesCertificate4.mmNumber,
					SafekeepingPlaceTypeAndText8.mmIdentification, SecuritiesAccount25.mmIdentification, GenericIdentification80.mmIdentification, RemittanceInformation12.mmRemittanceIdentification, ReferredDocumentInformation7.mmNumber,
					BillingStatement2.mmStatementIdentification, AlternateIdentification4.mmIdentification, DocumentIdentification31.mmIdentification, DocumentIdentification32.mmIdentification, DocumentIdentification33.mmIdentification,
					DocumentIdentification3Choice.mmAccountServicerDocumentIdentification, DocumentIdentification3Choice.mmAccountOwnerDocumentIdentification, AdditionalReference7.mmReference, GenericIdentification81.mmIdentification,
					DirectDebitMandate5.mmMandateIdentification, AlternateSecurityIdentification7.mmIdentification, InvestmentAccountOwnershipInformation12.mmClientIdentification, GenericIdentification82.mmIdentification,
					PartyProfileInformation5.mmValidatingParty, PartyProfileInformation5.mmCheckingParty, PartyProfileInformation5.mmResponsibleParty, InvestmentAccountOwnershipInformation13.mmClientIdentification,
					BlockedHoldingDetails2.mmHoldingCertificateNumber, Agreement4.mmAgreementIdentification, AlternatePartyIdentification8.mmAlternateIdentification, DocumentIdentification38.mmIdentification,
					DocumentIdentification37.mmIdentification, DocumentIdentification34.mmIdentification, GenericIdentification84.mmIdentification, DocumentIdentification4Choice.mmAccountServicerDocumentIdentification,
					DocumentIdentification4Choice.mmAccountOwnerDocumentIdentification, SafekeepingPlaceTypeAndText9.mmIdentification, GenericIdentification85.mmIdentification, SafekeepingPlaceTypeAndText15.mmIdentification,
					AlternatePartyIdentification9.mmAlternateIdentification, GenericIdentification86.mmIdentification, SecuritiesAccount33.mmIdentification, SecuritiesAccount27.mmIdentification, SecuritiesCertificate5.mmNumber,
					GenericIdentification144.mmIdentification, GenericIdentification163.mmIdentification, SecuritiesAccount34.mmIdentification, DocumentIdentification49.mmIdentification, GenericIdentification89.mmIdentification,
					SafekeepingPlaceTypeAndText25.mmIdentification, GenericIdentification79.mmIdentification, SaleContext2.mmCashierIdentification, GenericIdentification94.mmIdentification, GenericIdentification90.mmIdentification,
					GenericIdentification93.mmIdentification, GenericIdentification92.mmIdentification, GenericIdentificationSD1.mmAccountServicerIdentification, GenericIdentificationSD1.mmAccountOwnerIdentification,
					InvoiceHeader2.mmIdentification, TradeAgreement13.mmQuotationDocumentIdentification, TradeAgreement13.mmContractDocumentIdentification, TradeAgreement13.mmBuyerOrderIdentificationDocument,
					LineItem16.mmDeliveryNoteIdentification, MarketClaimDetailsSD1.mmAccountServicerIdentification, MarketClaimDetailsSD1.mmAccountOwnerIdentification, TradingVenueIdentification2.mmIdentification,
					BillingSearchCriteria2.mmBillingIdentification, BillingReport2.mmBillingIdentification, Debt3.mmPriceSource, AdditionalReference8.mmReference, FundSettlementParameters11.mmSecuritiesSettlementSystemIdentification,
					GenericIdentification164.mmIdentification, FundSettlementParameters12.mmSecuritiesSettlementSystemIdentification, InvestmentAccountOwnershipInformation15.mmClientIdentification,
					InvestmentAccountOwnershipInformation14.mmClientIdentification, DirectDebitMandate6.mmMandateIdentification, AdditionalReference9.mmReference, RegulatoryReporting6.mmExecutionVenue, TradeData14.mmStatusOriginator,
					TradeData12.mmStatusOriginator, TradeData15.mmStatusOriginator, Mandate10.mmMandateIdentification, RemittanceInformation13.mmRemittanceIdentification, Mandate9.mmMandateIdentification, Mandate11.mmMandateIdentification,
					ReferredMandateDocument1.mmNumber, Mandate8.mmMandateIdentification, TradeData16.mmStatusOriginator, GenericIdentification165.mmIdentification, GenericIdentification165.mmDescription,
					GenericIdentification166.mmIdentification, GenericIdentification166.mmDescription, GenericIdentification169.mmIdentification, GenericIdentification169.mmDescription, StressedProduct1.mmIdentification,
					GenericIdentification168.mmIdentification, GenericIdentification168.mmDescription, GenericIdentification172.mmIdentification, GenericIdentification172.mmDescription, GenericIdentification167.mmIdentification,
					GenericIdentification167.mmDescription, GenericIdentification170.mmIdentification, GenericIdentification170.mmDescription, DocumentIdentification50.mmIdentification, MessageReference1.mmReference,
					InvoiceHeader3.mmIdentification, LineItem17.mmDeliveryNoteIdentification, TradeAgreement16.mmQuotationDocumentIdentification, TradeAgreement16.mmContractDocumentIdentification,
					TradeAgreement16.mmBuyerOrderIdentificationDocument);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(GenericIdentification obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected List<ContactPoint> identificationForContactPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
	 * ContactPoint.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, List<ContactPoint>> mmIdentificationForContactPoint = new MMBusinessAssociationEnd<GenericIdentification, List<ContactPoint>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForContactPoint";
			definition = "Contact point which uses a generic identification as identification.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(GenericIdentification obj) {
			return obj.getIdentificationForContactPoint();
		}

		@Override
		public void setValue(GenericIdentification obj, List<ContactPoint> value) {
			obj.setIdentificationForContactPoint(value);
		}
	};
	protected AccountIdentification identificationForAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, AccountIdentification> mmIdentificationForAccount = new MMBusinessAssociationEnd<GenericIdentification, AccountIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccount";
			definition = "Account Identification which uses a generic identification as proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountIdentification.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}

		@Override
		public AccountIdentification getValue(GenericIdentification obj) {
			return obj.getIdentificationForAccount();
		}

		@Override
		public void setValue(GenericIdentification obj, AccountIdentification value) {
			obj.setIdentificationForAccount(value);
		}
	};
	protected PartyIdentificationInformation relatedPartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<PartyIdentificationInformation>> mmRelatedPartyIdentification = new MMBusinessAssociationEnd<GenericIdentification, Optional<PartyIdentificationInformation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Party identified with a scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public Optional<PartyIdentificationInformation> getValue(GenericIdentification obj) {
			return obj.getRelatedPartyIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<PartyIdentificationInformation> value) {
			obj.setRelatedPartyIdentification(value.orElse(null));
		}
	};
	protected ISODate issueDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#mmIssueDate
	 * GenericIdentification9.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification44#mmIssueDate
	 * GenericIdentification44.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#mmIssueDate
	 * GenericIdentification55.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssueDate
	 * AlternateIdentification4.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIssueDate
	 * GenericIdentification82.mmIssueDate}</li>
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
	public static final MMBusinessAttribute<GenericIdentification, ISODate> mmIssueDate = new MMBusinessAttribute<GenericIdentification, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(GenericIdentification9.mmIssueDate, GenericIdentification44.mmIssueDate, GenericIdentification55.mmIssueDate, AlternateIdentification4.mmIssueDate, GenericIdentification82.mmIssueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(GenericIdentification obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(GenericIdentification obj, ISODate value) {
			obj.setIssueDate(value);
		}
	};
	protected ISODate expiryDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#mmExpiryDate
	 * GenericIdentification9.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification44#mmExpiryDate
	 * GenericIdentification44.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#mmExpiryDate
	 * GenericIdentification55.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmExpiryDate
	 * AlternateIdentification4.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmExpiryDate
	 * GenericIdentification82.mmExpiryDate}</li>
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
	public static final MMBusinessAttribute<GenericIdentification, ISODate> mmExpiryDate = new MMBusinessAttribute<GenericIdentification, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(GenericIdentification9.mmExpiryDate, GenericIdentification44.mmExpiryDate, GenericIdentification55.mmExpiryDate, AlternateIdentification4.mmExpiryDate, GenericIdentification82.mmExpiryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(GenericIdentification obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(GenericIdentification obj, ISODate value) {
			obj.setExpiryDate(value);
		}
	};
	protected Scheme scheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
	 * Scheme.mmIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmSchemeName
	 * GenericFinancialIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmSchemeName
	 * GenericAccountIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmSchemeName
	 * GenericOrganisationIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmSchemeName
	 * GenericPersonIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification2#mmSchemeName
	 * GenericOrganisationIdentification2.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueIdentification2#mmType
	 * TradingVenueIdentification2.mmType}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Scheme> mmScheme = new MMBusinessAssociationEnd<GenericIdentification, Scheme>() {
		{
			derivation_lazy = () -> Arrays.asList(GenericFinancialIdentification1.mmSchemeName, GenericAccountIdentification1.mmSchemeName, GenericOrganisationIdentification1.mmSchemeName, GenericPersonIdentification1.mmSchemeName,
					GenericOrganisationIdentification2.mmSchemeName, TradingVenueIdentification2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding an enumerated code list and its owner.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Scheme.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}

		@Override
		public Scheme getValue(GenericIdentification obj) {
			return obj.getScheme();
		}

		@Override
		public void setValue(GenericIdentification obj, Scheme value) {
			obj.setScheme(value);
		}
	};
	protected SecuritiesCertificate identificationForSecuritiesCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, SecuritiesCertificate> mmIdentificationForSecuritiesCertificate = new MMBusinessAssociationEnd<GenericIdentification, SecuritiesCertificate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSecuritiesCertificate";
			definition = "Securities certificate which uses a generic identification as certificate number.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesCertificate.mmNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesCertificate.mmObject();
		}

		@Override
		public SecuritiesCertificate getValue(GenericIdentification obj) {
			return obj.getIdentificationForSecuritiesCertificate();
		}

		@Override
		public void setValue(GenericIdentification obj, SecuritiesCertificate value) {
			obj.setIdentificationForSecuritiesCertificate(value);
		}
	};
	protected LotBreakdown identificationForLot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<LotBreakdown>> mmIdentificationForLot = new MMBusinessAssociationEnd<GenericIdentification, Optional<LotBreakdown>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForLot";
			definition = "Lot breakdown which uses a generic identification as lot number.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LotBreakdown.mmLotNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}

		@Override
		public Optional<LotBreakdown> getValue(GenericIdentification obj) {
			return obj.getIdentificationForLot();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<LotBreakdown> value) {
			obj.setIdentificationForLot(value.orElse(null));
		}
	};
	protected List<InformationPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
	 * InformationPartyRole.mmGenericIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#mmIssuer
	 * ProprietaryQuantity3.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity2#mmIssuer
	 * ProprietaryQuantity2.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity5#mmIssuer
	 * ProprietaryQuantity5.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity4#mmIssuer
	 * ProprietaryQuantity4.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification6#mmIssuer
	 * PersonIdentification6.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity6#mmIssuer
	 * ProprietaryQuantity6.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity8#mmIssuer
	 * ProprietaryQuantity8.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmIssuer
	 * ProprietaryQuantity7.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity10#mmIssuer
	 * ProprietaryQuantity10.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity9#mmIssuer
	 * ProprietaryQuantity9.mmIssuer}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, List<InformationPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<GenericIdentification, List<InformationPartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(ProprietaryQuantity3.mmIssuer, ProprietaryQuantity2.mmIssuer, ProprietaryQuantity5.mmIssuer, ProprietaryQuantity4.mmIssuer, PersonIdentification6.mmIssuer, ProprietaryQuantity6.mmIssuer,
					ProprietaryQuantity8.mmIssuer, ProprietaryQuantity7.mmIssuer, ProprietaryQuantity10.mmIssuer, ProprietaryQuantity9.mmIssuer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Entity that assigns the identification.";
			minOccurs = 0;
			opposite_lazy = () -> InformationPartyRole.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}

		@Override
		public List<InformationPartyRole> getValue(GenericIdentification obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(GenericIdentification obj, List<InformationPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected CashProceedsDefinition identificationForCashProceedsIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<CashProceedsDefinition>> mmIdentificationForCashProceedsIncome = new MMBusinessAssociationEnd<GenericIdentification, Optional<CashProceedsDefinition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForCashProceedsIncome";
			definition = "Cash proceeds definition which uses a generic identification as type of income.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashProceedsDefinition.mmIncomeType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashProceedsDefinition.mmObject();
		}

		@Override
		public Optional<CashProceedsDefinition> getValue(GenericIdentification obj) {
			return obj.getIdentificationForCashProceedsIncome();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<CashProceedsDefinition> value) {
			obj.setIdentificationForCashProceedsIncome(value.orElse(null));
		}
	};
	protected StatusReason relatedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, StatusReason> mmRelatedStatusReason = new MMBusinessAssociationEnd<GenericIdentification, StatusReason>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedStatusReason";
			definition = "Specifies the status reason for which a data source scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> StatusReason.mmDataSourceScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StatusReason.mmObject();
		}

		@Override
		public StatusReason getValue(GenericIdentification obj) {
			return obj.getRelatedStatusReason();
		}

		@Override
		public void setValue(GenericIdentification obj, StatusReason value) {
			obj.setRelatedStatusReason(value);
		}
	};
	protected List<BankTransaction> identificationForBankTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
	 * BankTransaction.mmProprietaryIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, List<BankTransaction>> mmIdentificationForBankTransaction = new MMBusinessAssociationEnd<GenericIdentification, List<BankTransaction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForBankTransaction";
			definition = "Bank transaction which uses a generic identification as proprietary identification.";
			minOccurs = 0;
			opposite_lazy = () -> BankTransaction.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}

		@Override
		public List<BankTransaction> getValue(GenericIdentification obj) {
			return obj.getIdentificationForBankTransaction();
		}

		@Override
		public void setValue(GenericIdentification obj, List<BankTransaction> value) {
			obj.setIdentificationForBankTransaction(value);
		}
	};
	protected AccountIdentification identificationForAccountCostReferencePattern;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
	 * AccountIdentification.mmCostReferencePattern}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<AccountIdentification>> mmIdentificationForAccountCostReferencePattern = new MMBusinessAssociationEnd<GenericIdentification, Optional<AccountIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccountCostReferencePattern";
			definition = "Account identification for which a cost reference pattern is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AccountIdentification.mmCostReferencePattern;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}

		@Override
		public Optional<AccountIdentification> getValue(GenericIdentification obj) {
			return obj.getIdentificationForAccountCostReferencePattern();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<AccountIdentification> value) {
			obj.setIdentificationForAccountCostReferencePattern(value.orElse(null));
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Account> mmAccount = new MMBusinessAssociationEnd<GenericIdentification, Account>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a type is specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Account.mmType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Account getValue(GenericIdentification obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(GenericIdentification obj, Account value) {
			obj.setAccount(value);
		}
	};
	protected SystemIdentification relatedSystemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, SystemIdentification> mmRelatedSystemIdentification = new MMBusinessAssociationEnd<GenericIdentification, SystemIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSystemIdentification";
			definition = "System identification which uses a generic identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemIdentification.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemIdentification.mmObject();
		}

		@Override
		public SystemIdentification getValue(GenericIdentification obj) {
			return obj.getRelatedSystemIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, SystemIdentification value) {
			obj.setRelatedSystemIdentification(value);
		}
	};
	protected Interest identificationForInterestName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestName
	 * Interest.mmInterestName}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<Interest>> mmIdentificationForInterestName = new MMBusinessAssociationEnd<GenericIdentification, Optional<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInterestName";
			definition = "Interest which uses a generic identification as name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Interest.mmInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public Optional<Interest> getValue(GenericIdentification obj) {
			return obj.getIdentificationForInterestName();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<Interest> value) {
			obj.setIdentificationForInterestName(value.orElse(null));
		}
	};
	protected CashAccountService relatedCashAccountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
	 * CashAccountService.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, CashAccountService> mmRelatedCashAccountService = new MMBusinessAssociationEnd<GenericIdentification, CashAccountService>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashAccountService";
			definition = "Cash account service identified in a generic way.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAccountService.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccountService.mmObject();
		}

		@Override
		public CashAccountService getValue(GenericIdentification obj) {
			return obj.getRelatedCashAccountService();
		}

		@Override
		public void setValue(GenericIdentification obj, CashAccountService value) {
			obj.setRelatedCashAccountService(value);
		}
	};
	protected InvestmentFundClass identificationForInvestmentFundClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
	 * InvestmentFundClass.mmFundClassification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, InvestmentFundClass> mmIdentificationForInvestmentFundClass = new MMBusinessAssociationEnd<GenericIdentification, InvestmentFundClass>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInvestmentFundClass";
			definition = "Investment fund class which uses a generic identification as fund classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundClass.mmFundClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClass.mmObject();
		}

		@Override
		public InvestmentFundClass getValue(GenericIdentification obj) {
			return obj.getIdentificationForInvestmentFundClass();
		}

		@Override
		public void setValue(GenericIdentification obj, InvestmentFundClass value) {
			obj.setIdentificationForInvestmentFundClass(value);
		}
	};
	protected Location identifiedLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIdentification
	 * Location.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Location> mmIdentifiedLocation = new MMBusinessAssociationEnd<GenericIdentification, Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedLocation";
			definition = "Location for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Location.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Location getValue(GenericIdentification obj) {
			return obj.getIdentifiedLocation();
		}

		@Override
		public void setValue(GenericIdentification obj, Location value) {
			obj.setIdentifiedLocation(value);
		}
	};
	protected SecuritiesIdentification relatedSecuritiesIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
	 * SecuritiesIdentification.mmGenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmBasketConstituents
	 * SecurityIdentification19Choice.mmBasketConstituents}</li>
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
	 * name} = "RelatedSecuritiesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities identification for which generic identification elements and scheme are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, SecuritiesIdentification> mmRelatedSecuritiesIdentification = new MMBusinessAssociationEnd<GenericIdentification, SecuritiesIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification19Choice.mmBasketConstituents);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which generic identification elements and scheme are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public SecuritiesIdentification getValue(GenericIdentification obj) {
			return obj.getRelatedSecuritiesIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, SecuritiesIdentification value) {
			obj.setRelatedSecuritiesIdentification(value);
		}
	};
	protected Document identifiedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, Document> mmIdentifiedDocument = new MMBusinessAssociationEnd<GenericIdentification, Document>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedDocument";
			definition = "Document for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Document.mmDocumentIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public Document getValue(GenericIdentification obj) {
			return obj.getIdentifiedDocument();
		}

		@Override
		public void setValue(GenericIdentification obj, Document value) {
			obj.setIdentifiedDocument(value);
		}
	};
	protected PurchaseOrder relatedPurchaseOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
	 * PurchaseOrder.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, PurchaseOrder> mmRelatedPurchaseOrder = new MMBusinessAssociationEnd<GenericIdentification, PurchaseOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPurchaseOrder";
			definition = "Purchase order for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PurchaseOrder.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PurchaseOrder.mmObject();
		}

		@Override
		public PurchaseOrder getValue(GenericIdentification obj) {
			return obj.getRelatedPurchaseOrder();
		}

		@Override
		public void setValue(GenericIdentification obj, PurchaseOrder value) {
			obj.setRelatedPurchaseOrder(value);
		}
	};
	protected RegisteredContract relatedCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
	 * RegisteredContract.mmCertificate}</li>
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
	public static final MMBusinessAssociationEnd<GenericIdentification, RegisteredContract> mmRelatedCertificate = new MMBusinessAssociationEnd<GenericIdentification, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCertificate";
			definition = "Related certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(GenericIdentification obj) {
			return obj.getRelatedCertificate();
		}

		@Override
		public void setValue(GenericIdentification obj, RegisteredContract value) {
			obj.setRelatedCertificate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification";
				definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentFundClass.mmFundClassification, SecuritiesIdentification.mmGenericIdentification, InformationPartyRole.mmGenericIdentification, ContactPoint.mmIdentification,
						PartyIdentificationInformation.mmOtherIdentification, Account.mmType, AccountIdentification.mmProprietaryIdentification, AccountIdentification.mmCostReferencePattern, Location.mmIdentification,
						Scheme.mmIdentification, Document.mmDocumentIdentification, StatusReason.mmDataSourceScheme, SystemIdentification.mmIdentification, LotBreakdown.mmLotNumber, CashAccountService.mmIdentification,
						SecuritiesCertificate.mmNumber, Interest.mmInterestName, CashProceedsDefinition.mmIncomeType, BankTransaction.mmProprietaryIdentification, PurchaseOrder.mmIdentification, RegisteredContract.mmCertificate);
				derivationElement_lazy = () -> Arrays.asList(OtherIdentification1Choice.mmProprietary, GenericIdentification46.mmType, GenericIdentification14.mmType, GenericIdentification21.mmType, GenericIdentification26.mmType,
						PreAllocation1.mmAllocationIdentification, PreAllocation1.mmIndividualAllocationIdentification, GenericIdentification32.mmType, GenericIdentification35.mmType, GenericIdentification31.mmType,
						GenericIdentification33.mmType, ReversedStatus1.mmDataSourceScheme, RejectedCancellationStatusReason1Choice.mmDataSourceScheme, GenericIdentification55.mmIssuerCountry, OtherIdentification2Choice.mmProprietary,
						GenericIdentification58.mmType, GenericIdentification59.mmType, GenericIdentification61.mmType, GenericIdentification53.mmType, GenericIdentification71.mmType, GenericIdentification73.mmType,
						GenericIdentification74.mmType, GenericIdentification70.mmType, GenericIdentification75.mmType, GenericIdentification76.mmType, GenericIdentification77.mmType, GenericIdentification78.mmType,
						GenericIdentification80.mmType, AlternateIdentification4.mmIssuerCountry, OtherIdentification4Choice.mmProprietary, GenericIdentification81.mmIdentificationType, ReversedStatus2Choice.mmDataSourceScheme,
						PostalAddress21.mmCareOf, GenericIdentification82.mmIssuerCountry, OtherIdentification3Choice.mmProprietary, GenericIdentification85.mmType, GenericIdentification89.mmType, GenericIdentification94.mmType,
						GenericIdentification90.mmType, GenericIdentification92.mmType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForContactPoint,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount, com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIssueDate, com.tools20022.repository.entity.GenericIdentification.mmExpiryDate, com.tools20022.repository.entity.GenericIdentification.mmScheme,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForSecuritiesCertificate, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot,
						com.tools20022.repository.entity.GenericIdentification.mmPartyRole, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForCashProceedsIncome,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedStatusReason, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForBankTransaction,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.GenericIdentification.mmAccount,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedSystemIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCashAccountService, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedLocation, com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument, com.tools20022.repository.entity.GenericIdentification.mmRelatedPurchaseOrder,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCertificate);
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
						AdditionalReference9.mmObject(), GenericIdentification165.mmObject(), GenericIdentification166.mmObject(), GenericIdentification169.mmObject(), StressedProduct1.mmObject(), GenericIdentification168.mmObject(),
						GenericIdentification172.mmObject(), GenericIdentification167.mmObject(), GenericIdentification170.mmObject(), MessageReference1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return GenericIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public GenericIdentification setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<ContactPoint> getIdentificationForContactPoint() {
		return identificationForContactPoint == null ? identificationForContactPoint = new ArrayList<>() : identificationForContactPoint;
	}

	public GenericIdentification setIdentificationForContactPoint(List<ContactPoint> identificationForContactPoint) {
		this.identificationForContactPoint = Objects.requireNonNull(identificationForContactPoint);
		return this;
	}

	public AccountIdentification getIdentificationForAccount() {
		return identificationForAccount;
	}

	public GenericIdentification setIdentificationForAccount(AccountIdentification identificationForAccount) {
		this.identificationForAccount = Objects.requireNonNull(identificationForAccount);
		return this;
	}

	public Optional<PartyIdentificationInformation> getRelatedPartyIdentification() {
		return relatedPartyIdentification == null ? Optional.empty() : Optional.of(relatedPartyIdentification);
	}

	public GenericIdentification setRelatedPartyIdentification(PartyIdentificationInformation relatedPartyIdentification) {
		this.relatedPartyIdentification = relatedPartyIdentification;
		return this;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public GenericIdentification setIssueDate(ISODate issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public GenericIdentification setExpiryDate(ISODate expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public GenericIdentification setScheme(Scheme scheme) {
		this.scheme = Objects.requireNonNull(scheme);
		return this;
	}

	public SecuritiesCertificate getIdentificationForSecuritiesCertificate() {
		return identificationForSecuritiesCertificate;
	}

	public GenericIdentification setIdentificationForSecuritiesCertificate(SecuritiesCertificate identificationForSecuritiesCertificate) {
		this.identificationForSecuritiesCertificate = Objects.requireNonNull(identificationForSecuritiesCertificate);
		return this;
	}

	public Optional<LotBreakdown> getIdentificationForLot() {
		return identificationForLot == null ? Optional.empty() : Optional.of(identificationForLot);
	}

	public GenericIdentification setIdentificationForLot(LotBreakdown identificationForLot) {
		this.identificationForLot = identificationForLot;
		return this;
	}

	public List<InformationPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public GenericIdentification setPartyRole(List<InformationPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<CashProceedsDefinition> getIdentificationForCashProceedsIncome() {
		return identificationForCashProceedsIncome == null ? Optional.empty() : Optional.of(identificationForCashProceedsIncome);
	}

	public GenericIdentification setIdentificationForCashProceedsIncome(CashProceedsDefinition identificationForCashProceedsIncome) {
		this.identificationForCashProceedsIncome = identificationForCashProceedsIncome;
		return this;
	}

	public StatusReason getRelatedStatusReason() {
		return relatedStatusReason;
	}

	public GenericIdentification setRelatedStatusReason(StatusReason relatedStatusReason) {
		this.relatedStatusReason = Objects.requireNonNull(relatedStatusReason);
		return this;
	}

	public List<BankTransaction> getIdentificationForBankTransaction() {
		return identificationForBankTransaction == null ? identificationForBankTransaction = new ArrayList<>() : identificationForBankTransaction;
	}

	public GenericIdentification setIdentificationForBankTransaction(List<BankTransaction> identificationForBankTransaction) {
		this.identificationForBankTransaction = Objects.requireNonNull(identificationForBankTransaction);
		return this;
	}

	public Optional<AccountIdentification> getIdentificationForAccountCostReferencePattern() {
		return identificationForAccountCostReferencePattern == null ? Optional.empty() : Optional.of(identificationForAccountCostReferencePattern);
	}

	public GenericIdentification setIdentificationForAccountCostReferencePattern(AccountIdentification identificationForAccountCostReferencePattern) {
		this.identificationForAccountCostReferencePattern = identificationForAccountCostReferencePattern;
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public GenericIdentification setAccount(Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public SystemIdentification getRelatedSystemIdentification() {
		return relatedSystemIdentification;
	}

	public GenericIdentification setRelatedSystemIdentification(SystemIdentification relatedSystemIdentification) {
		this.relatedSystemIdentification = Objects.requireNonNull(relatedSystemIdentification);
		return this;
	}

	public Optional<Interest> getIdentificationForInterestName() {
		return identificationForInterestName == null ? Optional.empty() : Optional.of(identificationForInterestName);
	}

	public GenericIdentification setIdentificationForInterestName(Interest identificationForInterestName) {
		this.identificationForInterestName = identificationForInterestName;
		return this;
	}

	public CashAccountService getRelatedCashAccountService() {
		return relatedCashAccountService;
	}

	public GenericIdentification setRelatedCashAccountService(CashAccountService relatedCashAccountService) {
		this.relatedCashAccountService = Objects.requireNonNull(relatedCashAccountService);
		return this;
	}

	public InvestmentFundClass getIdentificationForInvestmentFundClass() {
		return identificationForInvestmentFundClass;
	}

	public GenericIdentification setIdentificationForInvestmentFundClass(InvestmentFundClass identificationForInvestmentFundClass) {
		this.identificationForInvestmentFundClass = Objects.requireNonNull(identificationForInvestmentFundClass);
		return this;
	}

	public Location getIdentifiedLocation() {
		return identifiedLocation;
	}

	public GenericIdentification setIdentifiedLocation(Location identifiedLocation) {
		this.identifiedLocation = Objects.requireNonNull(identifiedLocation);
		return this;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return relatedSecuritiesIdentification;
	}

	public GenericIdentification setRelatedSecuritiesIdentification(SecuritiesIdentification relatedSecuritiesIdentification) {
		this.relatedSecuritiesIdentification = Objects.requireNonNull(relatedSecuritiesIdentification);
		return this;
	}

	public Document getIdentifiedDocument() {
		return identifiedDocument;
	}

	public GenericIdentification setIdentifiedDocument(Document identifiedDocument) {
		this.identifiedDocument = Objects.requireNonNull(identifiedDocument);
		return this;
	}

	public PurchaseOrder getRelatedPurchaseOrder() {
		return relatedPurchaseOrder;
	}

	public GenericIdentification setRelatedPurchaseOrder(PurchaseOrder relatedPurchaseOrder) {
		this.relatedPurchaseOrder = Objects.requireNonNull(relatedPurchaseOrder);
		return this;
	}

	public RegisteredContract getRelatedCertificate() {
		return relatedCertificate;
	}

	public GenericIdentification setRelatedCertificate(RegisteredContract relatedCertificate) {
		this.relatedCertificate = Objects.requireNonNull(relatedCertificate);
		return this;
	}
}