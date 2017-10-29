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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.PaymentCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ProceedsDefinition;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Definition of the cash proceeds for a corporate action in generic terms; that
 * is, before applying it to specific securities holding. An example would be
 * the definition of a dividend payment where all the information will be given
 * in general on a per share basis.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashProceedsDefinition"
 * src="doc-files/CashProceedsDefinition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#CashIncentiveRate
 * CashProceedsDefinition.CashIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#ContractualPaymentIndicator
 * CashProceedsDefinition.ContractualPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomeType
 * CashProceedsDefinition.IncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IndemnityAmount
 * CashProceedsDefinition.IndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#CashIncentiveAmount
 * CashProceedsDefinition.CashIncentiveAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#PrincipalOrCorpus
 * CashProceedsDefinition.PrincipalOrCorpus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#RedemptionPremiumAmount
 * CashProceedsDefinition.RedemptionPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomePortion
 * CashProceedsDefinition.IncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Interest
 * CashProceedsDefinition.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Amount
 * CashProceedsDefinition.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Dividend
 * CashProceedsDefinition.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#PaymentCurrency
 * CashProceedsDefinition.PaymentCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForCashProceedsIncome
 * GenericIdentification.IdentificationForCashProceedsIncome}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#CashProceeds
 * Dividend.CashProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedCashProceedsDefinition
 * Interest.RelatedCashProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#CashMovementDetails
 * CorporateActionOption4.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#CashMovementDetails
 * CorporateActionOption14.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#CashMovementDetails
 * CorporateActionOption23.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#CashMovementDetails
 * CorporateActionOption31.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#CashMovementDetails
 * CorporateActionOption37.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#CashMovementDetails
 * CorporateActionOption46.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#CashMovementDetails
 * CorporateActionOption53.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#CashMovementDetails
 * CorporateActionOption54.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#CashMovementDetails
 * CorporateActionOption10.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#CashMovementDetails
 * CorporateActionOption15.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#CashMovementDetails
 * CorporateActionOption20.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#CashMovementDetails
 * CorporateActionOption32.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#CashMovementDetails
 * CorporateActionOption35.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#CashMovementDetails
 * CorporateActionOption44.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#CashMovementDetails
 * CorporateActionOption52.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#CashMovementDetails
 * CorporateActionOption55.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#CashMovementDetails
 * CorporateActionOption12.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#CashMovementDetails
 * CorporateActionOption16.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#CashMovementDetails
 * CorporateActionOption24.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#CashMovementDetails
 * CorporateActionOption33.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#CashMovementDetails
 * CorporateActionOption39.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#CashMovementDetails
 * CorporateActionOption48.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#CashMovementDetails
 * CorporateActionOption3.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#CashMovementDetails
 * CorporateActionOption17.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#CashMovementDetails
 * CorporateActionOption19.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#CashMovementDetails
 * CorporateActionOption34.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#CashMovementDetails
 * CorporateActionOption36.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#CashMovementDetails
 * CorporateActionOption45.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#CashMovementDetails
 * CorporateActionOption51.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#CashMovementDetails
 * CorporateActionOption56.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#CashMovementDetails
 * CorporateActionOption1.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#CashMovementDetails
 * CorporateActionOption100.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#CashMovementDetails
 * CorporateActionOption101.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#CashMovementDetails
 * CorporateActionOption102.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#CashMovementDetails
 * CorporateActionOption110.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#CashMovementDetails
 * CorporateActionOption108.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#CashMovementDetails
 * CorporateActionOption106.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#CashMovementDetails
 * CorporateActionOption111.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#CashMovementDetails
 * CorporateActionOption113.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#CashMovementDetails
 * CorporateActionOption117.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#CashMovementDetails
 * CorporateActionOption119.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#CashMovementDetails
 * CorporateActionOption115.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#CashMovementDetails
 * CorporateActionOption114.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#CashMovementDetails
 * CorporateActionOption126.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#CashMovementDetails
 * CorporateActionOption124.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#CashMovementDetails
 * CorporateActionOption125.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#CashMovementDetails
 * CorporateActionOption127.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#CashMovementDetails
 * CorporateActionOption132.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#CashMovementDetails
 * CorporateActionOption130.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#CashMovementDetails
 * CorporateActionOption129.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#CashMovementDetails
 * CorporateActionOption136.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#CashMovementDetails
 * CorporateActionOption135.CashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#CashMovementDetails
 * CorporateActionOption133.CashMovementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
 * ProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption2 CashOption2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption9 CashOption9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption12 CashOption12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption13 CashOption13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption18 CashOption18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption22 CashOption22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption26 CashOption26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption27 CashOption27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption3 CashOption3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption6 CashOption6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption14 CashOption14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption16 CashOption16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption20 CashOption20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption25 CashOption25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption28 CashOption28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption5 CashOption5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption7 CashOption7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption19 CashOption19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption23 CashOption23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption4 CashOption4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption8 CashOption8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption10 CashOption10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption15 CashOption15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption17 CashOption17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption21 CashOption21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption24 CashOption24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption29 CashOption29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption1 CashOption1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashProceeds1 CashProceeds1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption30 CashOption30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption31 CashOption31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption32 CashOption32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption36 CashOption36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption35 CashOption35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption38 CashOption38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption39 CashOption39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption41 CashOption41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption44 CashOption44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption45 CashOption45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption42 CashOption42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption43 CashOption43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption46 CashOption46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption49 CashOption49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption47 CashOption47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption48 CashOption48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption51 CashOption51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption50 CashOption50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption53 CashOption53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption54 CashOption54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption55 CashOption55}</li>
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
 * "CashProceedsDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Definition of the cash proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a dividend payment where all the information will be given in general on a per share basis."
 * </li>
 * </ul>
 */
public class CashProceedsDefinition extends ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event, e.g. consent fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#CashIncentiveRate
	 * CorporateActionRate4.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#CashIncentiveRate
	 * CorporateActionRate10.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#CashIncentiveRate
	 * RateDetails2.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#CashIncentiveRate
	 * RateDetails4.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#CashIncentiveRate
	 * RateDetails7.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#CashIncentiveRate
	 * RateDetails9.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#ThirdPartyIncentiveRate
	 * RateDetails11.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#ThirdPartyIncentiveRate
	 * RateDetails12.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#CashIncentiveRate
	 * CorporateActionRate5.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#CashIncentiveRate
	 * CorporateActionRate12.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#CashIncentiveRate
	 * RateDetails3.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#CashIncentiveRate
	 * RateDetails5.CashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#ThirdPartyIncentiveRate
	 * RateDetails10.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#ThirdPartyIncentiveRate
	 * RateDetails13.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#ThirdPartyIncentiveRate
	 * RateDetails15.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#ThirdPartyIncentiveRate
	 * RateDetails14.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#ThirdPartyIncentiveRate
	 * RateDetails18.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#ThirdPartyIncentiveRate
	 * RateDetails21.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#ThirdPartyIncentiveRate
	 * RateDetails23.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#ThirdPartyIncentiveRate
	 * RateDetails22.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#ThirdPartyIncentiveRate
	 * RateDetails24.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#ThirdPartyIncentiveRate
	 * RateDetails25.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#ThirdPartyIncentiveRate
	 * RateDetails26.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#ThirdPartyIncentiveRate
	 * RateDetails27.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#ThirdPartyIncentiveRate
	 * RateDetails28.ThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#ThirdPartyIncentiveRate
	 * RateDetails30.ThirdPartyIncentiveRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentiveRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available if the securities holder consents or participates to an event, e.g. consent fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashIncentiveRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.CashIncentiveRate, com.tools20022.repository.msg.CorporateActionRate10.CashIncentiveRate,
					com.tools20022.repository.msg.RateDetails2.CashIncentiveRate, com.tools20022.repository.msg.RateDetails4.CashIncentiveRate, com.tools20022.repository.msg.RateDetails7.CashIncentiveRate,
					com.tools20022.repository.msg.RateDetails9.CashIncentiveRate, com.tools20022.repository.msg.RateDetails11.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails12.ThirdPartyIncentiveRate,
					com.tools20022.repository.msg.CorporateActionRate5.CashIncentiveRate, com.tools20022.repository.msg.CorporateActionRate12.CashIncentiveRate, com.tools20022.repository.msg.RateDetails3.CashIncentiveRate,
					com.tools20022.repository.msg.RateDetails5.CashIncentiveRate, com.tools20022.repository.msg.RateDetails10.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails13.ThirdPartyIncentiveRate,
					com.tools20022.repository.msg.RateDetails15.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails14.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails18.ThirdPartyIncentiveRate,
					com.tools20022.repository.msg.RateDetails21.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails23.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails22.ThirdPartyIncentiveRate,
					com.tools20022.repository.msg.RateDetails24.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails25.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails26.ThirdPartyIncentiveRate,
					com.tools20022.repository.msg.RateDetails27.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails28.ThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails30.ThirdPartyIncentiveRate);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveRate";
			definition = "Cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates exceptions to contractual payment service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PaymentCode
	 * PaymentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#ContractualPaymentIndicator
	 * CashOption2.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#ContractualPaymentIndicator
	 * CashOption9.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#ContractualPaymentIndicator
	 * CashOption12.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#ContractualPaymentIndicator
	 * CashOption13.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#ContractualPaymentIndicator
	 * CashOption18.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#ContractualPaymentIndicator
	 * CashOption22.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#ContractualPaymentIndicator
	 * CashOption26.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#ContractualPaymentIndicator
	 * CashOption27.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#ContractualPaymentIndicator
	 * CashOption3.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#ContractualPaymentIndicator
	 * CashOption6.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#ContractualPaymentIndicator
	 * CashOption11.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#ContractualPaymentIndicator
	 * CashOption14.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#ContractualPaymentIndicator
	 * CashOption16.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#ContractualPaymentIndicator
	 * CashOption20.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#ContractualPaymentIndicator
	 * CashOption25.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#ContractualPaymentIndicator
	 * CashOption28.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#ContractualPaymentIndicator
	 * CashOption30.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#ContractualPaymentIndicator
	 * CashOption31.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#ContractualPaymentIndicator
	 * CashOption36.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#ContractualPaymentIndicator
	 * CashOption38.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#ContractualPaymentIndicator
	 * CashOption39.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#ContractualPaymentIndicator
	 * CashOption41.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#ContractualPaymentIndicator
	 * CashOption44.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#ContractualPaymentIndicator
	 * CashOption42.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#ContractualPaymentIndicator
	 * CashOption46.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#ContractualPaymentIndicator
	 * CashOption47.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#ContractualPaymentIndicator
	 * CashOption52.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#ContractualPaymentIndicator
	 * CashOption51.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#ContractualPaymentIndicator
	 * CashOption54.ContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#ContractualPaymentIndicator
	 * CashOption55.ContractualPaymentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractualPaymentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates exceptions to contractual payment service."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContractualPaymentIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption2.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption9.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption12.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption13.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption18.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption22.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption26.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption27.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption3.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption6.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption11.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption14.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption16.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption20.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption25.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption28.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption30.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption31.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption36.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption38.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption39.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption41.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption44.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption42.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption46.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption47.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption52.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption51.ContractualPaymentIndicator, com.tools20022.repository.msg.CashOption54.ContractualPaymentIndicator,
					com.tools20022.repository.msg.CashOption55.ContractualPaymentIndicator);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractualPaymentIndicator";
			definition = "Indicates exceptions to contractual payment service.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentCode.mmObject();
		}
	};
	/**
	 * Specifies the type of income.<br>
	 * The lists of income type codes to be used, are available on the SMPG
	 * website at www.smpg.info.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForCashProceedsIncome
	 * GenericIdentification.IdentificationForCashProceedsIncome}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#IncomeType
	 * CashOption2.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#IncomeType
	 * CashOption9.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#IncomeType
	 * CashOption12.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#IncomeType
	 * CashOption13.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#IncomeType
	 * CashOption18.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#IncomeType
	 * CashOption22.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#IncomeType
	 * CashOption26.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#IncomeType
	 * CashOption27.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption3#IncomeType
	 * CashOption3.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption6#IncomeType
	 * CashOption6.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#IncomeType
	 * CashOption11.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption14#IncomeType
	 * CashOption14.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption16#IncomeType
	 * CashOption16.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption20#IncomeType
	 * CashOption20.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption25#IncomeType
	 * CashOption25.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption28#IncomeType
	 * CashOption28.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption4#IncomeType
	 * CashOption4.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption8#IncomeType
	 * CashOption8.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption10#IncomeType
	 * CashOption10.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption15#IncomeType
	 * CashOption15.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption17#IncomeType
	 * CashOption17.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption21#IncomeType
	 * CashOption21.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption24#IncomeType
	 * CashOption24.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption29#IncomeType
	 * CashOption29.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#IncomeType
	 * CorporateAction2.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#IncomeType
	 * CashOption30.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption31#IncomeType
	 * CashOption31.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption32#IncomeType
	 * CashOption32.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption36#IncomeType
	 * CashOption36.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption35#IncomeType
	 * CashOption35.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#IncomeType
	 * CashOption38.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#IncomeType
	 * CashOption39.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#IncomeType
	 * CashOption41.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#IncomeType
	 * CashOption44.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#IncomeType
	 * SecuritiesOption49.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption42#IncomeType
	 * CashOption42.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption43#IncomeType
	 * CashOption43.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#IncomeType
	 * SecuritiesOption50.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#IncomeType
	 * CashOption46.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#IncomeType
	 * SecuritiesOption55.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption49#IncomeType
	 * CashOption49.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption47#IncomeType
	 * CashOption47.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#IncomeType
	 * SecuritiesOption57.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#IncomeType
	 * CashOption52.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#IncomeType
	 * SecuritiesOption60.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption51#IncomeType
	 * CashOption51.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#IncomeType
	 * SecuritiesOption59.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption50#IncomeType
	 * CashOption50.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption53#IncomeType
	 * CashOption53.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#IncomeType
	 * SecuritiesOption61.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#IncomeType
	 * SecuritiesOption63.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption54#IncomeType
	 * CashOption54.IncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#IncomeType
	 * CashOption55.IncomeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of income.\r\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IncomeType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption2.IncomeType, com.tools20022.repository.msg.CashOption9.IncomeType, com.tools20022.repository.msg.CashOption12.IncomeType,
					com.tools20022.repository.msg.CashOption13.IncomeType, com.tools20022.repository.msg.CashOption18.IncomeType, com.tools20022.repository.msg.CashOption22.IncomeType, com.tools20022.repository.msg.CashOption26.IncomeType,
					com.tools20022.repository.msg.CashOption27.IncomeType, com.tools20022.repository.msg.CashOption3.IncomeType, com.tools20022.repository.msg.CashOption6.IncomeType, com.tools20022.repository.msg.CashOption11.IncomeType,
					com.tools20022.repository.msg.CashOption14.IncomeType, com.tools20022.repository.msg.CashOption16.IncomeType, com.tools20022.repository.msg.CashOption20.IncomeType, com.tools20022.repository.msg.CashOption25.IncomeType,
					com.tools20022.repository.msg.CashOption28.IncomeType, com.tools20022.repository.msg.CashOption4.IncomeType, com.tools20022.repository.msg.CashOption8.IncomeType, com.tools20022.repository.msg.CashOption10.IncomeType,
					com.tools20022.repository.msg.CashOption15.IncomeType, com.tools20022.repository.msg.CashOption17.IncomeType, com.tools20022.repository.msg.CashOption21.IncomeType, com.tools20022.repository.msg.CashOption24.IncomeType,
					com.tools20022.repository.msg.CashOption29.IncomeType, com.tools20022.repository.msg.CorporateAction2.IncomeType, com.tools20022.repository.msg.CashOption30.IncomeType,
					com.tools20022.repository.msg.CashOption31.IncomeType, com.tools20022.repository.msg.CashOption32.IncomeType, com.tools20022.repository.msg.CashOption36.IncomeType, com.tools20022.repository.msg.CashOption35.IncomeType,
					com.tools20022.repository.msg.CashOption38.IncomeType, com.tools20022.repository.msg.CashOption39.IncomeType, com.tools20022.repository.msg.CashOption41.IncomeType, com.tools20022.repository.msg.CashOption44.IncomeType,
					com.tools20022.repository.msg.SecuritiesOption49.IncomeType, com.tools20022.repository.msg.CashOption42.IncomeType, com.tools20022.repository.msg.CashOption43.IncomeType,
					com.tools20022.repository.msg.SecuritiesOption50.IncomeType, com.tools20022.repository.msg.CashOption46.IncomeType, com.tools20022.repository.msg.SecuritiesOption55.IncomeType,
					com.tools20022.repository.msg.CashOption49.IncomeType, com.tools20022.repository.msg.CashOption47.IncomeType, com.tools20022.repository.msg.SecuritiesOption57.IncomeType,
					com.tools20022.repository.msg.CashOption52.IncomeType, com.tools20022.repository.msg.SecuritiesOption60.IncomeType, com.tools20022.repository.msg.CashOption51.IncomeType,
					com.tools20022.repository.msg.SecuritiesOption59.IncomeType, com.tools20022.repository.msg.CashOption50.IncomeType, com.tools20022.repository.msg.CashOption53.IncomeType,
					com.tools20022.repository.msg.SecuritiesOption61.IncomeType, com.tools20022.repository.msg.SecuritiesOption63.IncomeType, com.tools20022.repository.msg.CashOption54.IncomeType,
					com.tools20022.repository.msg.CashOption55.IncomeType);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\r\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * (Unique to France) Amount due to a buyer of securities dealt prior to ex
	 * date which may be subject to different rate of taxation.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#IndemnityAmount
	 * CorporateActionAmounts2.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#IndemnityAmount
	 * CorporateActionAmounts5.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#IndemnityAmount
	 * CorporateActionAmounts11.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#IndemnityAmount
	 * CorporateActionAmounts12.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#IndemnityAmount
	 * CorporateActionAmounts17.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#IndemnityAmount
	 * CorporateActionAmounts20.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#IndemnityAmount
	 * CorporateActionAmounts23.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#IndemnityAmount
	 * CorporateActionAmounts24.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#IndemnityAmount
	 * CorporateActionAmounts3.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#IndemnityAmount
	 * CorporateActionAmounts6.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#IndemnityAmount
	 * CorporateActionAmounts9.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#IndemnityAmount
	 * CorporateActionAmounts13.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#IndemnityAmount
	 * CorporateActionAmounts16.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#IndemnityAmount
	 * CorporateActionAmounts19.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#IndemnityAmount
	 * CorporateActionAmounts22.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#IndemnityAmount
	 * CorporateActionAmounts25.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#IndemnityAmount
	 * CorporateActionAmounts4.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#IndemnityAmount
	 * CorporateActionAmounts7.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#IndemnityAmount
	 * CorporateActionAmounts10.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#IndemnityAmount
	 * CorporateActionAmounts14.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#IndemnityAmount
	 * CorporateActionAmounts15.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#IndemnityAmount
	 * CorporateActionAmounts18.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#IndemnityAmount
	 * CorporateActionAmounts21.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#IndemnityAmount
	 * CorporateActionAmounts26.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#IndemnityAmount
	 * CorporateActionAmounts1.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#IndemnityAmount
	 * CorporateActionAmounts29.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#IndemnityAmount
	 * CorporateActionAmounts27.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#IndemnityAmount
	 * CorporateActionAmounts28.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#IndemnityAmount
	 * CorporateActionAmounts33.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#IndemnityAmount
	 * CorporateActionAmounts32.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#IndemnityAmount
	 * CorporateActionAmounts35.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#IndemnityAmount
	 * CorporateActionAmounts37.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#IndemnityAmount
	 * CorporateActionAmounts36.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#IndemnityAmount
	 * CorporateActionAmounts38.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#IndemnityAmount
	 * CorporateActionAmounts39.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#IndemnityAmount
	 * CorporateActionAmounts41.IndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#IndemnityAmount
	 * CorporateActionAmounts40.IndemnityAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndemnityAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndemnityAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts5.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts12.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts17.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts23.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts24.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts6.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts9.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts16.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts19.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts25.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts4.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts10.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts14.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts18.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts21.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts1.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts29.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts28.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts33.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts35.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts37.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts38.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts39.IndemnityAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.IndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts40.IndemnityAmount);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, e.g. consent fees.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#CashIncentive
	 * CorporateActionAmounts2.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#CashIncentive
	 * CorporateActionAmounts5.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#CashIncentive
	 * CorporateActionAmounts11.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#CashIncentive
	 * CorporateActionAmounts12.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#CashIncentive
	 * CorporateActionAmounts17.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#CashIncentive
	 * CorporateActionAmounts20.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#CashIncentive
	 * CorporateActionAmounts3.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#CashIncentive
	 * CorporateActionAmounts6.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#CashIncentive
	 * CorporateActionAmounts9.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#CashIncentive
	 * CorporateActionAmounts13.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#CashIncentive
	 * CorporateActionAmounts16.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#CashIncentive
	 * CorporateActionAmounts19.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#CashIncentive
	 * CorporateActionAmounts4.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#CashIncentive
	 * CorporateActionAmounts7.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#CashIncentive
	 * CorporateActionAmounts10.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#CashIncentive
	 * CorporateActionAmounts14.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#CashIncentive
	 * CorporateActionAmounts15.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#CashIncentive
	 * CorporateActionAmounts18.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#CashIncentive
	 * CorporateActionRate2.CashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#CashIncentive
	 * CorporateActionAmounts1.CashIncentive}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentiveAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashIncentiveAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts5.CashIncentive,
					com.tools20022.repository.msg.CorporateActionAmounts11.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts12.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts17.CashIncentive,
					com.tools20022.repository.msg.CorporateActionAmounts20.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts3.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts6.CashIncentive,
					com.tools20022.repository.msg.CorporateActionAmounts9.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts13.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts16.CashIncentive,
					com.tools20022.repository.msg.CorporateActionAmounts19.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts4.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts7.CashIncentive,
					com.tools20022.repository.msg.CorporateActionAmounts10.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts14.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts15.CashIncentive,
					com.tools20022.repository.msg.CorporateActionAmounts18.CashIncentive, com.tools20022.repository.msg.CorporateActionRate2.CashIncentive, com.tools20022.repository.msg.CorporateActionAmounts1.CashIncentive);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveAmount";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money representing a distribution of a bond's principal, eg,
	 * repayment of outstanding debt.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#PrincipalOrCorpus
	 * CorporateActionAmounts2.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#PrincipalOrCorpus
	 * CorporateActionAmounts5.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#PrincipalOrCorpus
	 * CorporateActionAmounts11.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#PrincipalOrCorpus
	 * CorporateActionAmounts12.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#PrincipalOrCorpus
	 * CorporateActionAmounts17.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#PrincipalOrCorpus
	 * CorporateActionAmounts20.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#PrincipalOrCorpus
	 * CorporateActionAmounts23.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#PrincipalOrCorpus
	 * CorporateActionAmounts24.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#PrincipalOrCorpus
	 * CorporateActionAmounts4.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#PrincipalOrCorpus
	 * CorporateActionAmounts7.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#PrincipalOrCorpus
	 * CorporateActionAmounts10.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#PrincipalOrCorpus
	 * CorporateActionAmounts14.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#PrincipalOrCorpus
	 * CorporateActionAmounts15.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#PrincipalOrCorpus
	 * CorporateActionAmounts18.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#PrincipalOrCorpus
	 * CorporateActionAmounts21.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#PrincipalOrCorpus
	 * CorporateActionAmounts26.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#PrincipalOrCorpus
	 * CorporateActionAmounts1.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#PrincipalOrCorpus
	 * CorporateActionAmounts29.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#PrincipalOrCorpus
	 * CorporateActionAmounts27.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#PrincipalOrCorpus
	 * CorporateActionAmounts32.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#PrincipalOrCorpus
	 * CorporateActionAmounts35.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#PrincipalOrCorpus
	 * CorporateActionAmounts37.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#PrincipalOrCorpus
	 * CorporateActionAmounts36.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#PrincipalOrCorpus
	 * CorporateActionAmounts39.PrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#PrincipalOrCorpus
	 * CorporateActionAmounts41.PrincipalOrCorpus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalOrCorpus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money representing a distribution of a bond's principal, eg, repayment of outstanding debt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PrincipalOrCorpus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts5.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts11.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts12.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts17.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts20.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts23.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts24.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts4.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts7.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts10.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts14.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts15.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts18.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts21.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts26.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts1.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts29.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts27.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts32.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts35.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts37.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts36.PrincipalOrCorpus,
					com.tools20022.repository.msg.CorporateActionAmounts39.PrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts41.PrincipalOrCorpus);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, eg, repayment of outstanding debt.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money (not interest) in addition to the principal at the
	 * redemption of a bond.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#RedemptionPremiumAmount
	 * CorporateActionAmounts2.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#RedemptionPremiumAmount
	 * CorporateActionAmounts5.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#RedemptionPremiumAmount
	 * CorporateActionAmounts11.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#RedemptionPremiumAmount
	 * CorporateActionAmounts12.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#RedemptionPremiumAmount
	 * CorporateActionAmounts17.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#RedemptionPremiumAmount
	 * CorporateActionAmounts20.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#RedemptionPremiumAmount
	 * CorporateActionAmounts23.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#RedemptionPremiumAmount
	 * CorporateActionAmounts24.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#RedemptionPremiumAmount
	 * CorporateActionAmounts4.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#RedemptionPremiumAmount
	 * CorporateActionAmounts7.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#RedemptionPremiumAmount
	 * CorporateActionAmounts10.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#RedemptionPremiumAmount
	 * CorporateActionAmounts14.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#RedemptionPremiumAmount
	 * CorporateActionAmounts15.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#RedemptionPremiumAmount
	 * CorporateActionAmounts18.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#RedemptionPremiumAmount
	 * CorporateActionAmounts21.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#RedemptionPremiumAmount
	 * CorporateActionAmounts26.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#RedemptionPremiumAmount
	 * CorporateActionAmounts1.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#RedemptionPremiumAmount
	 * CorporateActionAmounts29.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#RedemptionPremiumAmount
	 * CorporateActionAmounts27.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#RedemptionPremiumAmount
	 * CorporateActionAmounts32.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#RedemptionPremiumAmount
	 * CorporateActionAmounts35.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#RedemptionPremiumAmount
	 * CorporateActionAmounts37.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#RedemptionPremiumAmount
	 * CorporateActionAmounts36.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#RedemptionPremiumAmount
	 * CorporateActionAmounts39.RedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#RedemptionPremiumAmount
	 * CorporateActionAmounts41.RedemptionPremiumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (not interest) in addition to the principal at the redemption of a bond."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RedemptionPremiumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts5.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts12.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts20.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts24.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts7.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts14.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts18.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts26.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts1.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts29.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts32.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts37.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.RedemptionPremiumAmount, com.tools20022.repository.msg.CorporateActionAmounts39.RedemptionPremiumAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.RedemptionPremiumAmount);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount relating to the underlying security for which income is
	 * distributed.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#IncomePortion
	 * CorporateActionAmounts2.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#IncomePortion
	 * CorporateActionAmounts5.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#IncomePortion
	 * CorporateActionAmounts11.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#IncomePortion
	 * CorporateActionAmounts12.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#IncomePortion
	 * CorporateActionAmounts17.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#IncomePortion
	 * CorporateActionAmounts20.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#IncomePortion
	 * CorporateActionAmounts23.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#IncomePortion
	 * CorporateActionAmounts24.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#IncomePortion
	 * CorporateActionAmounts3.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#IncomePortion
	 * CorporateActionAmounts6.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#IncomePortion
	 * CorporateActionAmounts9.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#IncomePortion
	 * CorporateActionAmounts13.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#IncomePortion
	 * CorporateActionAmounts16.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#IncomePortion
	 * CorporateActionAmounts19.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#IncomePortion
	 * CorporateActionAmounts22.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#IncomePortion
	 * CorporateActionAmounts25.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#IncomePortion
	 * CorporateActionAmounts4.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#IncomePortion
	 * CorporateActionAmounts7.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#IncomePortion
	 * CorporateActionAmounts10.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#IncomePortion
	 * CorporateActionAmounts14.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#IncomePortion
	 * CorporateActionAmounts15.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#IncomePortion
	 * CorporateActionAmounts18.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#IncomePortion
	 * CorporateActionAmounts21.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#IncomePortion
	 * CorporateActionAmounts26.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#IncomePortion
	 * CorporateActionAmounts29.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#IncomePortion
	 * CorporateActionAmounts27.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#IncomePortion
	 * CorporateActionAmounts28.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#IncomePortion
	 * CorporateActionAmounts33.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#IncomePortion
	 * CorporateActionAmounts32.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#IncomePortion
	 * CorporateActionAmounts35.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#IncomePortion
	 * CorporateActionAmounts37.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#IncomePortion
	 * CorporateActionAmounts36.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#IncomePortion
	 * CorporateActionAmounts38.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#IncomePortion
	 * CorporateActionAmounts39.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#IncomePortion
	 * CorporateActionAmounts41.IncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#IncomePortion
	 * CorporateActionAmounts40.IncomePortion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount relating to the underlying security for which income is distributed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncomePortion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts5.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts11.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts12.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts17.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts20.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts23.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts24.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts3.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts6.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts9.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts13.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts16.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts19.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts22.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts25.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts4.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts7.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts10.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts14.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts15.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts18.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts21.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts26.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts29.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts27.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts28.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts33.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts32.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts35.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts37.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts36.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts38.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts39.IncomePortion, com.tools20022.repository.msg.CorporateActionAmounts41.IncomePortion,
					com.tools20022.repository.msg.CorporateActionAmounts40.IncomePortion);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Interest paid as the proceeds of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedCashProceedsDefinition
	 * Interest.RelatedCashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#Interest
	 * CorporateActionRate3.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#Interest
	 * CorporateActionRate14.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#Interest
	 * CorporateActionRate16.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#Interest
	 * CorporateActionRate24.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#Interest
	 * CorporateActionRate27.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#Interest
	 * CorporateActionRate32.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#Interest
	 * CorporateActionRate35.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#Interest
	 * CorporateActionRate41.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#Interest
	 * CorporateActionRate1.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#Interest
	 * CorporateActionRate43.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#Interest
	 * CorporateActionRate56.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#Interest
	 * CorporateActionRate66.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#Interest
	 * CorporateActionRate78.Interest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest paid as the proceeds of a CA event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate3.Interest, com.tools20022.repository.msg.CorporateActionRate14.Interest, com.tools20022.repository.msg.CorporateActionRate16.Interest,
					com.tools20022.repository.msg.CorporateActionRate24.Interest, com.tools20022.repository.msg.CorporateActionRate27.Interest, com.tools20022.repository.msg.CorporateActionRate32.Interest,
					com.tools20022.repository.msg.CorporateActionRate35.Interest, com.tools20022.repository.msg.CorporateActionRate41.Interest, com.tools20022.repository.msg.CorporateActionRate1.Interest,
					com.tools20022.repository.msg.CorporateActionRate43.Interest, com.tools20022.repository.msg.CorporateActionRate56.Interest, com.tools20022.repository.msg.CorporateActionRate66.Interest,
					com.tools20022.repository.msg.CorporateActionRate78.Interest);
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest paid as the proceeds of a CA event.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount which is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount which is posted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Cash amount which is posted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Distribution of earnings to shareholders, paid for in cash, stock, scrip
	 * issue or, rarely, in kind, eg, company products or property. The dividend
	 * amount is decided by the board of directors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#CashProceeds
	 * Dividend.CashProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, eg, company products or property. The dividend amount is decided by the board of directors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, eg, company products or property. The dividend amount is decided by the board of directors.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.CashProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency for the payment of the cash proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for the payment of the cash proceeds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency for the payment of the cash proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashProceedsDefinition";
				definition = "Definition of the cash proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a dividend payment where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome, com.tools20022.repository.entity.Dividend.CashProceeds,
						com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption4.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption14.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption23.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption31.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption37.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption46.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption53.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption54.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption10.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption15.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption20.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption32.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption35.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption44.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption52.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption55.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption12.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption16.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption24.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption33.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption39.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption48.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption3.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption17.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption19.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption34.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption36.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption45.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption51.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption56.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption1.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption100.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption101.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption102.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption110.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption108.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption106.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption111.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption113.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption117.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption119.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption115.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption114.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption126.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption124.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption125.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption127.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption132.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption130.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption129.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption136.CashMovementDetails, com.tools20022.repository.msg.CorporateActionOption135.CashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption133.CashMovementDetails);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashProceedsDefinition.CashIncentiveRate, com.tools20022.repository.entity.CashProceedsDefinition.ContractualPaymentIndicator,
						com.tools20022.repository.entity.CashProceedsDefinition.IncomeType, com.tools20022.repository.entity.CashProceedsDefinition.IndemnityAmount,
						com.tools20022.repository.entity.CashProceedsDefinition.CashIncentiveAmount, com.tools20022.repository.entity.CashProceedsDefinition.PrincipalOrCorpus,
						com.tools20022.repository.entity.CashProceedsDefinition.RedemptionPremiumAmount, com.tools20022.repository.entity.CashProceedsDefinition.IncomePortion,
						com.tools20022.repository.entity.CashProceedsDefinition.Interest, com.tools20022.repository.entity.CashProceedsDefinition.Amount, com.tools20022.repository.entity.CashProceedsDefinition.Dividend,
						com.tools20022.repository.entity.CashProceedsDefinition.PaymentCurrency);
				derivationComponent_lazy = () -> Arrays.asList(CashOption2.mmObject(), CashOption9.mmObject(), CashOption12.mmObject(), CashOption13.mmObject(), CashOption18.mmObject(), CashOption22.mmObject(), CashOption26.mmObject(),
						CashOption27.mmObject(), CashOption3.mmObject(), CashOption6.mmObject(), CashOption11.mmObject(), CashOption14.mmObject(), CashOption16.mmObject(), CashOption20.mmObject(), CashOption25.mmObject(),
						CashOption28.mmObject(), CashOption5.mmObject(), CashOption7.mmObject(), CashOption19.mmObject(), CashOption23.mmObject(), CashOption4.mmObject(), CashOption8.mmObject(), CashOption10.mmObject(),
						CashOption15.mmObject(), CashOption17.mmObject(), CashOption21.mmObject(), CashOption24.mmObject(), CashOption29.mmObject(), CashOption1.mmObject(), CashProceeds1.mmObject(), CashOption30.mmObject(),
						CashOption31.mmObject(), CashOption32.mmObject(), CashOption36.mmObject(), CashOption35.mmObject(), CashOption38.mmObject(), CashOption39.mmObject(), CashOption41.mmObject(), CashOption44.mmObject(),
						CashOption45.mmObject(), CashOption42.mmObject(), CashOption43.mmObject(), CashOption46.mmObject(), CashOption49.mmObject(), CashOption47.mmObject(), CashOption48.mmObject(), CashOption52.mmObject(),
						CashOption51.mmObject(), CashOption50.mmObject(), CashOption53.mmObject(), CashOption54.mmObject(), CashOption55.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}