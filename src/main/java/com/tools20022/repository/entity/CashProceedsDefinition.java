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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.PaymentCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.ProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
 * ProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveRate
 * CashProceedsDefinition.mmCashIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmContractualPaymentIndicator
 * CashProceedsDefinition.mmContractualPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
 * CashProceedsDefinition.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIndemnityAmount
 * CashProceedsDefinition.mmIndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveAmount
 * CashProceedsDefinition.mmCashIncentiveAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmPrincipalOrCorpus
 * CashProceedsDefinition.mmPrincipalOrCorpus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmRedemptionPremiumAmount
 * CashProceedsDefinition.mmRedemptionPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomePortion
 * CashProceedsDefinition.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
 * CashProceedsDefinition.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmAmount
 * CashProceedsDefinition.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmDividend
 * CashProceedsDefinition.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmPaymentCurrency
 * CashProceedsDefinition.mmPaymentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmStatusCashAmount
 * CashProceedsDefinition.mmStatusCashAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForCashProceedsIncome
 * GenericIdentification.mmIdentificationForCashProceedsIncome}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmCashProceeds
 * Dividend.mmCashProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedCashProceedsDefinition
 * Interest.mmRelatedCashProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmCashMovementDetails
 * CorporateActionOption4.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmCashMovementDetails
 * CorporateActionOption14.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmCashMovementDetails
 * CorporateActionOption23.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmCashMovementDetails
 * CorporateActionOption31.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmCashMovementDetails
 * CorporateActionOption37.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmCashMovementDetails
 * CorporateActionOption46.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmCashMovementDetails
 * CorporateActionOption53.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmCashMovementDetails
 * CorporateActionOption54.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmCashMovementDetails
 * CorporateActionOption10.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmCashMovementDetails
 * CorporateActionOption15.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmCashMovementDetails
 * CorporateActionOption20.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmCashMovementDetails
 * CorporateActionOption32.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmCashMovementDetails
 * CorporateActionOption35.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmCashMovementDetails
 * CorporateActionOption44.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmCashMovementDetails
 * CorporateActionOption52.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmCashMovementDetails
 * CorporateActionOption55.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#mmCashMovementDetails
 * CorporateActionOption12.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#mmCashMovementDetails
 * CorporateActionOption16.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#mmCashMovementDetails
 * CorporateActionOption24.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#mmCashMovementDetails
 * CorporateActionOption33.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#mmCashMovementDetails
 * CorporateActionOption39.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#mmCashMovementDetails
 * CorporateActionOption48.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmCashMovementDetails
 * CorporateActionOption3.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmCashMovementDetails
 * CorporateActionOption17.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCashMovementDetails
 * CorporateActionOption19.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmCashMovementDetails
 * CorporateActionOption34.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmCashMovementDetails
 * CorporateActionOption36.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmCashMovementDetails
 * CorporateActionOption45.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmCashMovementDetails
 * CorporateActionOption51.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmCashMovementDetails
 * CorporateActionOption56.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCashMovementDetails
 * CorporateActionOption1.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmCashMovementDetails
 * CorporateActionOption100.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmCashMovementDetails
 * CorporateActionOption101.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmCashMovementDetails
 * CorporateActionOption102.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmCashMovementDetails
 * CorporateActionOption110.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCashMovementDetails
 * CorporateActionOption108.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmCashMovementDetails
 * CorporateActionOption106.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmCashMovementDetails
 * CorporateActionOption111.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmCashMovementDetails
 * CorporateActionOption113.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmCashMovementDetails
 * CorporateActionOption117.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#mmCashMovementDetails
 * CorporateActionOption119.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmCashMovementDetails
 * CorporateActionOption115.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCashMovementDetails
 * CorporateActionOption114.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#mmCashMovementDetails
 * CorporateActionOption126.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmCashMovementDetails
 * CorporateActionOption124.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmCashMovementDetails
 * CorporateActionOption125.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmCashMovementDetails
 * CorporateActionOption127.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmCashMovementDetails
 * CorporateActionOption132.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCashMovementDetails
 * CorporateActionOption130.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmCashMovementDetails
 * CorporateActionOption129.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmCashMovementDetails
 * CorporateActionOption136.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmCashMovementDetails
 * CorporateActionOption135.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmCashMovementDetails
 * CorporateActionOption133.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmCashMovementDetails
 * CorporateActionOption140.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmCashMovementDetails
 * CorporateActionOption138.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmCashMovementDetails
 * CorporateActionOption139.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption143#mmCashMovementDetails
 * CorporateActionOption143.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmCashMovementDetails
 * CorporateActionOption147.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmCashMovementDetails
 * CorporateActionOption148.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption149#mmCashMovementDetails
 * CorporateActionOption149.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmCashMovementDetails
 * CorporateActionOption150.mmCashMovementDetails}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.CashOption56 CashOption56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption57 CashOption57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption58 CashOption58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption59 CashOption59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption60 CashOption60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption61 CashOption61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption62 CashOption62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashProceedsDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Definition of the cash proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a dividend payment where all the information will be given in general on a per share basis."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CashProceedsDefinition extends ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate cashIncentiveRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmCashIncentiveRate
	 * CorporateActionRate4.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmCashIncentiveRate
	 * CorporateActionRate10.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmCashIncentiveRate
	 * RateDetails2.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmCashIncentiveRate
	 * RateDetails4.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmCashIncentiveRate
	 * RateDetails7.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmCashIncentiveRate
	 * RateDetails9.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmThirdPartyIncentiveRate
	 * RateDetails11.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmThirdPartyIncentiveRate
	 * RateDetails12.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmCashIncentiveRate
	 * CorporateActionRate5.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmCashIncentiveRate
	 * CorporateActionRate12.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmCashIncentiveRate
	 * RateDetails3.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmCashIncentiveRate
	 * RateDetails5.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmThirdPartyIncentiveRate
	 * RateDetails10.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmThirdPartyIncentiveRate
	 * RateDetails13.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmThirdPartyIncentiveRate
	 * RateDetails15.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmThirdPartyIncentiveRate
	 * RateDetails14.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmThirdPartyIncentiveRate
	 * RateDetails18.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmThirdPartyIncentiveRate
	 * RateDetails21.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmThirdPartyIncentiveRate
	 * RateDetails23.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmThirdPartyIncentiveRate
	 * RateDetails22.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmThirdPartyIncentiveRate
	 * RateDetails24.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmThirdPartyIncentiveRate
	 * RateDetails25.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmThirdPartyIncentiveRate
	 * RateDetails26.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmThirdPartyIncentiveRate
	 * RateDetails27.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmThirdPartyIncentiveRate
	 * RateDetails28.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmThirdPartyIncentiveRate
	 * RateDetails30.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmThirdPartyIncentiveRate
	 * RateDetails31.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmThirdPartyIncentiveRate
	 * RateDetails32.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails33#mmThirdPartyIncentiveRate
	 * RateDetails33.mmThirdPartyIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails34#mmThirdPartyIncentiveRate
	 * RateDetails34.mmThirdPartyIncentiveRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentiveRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available if the securities holder consents or participates to an event, e.g. consent fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, PercentageRate> mmCashIncentiveRate = new MMBusinessAttribute<CashProceedsDefinition, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmCashIncentiveRate, CorporateActionRate10.mmCashIncentiveRate, RateDetails2.mmCashIncentiveRate, RateDetails4.mmCashIncentiveRate, RateDetails7.mmCashIncentiveRate,
					RateDetails9.mmCashIncentiveRate, RateDetails11.mmThirdPartyIncentiveRate, RateDetails12.mmThirdPartyIncentiveRate, CorporateActionRate5.mmCashIncentiveRate, CorporateActionRate12.mmCashIncentiveRate,
					RateDetails3.mmCashIncentiveRate, RateDetails5.mmCashIncentiveRate, RateDetails10.mmThirdPartyIncentiveRate, RateDetails13.mmThirdPartyIncentiveRate, RateDetails15.mmThirdPartyIncentiveRate,
					RateDetails14.mmThirdPartyIncentiveRate, RateDetails18.mmThirdPartyIncentiveRate, RateDetails21.mmThirdPartyIncentiveRate, RateDetails23.mmThirdPartyIncentiveRate, RateDetails22.mmThirdPartyIncentiveRate,
					RateDetails24.mmThirdPartyIncentiveRate, RateDetails25.mmThirdPartyIncentiveRate, RateDetails26.mmThirdPartyIncentiveRate, RateDetails27.mmThirdPartyIncentiveRate, RateDetails28.mmThirdPartyIncentiveRate,
					RateDetails30.mmThirdPartyIncentiveRate, RateDetails31.mmThirdPartyIncentiveRate, RateDetails32.mmThirdPartyIncentiveRate, RateDetails33.mmThirdPartyIncentiveRate, RateDetails34.mmThirdPartyIncentiveRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveRate";
			definition = "Cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(CashProceedsDefinition obj) {
			return obj.getCashIncentiveRate();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, PercentageRate value) {
			obj.setCashIncentiveRate(value);
		}
	};
	protected PaymentCode contractualPaymentIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashOption2#mmContractualPaymentIndicator
	 * CashOption2.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#mmContractualPaymentIndicator
	 * CashOption9.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#mmContractualPaymentIndicator
	 * CashOption12.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#mmContractualPaymentIndicator
	 * CashOption13.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#mmContractualPaymentIndicator
	 * CashOption18.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#mmContractualPaymentIndicator
	 * CashOption22.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#mmContractualPaymentIndicator
	 * CashOption26.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#mmContractualPaymentIndicator
	 * CashOption27.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmContractualPaymentIndicator
	 * CashOption3.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmContractualPaymentIndicator
	 * CashOption6.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmContractualPaymentIndicator
	 * CashOption11.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmContractualPaymentIndicator
	 * CashOption14.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmContractualPaymentIndicator
	 * CashOption16.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmContractualPaymentIndicator
	 * CashOption20.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmContractualPaymentIndicator
	 * CashOption25.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmContractualPaymentIndicator
	 * CashOption28.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#mmContractualPaymentIndicator
	 * CashOption30.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmContractualPaymentIndicator
	 * CashOption31.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmContractualPaymentIndicator
	 * CashOption36.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#mmContractualPaymentIndicator
	 * CashOption38.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#mmContractualPaymentIndicator
	 * CashOption39.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#mmContractualPaymentIndicator
	 * CashOption41.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmContractualPaymentIndicator
	 * CashOption44.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmContractualPaymentIndicator
	 * CashOption42.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmContractualPaymentIndicator
	 * CashOption46.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmContractualPaymentIndicator
	 * CashOption47.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmContractualPaymentIndicator
	 * CashOption52.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmContractualPaymentIndicator
	 * CashOption51.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmContractualPaymentIndicator
	 * CashOption54.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmContractualPaymentIndicator
	 * CashOption55.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmContractualPaymentIndicator
	 * CashOption57.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmContractualPaymentIndicator
	 * CashOption58.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption60#mmContractualPaymentIndicator
	 * CashOption60.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption61#mmContractualPaymentIndicator
	 * CashOption61.mmContractualPaymentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractualPaymentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates exceptions to contractual payment service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, PaymentCode> mmContractualPaymentIndicator = new MMBusinessAttribute<CashProceedsDefinition, PaymentCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption2.mmContractualPaymentIndicator, CashOption9.mmContractualPaymentIndicator, CashOption12.mmContractualPaymentIndicator, CashOption13.mmContractualPaymentIndicator,
					CashOption18.mmContractualPaymentIndicator, CashOption22.mmContractualPaymentIndicator, CashOption26.mmContractualPaymentIndicator, CashOption27.mmContractualPaymentIndicator, CashOption3.mmContractualPaymentIndicator,
					CashOption6.mmContractualPaymentIndicator, CashOption11.mmContractualPaymentIndicator, CashOption14.mmContractualPaymentIndicator, CashOption16.mmContractualPaymentIndicator, CashOption20.mmContractualPaymentIndicator,
					CashOption25.mmContractualPaymentIndicator, CashOption28.mmContractualPaymentIndicator, CashOption30.mmContractualPaymentIndicator, CashOption31.mmContractualPaymentIndicator, CashOption36.mmContractualPaymentIndicator,
					CashOption38.mmContractualPaymentIndicator, CashOption39.mmContractualPaymentIndicator, CashOption41.mmContractualPaymentIndicator, CashOption44.mmContractualPaymentIndicator, CashOption42.mmContractualPaymentIndicator,
					CashOption46.mmContractualPaymentIndicator, CashOption47.mmContractualPaymentIndicator, CashOption52.mmContractualPaymentIndicator, CashOption51.mmContractualPaymentIndicator, CashOption54.mmContractualPaymentIndicator,
					CashOption55.mmContractualPaymentIndicator, CashOption57.mmContractualPaymentIndicator, CashOption58.mmContractualPaymentIndicator, CashOption60.mmContractualPaymentIndicator, CashOption61.mmContractualPaymentIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractualPaymentIndicator";
			definition = "Indicates exceptions to contractual payment service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCode.mmObject();
		}

		@Override
		public PaymentCode getValue(CashProceedsDefinition obj) {
			return obj.getContractualPaymentIndicator();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, PaymentCode value) {
			obj.setContractualPaymentIndicator(value);
		}
	};
	protected GenericIdentification incomeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForCashProceedsIncome
	 * GenericIdentification.mmIdentificationForCashProceedsIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#mmIncomeType
	 * CashOption2.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#mmIncomeType
	 * CashOption9.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#mmIncomeType
	 * CashOption12.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#mmIncomeType
	 * CashOption13.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#mmIncomeType
	 * CashOption18.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#mmIncomeType
	 * CashOption22.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#mmIncomeType
	 * CashOption26.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#mmIncomeType
	 * CashOption27.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption3#mmIncomeType
	 * CashOption3.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption6#mmIncomeType
	 * CashOption6.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#mmIncomeType
	 * CashOption11.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption14#mmIncomeType
	 * CashOption14.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption16#mmIncomeType
	 * CashOption16.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption20#mmIncomeType
	 * CashOption20.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption25#mmIncomeType
	 * CashOption25.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption28#mmIncomeType
	 * CashOption28.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption4#mmIncomeType
	 * CashOption4.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption8#mmIncomeType
	 * CashOption8.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption10#mmIncomeType
	 * CashOption10.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption15#mmIncomeType
	 * CashOption15.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption17#mmIncomeType
	 * CashOption17.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption21#mmIncomeType
	 * CashOption21.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption24#mmIncomeType
	 * CashOption24.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption29#mmIncomeType
	 * CashOption29.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmIncomeType
	 * CorporateAction2.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#mmIncomeType
	 * CashOption30.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption31#mmIncomeType
	 * CashOption31.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption32#mmIncomeType
	 * CashOption32.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption36#mmIncomeType
	 * CashOption36.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption35#mmIncomeType
	 * CashOption35.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#mmIncomeType
	 * CashOption38.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#mmIncomeType
	 * CashOption39.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#mmIncomeType
	 * CashOption41.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#mmIncomeType
	 * CashOption44.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmIncomeType
	 * SecuritiesOption49.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption42#mmIncomeType
	 * CashOption42.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption43#mmIncomeType
	 * CashOption43.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmIncomeType
	 * SecuritiesOption50.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#mmIncomeType
	 * CashOption46.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmIncomeType
	 * SecuritiesOption55.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption49#mmIncomeType
	 * CashOption49.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption47#mmIncomeType
	 * CashOption47.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmIncomeType
	 * SecuritiesOption57.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmIncomeType
	 * CashOption52.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmIncomeType
	 * SecuritiesOption60.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption51#mmIncomeType
	 * CashOption51.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmIncomeType
	 * SecuritiesOption59.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption50#mmIncomeType
	 * CashOption50.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption53#mmIncomeType
	 * CashOption53.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmIncomeType
	 * SecuritiesOption61.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmIncomeType
	 * SecuritiesOption63.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption54#mmIncomeType
	 * CashOption54.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#mmIncomeType
	 * CashOption55.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption56#mmIncomeType
	 * CashOption56.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption57#mmIncomeType
	 * CashOption57.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmIncomeType
	 * SecuritiesOption64.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmIncomeType
	 * SecuritiesOption65.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmIncomeType
	 * CashOption58.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67#mmIncomeType
	 * SecuritiesOption67.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption60#mmIncomeType
	 * CashOption60.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmIncomeType
	 * SecuritiesOption68.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption61#mmIncomeType
	 * CashOption61.mmIncomeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption63#mmIncomeType
	 * CashOption63.mmIncomeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of income.\r\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashProceedsDefinition, GenericIdentification> mmIncomeType = new MMBusinessAssociationEnd<CashProceedsDefinition, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption2.mmIncomeType, CashOption9.mmIncomeType, CashOption12.mmIncomeType, CashOption13.mmIncomeType, CashOption18.mmIncomeType, CashOption22.mmIncomeType, CashOption26.mmIncomeType,
					CashOption27.mmIncomeType, CashOption3.mmIncomeType, CashOption6.mmIncomeType, CashOption11.mmIncomeType, CashOption14.mmIncomeType, CashOption16.mmIncomeType, CashOption20.mmIncomeType, CashOption25.mmIncomeType,
					CashOption28.mmIncomeType, CashOption4.mmIncomeType, CashOption8.mmIncomeType, CashOption10.mmIncomeType, CashOption15.mmIncomeType, CashOption17.mmIncomeType, CashOption21.mmIncomeType, CashOption24.mmIncomeType,
					CashOption29.mmIncomeType, CorporateAction2.mmIncomeType, CashOption30.mmIncomeType, CashOption31.mmIncomeType, CashOption32.mmIncomeType, CashOption36.mmIncomeType, CashOption35.mmIncomeType, CashOption38.mmIncomeType,
					CashOption39.mmIncomeType, CashOption41.mmIncomeType, CashOption44.mmIncomeType, SecuritiesOption49.mmIncomeType, CashOption42.mmIncomeType, CashOption43.mmIncomeType, SecuritiesOption50.mmIncomeType,
					CashOption46.mmIncomeType, SecuritiesOption55.mmIncomeType, CashOption49.mmIncomeType, CashOption47.mmIncomeType, SecuritiesOption57.mmIncomeType, CashOption52.mmIncomeType, SecuritiesOption60.mmIncomeType,
					CashOption51.mmIncomeType, SecuritiesOption59.mmIncomeType, CashOption50.mmIncomeType, CashOption53.mmIncomeType, SecuritiesOption61.mmIncomeType, SecuritiesOption63.mmIncomeType, CashOption54.mmIncomeType,
					CashOption55.mmIncomeType, CashOption56.mmIncomeType, CashOption57.mmIncomeType, SecuritiesOption64.mmIncomeType, SecuritiesOption65.mmIncomeType, CashOption58.mmIncomeType, SecuritiesOption67.mmIncomeType,
					CashOption60.mmIncomeType, SecuritiesOption68.mmIncomeType, CashOption61.mmIncomeType, CashOption63.mmIncomeType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\r\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForCashProceedsIncome;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(CashProceedsDefinition obj) {
			return obj.getIncomeType();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, GenericIdentification value) {
			obj.setIncomeType(value);
		}
	};
	protected CurrencyAndAmount indemnityAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmIndemnityAmount
	 * CorporateActionAmounts2.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmIndemnityAmount
	 * CorporateActionAmounts5.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmIndemnityAmount
	 * CorporateActionAmounts11.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmIndemnityAmount
	 * CorporateActionAmounts12.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmIndemnityAmount
	 * CorporateActionAmounts17.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmIndemnityAmount
	 * CorporateActionAmounts20.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmIndemnityAmount
	 * CorporateActionAmounts23.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmIndemnityAmount
	 * CorporateActionAmounts24.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmIndemnityAmount
	 * CorporateActionAmounts3.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmIndemnityAmount
	 * CorporateActionAmounts6.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmIndemnityAmount
	 * CorporateActionAmounts9.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmIndemnityAmount
	 * CorporateActionAmounts13.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmIndemnityAmount
	 * CorporateActionAmounts16.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmIndemnityAmount
	 * CorporateActionAmounts19.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmIndemnityAmount
	 * CorporateActionAmounts22.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmIndemnityAmount
	 * CorporateActionAmounts25.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmIndemnityAmount
	 * CorporateActionAmounts4.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmIndemnityAmount
	 * CorporateActionAmounts7.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmIndemnityAmount
	 * CorporateActionAmounts10.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmIndemnityAmount
	 * CorporateActionAmounts14.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmIndemnityAmount
	 * CorporateActionAmounts15.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmIndemnityAmount
	 * CorporateActionAmounts18.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmIndemnityAmount
	 * CorporateActionAmounts21.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmIndemnityAmount
	 * CorporateActionAmounts26.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmIndemnityAmount
	 * CorporateActionAmounts1.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmIndemnityAmount
	 * CorporateActionAmounts29.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmIndemnityAmount
	 * CorporateActionAmounts27.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmIndemnityAmount
	 * CorporateActionAmounts28.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmIndemnityAmount
	 * CorporateActionAmounts33.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmIndemnityAmount
	 * CorporateActionAmounts32.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmIndemnityAmount
	 * CorporateActionAmounts35.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmIndemnityAmount
	 * CorporateActionAmounts37.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmIndemnityAmount
	 * CorporateActionAmounts36.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmIndemnityAmount
	 * CorporateActionAmounts38.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmIndemnityAmount
	 * CorporateActionAmounts39.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmIndemnityAmount
	 * CorporateActionAmounts41.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmIndemnityAmount
	 * CorporateActionAmounts40.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmIndemnityAmount
	 * CorporateActionAmounts42.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmIndemnityAmount
	 * CorporateActionAmounts43.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmIndemnityAmount
	 * CorporateActionAmounts44.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmIndemnityAmount
	 * CorporateActionAmounts45.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmIndemnityAmount
	 * CorporateActionAmounts46.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmIndemnityAmount
	 * CorporateActionAmounts47.mmIndemnityAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndemnityAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount> mmIndemnityAmount = new MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmIndemnityAmount, CorporateActionAmounts5.mmIndemnityAmount, CorporateActionAmounts11.mmIndemnityAmount, CorporateActionAmounts12.mmIndemnityAmount,
					CorporateActionAmounts17.mmIndemnityAmount, CorporateActionAmounts20.mmIndemnityAmount, CorporateActionAmounts23.mmIndemnityAmount, CorporateActionAmounts24.mmIndemnityAmount, CorporateActionAmounts3.mmIndemnityAmount,
					CorporateActionAmounts6.mmIndemnityAmount, CorporateActionAmounts9.mmIndemnityAmount, CorporateActionAmounts13.mmIndemnityAmount, CorporateActionAmounts16.mmIndemnityAmount, CorporateActionAmounts19.mmIndemnityAmount,
					CorporateActionAmounts22.mmIndemnityAmount, CorporateActionAmounts25.mmIndemnityAmount, CorporateActionAmounts4.mmIndemnityAmount, CorporateActionAmounts7.mmIndemnityAmount, CorporateActionAmounts10.mmIndemnityAmount,
					CorporateActionAmounts14.mmIndemnityAmount, CorporateActionAmounts15.mmIndemnityAmount, CorporateActionAmounts18.mmIndemnityAmount, CorporateActionAmounts21.mmIndemnityAmount, CorporateActionAmounts26.mmIndemnityAmount,
					CorporateActionAmounts1.mmIndemnityAmount, CorporateActionAmounts29.mmIndemnityAmount, CorporateActionAmounts27.mmIndemnityAmount, CorporateActionAmounts28.mmIndemnityAmount, CorporateActionAmounts33.mmIndemnityAmount,
					CorporateActionAmounts32.mmIndemnityAmount, CorporateActionAmounts35.mmIndemnityAmount, CorporateActionAmounts37.mmIndemnityAmount, CorporateActionAmounts36.mmIndemnityAmount, CorporateActionAmounts38.mmIndemnityAmount,
					CorporateActionAmounts39.mmIndemnityAmount, CorporateActionAmounts41.mmIndemnityAmount, CorporateActionAmounts40.mmIndemnityAmount, CorporateActionAmounts42.mmIndemnityAmount, CorporateActionAmounts43.mmIndemnityAmount,
					CorporateActionAmounts44.mmIndemnityAmount, CorporateActionAmounts45.mmIndemnityAmount, CorporateActionAmounts46.mmIndemnityAmount, CorporateActionAmounts47.mmIndemnityAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashProceedsDefinition obj) {
			return obj.getIndemnityAmount();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, CurrencyAndAmount value) {
			obj.setIndemnityAmount(value);
		}
	};
	protected ActiveCurrencyAndAmount cashIncentiveAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashIncentive
	 * CorporateActionAmounts2.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmCashIncentive
	 * CorporateActionAmounts5.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmCashIncentive
	 * CorporateActionAmounts11.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashIncentive
	 * CorporateActionAmounts12.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmCashIncentive
	 * CorporateActionAmounts17.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmCashIncentive
	 * CorporateActionAmounts20.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmCashIncentive
	 * CorporateActionAmounts3.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmCashIncentive
	 * CorporateActionAmounts6.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmCashIncentive
	 * CorporateActionAmounts9.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmCashIncentive
	 * CorporateActionAmounts13.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmCashIncentive
	 * CorporateActionAmounts16.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmCashIncentive
	 * CorporateActionAmounts19.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmCashIncentive
	 * CorporateActionAmounts4.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmCashIncentive
	 * CorporateActionAmounts7.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmCashIncentive
	 * CorporateActionAmounts10.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmCashIncentive
	 * CorporateActionAmounts14.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmCashIncentive
	 * CorporateActionAmounts15.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmCashIncentive
	 * CorporateActionAmounts18.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmCashIncentive
	 * CorporateActionRate2.mmCashIncentive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmCashIncentive
	 * CorporateActionAmounts1.mmCashIncentive}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentiveAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, ActiveCurrencyAndAmount> mmCashIncentiveAmount = new MMBusinessAttribute<CashProceedsDefinition, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmCashIncentive, CorporateActionAmounts5.mmCashIncentive, CorporateActionAmounts11.mmCashIncentive, CorporateActionAmounts12.mmCashIncentive,
					CorporateActionAmounts17.mmCashIncentive, CorporateActionAmounts20.mmCashIncentive, CorporateActionAmounts3.mmCashIncentive, CorporateActionAmounts6.mmCashIncentive, CorporateActionAmounts9.mmCashIncentive,
					CorporateActionAmounts13.mmCashIncentive, CorporateActionAmounts16.mmCashIncentive, CorporateActionAmounts19.mmCashIncentive, CorporateActionAmounts4.mmCashIncentive, CorporateActionAmounts7.mmCashIncentive,
					CorporateActionAmounts10.mmCashIncentive, CorporateActionAmounts14.mmCashIncentive, CorporateActionAmounts15.mmCashIncentive, CorporateActionAmounts18.mmCashIncentive, CorporateActionRate2.mmCashIncentive,
					CorporateActionAmounts1.mmCashIncentive);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveAmount";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CashProceedsDefinition obj) {
			return obj.getCashIncentiveAmount();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, ActiveCurrencyAndAmount value) {
			obj.setCashIncentiveAmount(value);
		}
	};
	protected CurrencyAndAmount principalOrCorpus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPrincipalOrCorpus
	 * CorporateActionAmounts2.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmPrincipalOrCorpus
	 * CorporateActionAmounts5.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmPrincipalOrCorpus
	 * CorporateActionAmounts11.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPrincipalOrCorpus
	 * CorporateActionAmounts12.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmPrincipalOrCorpus
	 * CorporateActionAmounts17.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmPrincipalOrCorpus
	 * CorporateActionAmounts20.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmPrincipalOrCorpus
	 * CorporateActionAmounts23.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmPrincipalOrCorpus
	 * CorporateActionAmounts24.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmPrincipalOrCorpus
	 * CorporateActionAmounts4.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmPrincipalOrCorpus
	 * CorporateActionAmounts7.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmPrincipalOrCorpus
	 * CorporateActionAmounts10.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmPrincipalOrCorpus
	 * CorporateActionAmounts14.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmPrincipalOrCorpus
	 * CorporateActionAmounts15.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmPrincipalOrCorpus
	 * CorporateActionAmounts18.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmPrincipalOrCorpus
	 * CorporateActionAmounts21.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmPrincipalOrCorpus
	 * CorporateActionAmounts26.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmPrincipalOrCorpus
	 * CorporateActionAmounts1.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmPrincipalOrCorpus
	 * CorporateActionAmounts29.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmPrincipalOrCorpus
	 * CorporateActionAmounts27.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmPrincipalOrCorpus
	 * CorporateActionAmounts32.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmPrincipalOrCorpus
	 * CorporateActionAmounts35.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmPrincipalOrCorpus
	 * CorporateActionAmounts37.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmPrincipalOrCorpus
	 * CorporateActionAmounts36.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmPrincipalOrCorpus
	 * CorporateActionAmounts39.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmPrincipalOrCorpus
	 * CorporateActionAmounts41.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmPrincipalOrCorpus
	 * CorporateActionAmounts42.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmPrincipalOrCorpus
	 * CorporateActionAmounts44.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmPrincipalOrCorpus
	 * CorporateActionAmounts45.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmPrincipalOrCorpus
	 * CorporateActionAmounts47.mmPrincipalOrCorpus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalOrCorpus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money representing a distribution of a bond's principal, eg, repayment of outstanding debt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount> mmPrincipalOrCorpus = new MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmPrincipalOrCorpus, CorporateActionAmounts5.mmPrincipalOrCorpus, CorporateActionAmounts11.mmPrincipalOrCorpus, CorporateActionAmounts12.mmPrincipalOrCorpus,
					CorporateActionAmounts17.mmPrincipalOrCorpus, CorporateActionAmounts20.mmPrincipalOrCorpus, CorporateActionAmounts23.mmPrincipalOrCorpus, CorporateActionAmounts24.mmPrincipalOrCorpus,
					CorporateActionAmounts4.mmPrincipalOrCorpus, CorporateActionAmounts7.mmPrincipalOrCorpus, CorporateActionAmounts10.mmPrincipalOrCorpus, CorporateActionAmounts14.mmPrincipalOrCorpus,
					CorporateActionAmounts15.mmPrincipalOrCorpus, CorporateActionAmounts18.mmPrincipalOrCorpus, CorporateActionAmounts21.mmPrincipalOrCorpus, CorporateActionAmounts26.mmPrincipalOrCorpus,
					CorporateActionAmounts1.mmPrincipalOrCorpus, CorporateActionAmounts29.mmPrincipalOrCorpus, CorporateActionAmounts27.mmPrincipalOrCorpus, CorporateActionAmounts32.mmPrincipalOrCorpus,
					CorporateActionAmounts35.mmPrincipalOrCorpus, CorporateActionAmounts37.mmPrincipalOrCorpus, CorporateActionAmounts36.mmPrincipalOrCorpus, CorporateActionAmounts39.mmPrincipalOrCorpus,
					CorporateActionAmounts41.mmPrincipalOrCorpus, CorporateActionAmounts42.mmPrincipalOrCorpus, CorporateActionAmounts44.mmPrincipalOrCorpus, CorporateActionAmounts45.mmPrincipalOrCorpus,
					CorporateActionAmounts47.mmPrincipalOrCorpus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, eg, repayment of outstanding debt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashProceedsDefinition obj) {
			return obj.getPrincipalOrCorpus();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, CurrencyAndAmount value) {
			obj.setPrincipalOrCorpus(value);
		}
	};
	protected CurrencyAndAmount redemptionPremiumAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmRedemptionPremiumAmount
	 * CorporateActionAmounts2.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmRedemptionPremiumAmount
	 * CorporateActionAmounts5.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmRedemptionPremiumAmount
	 * CorporateActionAmounts11.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmRedemptionPremiumAmount
	 * CorporateActionAmounts12.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmRedemptionPremiumAmount
	 * CorporateActionAmounts17.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmRedemptionPremiumAmount
	 * CorporateActionAmounts20.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmRedemptionPremiumAmount
	 * CorporateActionAmounts23.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmRedemptionPremiumAmount
	 * CorporateActionAmounts24.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmRedemptionPremiumAmount
	 * CorporateActionAmounts4.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmRedemptionPremiumAmount
	 * CorporateActionAmounts7.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmRedemptionPremiumAmount
	 * CorporateActionAmounts10.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmRedemptionPremiumAmount
	 * CorporateActionAmounts14.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmRedemptionPremiumAmount
	 * CorporateActionAmounts15.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmRedemptionPremiumAmount
	 * CorporateActionAmounts18.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmRedemptionPremiumAmount
	 * CorporateActionAmounts21.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmRedemptionPremiumAmount
	 * CorporateActionAmounts26.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmRedemptionPremiumAmount
	 * CorporateActionAmounts1.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmRedemptionPremiumAmount
	 * CorporateActionAmounts29.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmRedemptionPremiumAmount
	 * CorporateActionAmounts27.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmRedemptionPremiumAmount
	 * CorporateActionAmounts32.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmRedemptionPremiumAmount
	 * CorporateActionAmounts35.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmRedemptionPremiumAmount
	 * CorporateActionAmounts37.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmRedemptionPremiumAmount
	 * CorporateActionAmounts36.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmRedemptionPremiumAmount
	 * CorporateActionAmounts39.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmRedemptionPremiumAmount
	 * CorporateActionAmounts41.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmRedemptionPremiumAmount
	 * CorporateActionAmounts42.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmRedemptionPremiumAmount
	 * CorporateActionAmounts44.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmRedemptionPremiumAmount
	 * CorporateActionAmounts45.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmRedemptionPremiumAmount
	 * CorporateActionAmounts47.mmRedemptionPremiumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (not interest) in addition to the principal at the redemption of a bond."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount> mmRedemptionPremiumAmount = new MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmRedemptionPremiumAmount, CorporateActionAmounts5.mmRedemptionPremiumAmount, CorporateActionAmounts11.mmRedemptionPremiumAmount,
					CorporateActionAmounts12.mmRedemptionPremiumAmount, CorporateActionAmounts17.mmRedemptionPremiumAmount, CorporateActionAmounts20.mmRedemptionPremiumAmount, CorporateActionAmounts23.mmRedemptionPremiumAmount,
					CorporateActionAmounts24.mmRedemptionPremiumAmount, CorporateActionAmounts4.mmRedemptionPremiumAmount, CorporateActionAmounts7.mmRedemptionPremiumAmount, CorporateActionAmounts10.mmRedemptionPremiumAmount,
					CorporateActionAmounts14.mmRedemptionPremiumAmount, CorporateActionAmounts15.mmRedemptionPremiumAmount, CorporateActionAmounts18.mmRedemptionPremiumAmount, CorporateActionAmounts21.mmRedemptionPremiumAmount,
					CorporateActionAmounts26.mmRedemptionPremiumAmount, CorporateActionAmounts1.mmRedemptionPremiumAmount, CorporateActionAmounts29.mmRedemptionPremiumAmount, CorporateActionAmounts27.mmRedemptionPremiumAmount,
					CorporateActionAmounts32.mmRedemptionPremiumAmount, CorporateActionAmounts35.mmRedemptionPremiumAmount, CorporateActionAmounts37.mmRedemptionPremiumAmount, CorporateActionAmounts36.mmRedemptionPremiumAmount,
					CorporateActionAmounts39.mmRedemptionPremiumAmount, CorporateActionAmounts41.mmRedemptionPremiumAmount, CorporateActionAmounts42.mmRedemptionPremiumAmount, CorporateActionAmounts44.mmRedemptionPremiumAmount,
					CorporateActionAmounts45.mmRedemptionPremiumAmount, CorporateActionAmounts47.mmRedemptionPremiumAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashProceedsDefinition obj) {
			return obj.getRedemptionPremiumAmount();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, CurrencyAndAmount value) {
			obj.setRedemptionPremiumAmount(value);
		}
	};
	protected CurrencyAndAmount incomePortion;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmIncomePortion
	 * CorporateActionAmounts2.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmIncomePortion
	 * CorporateActionAmounts5.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmIncomePortion
	 * CorporateActionAmounts11.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmIncomePortion
	 * CorporateActionAmounts12.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmIncomePortion
	 * CorporateActionAmounts17.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmIncomePortion
	 * CorporateActionAmounts20.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmIncomePortion
	 * CorporateActionAmounts23.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmIncomePortion
	 * CorporateActionAmounts24.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmIncomePortion
	 * CorporateActionAmounts3.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmIncomePortion
	 * CorporateActionAmounts6.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmIncomePortion
	 * CorporateActionAmounts9.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmIncomePortion
	 * CorporateActionAmounts13.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmIncomePortion
	 * CorporateActionAmounts16.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmIncomePortion
	 * CorporateActionAmounts19.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmIncomePortion
	 * CorporateActionAmounts22.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmIncomePortion
	 * CorporateActionAmounts25.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmIncomePortion
	 * CorporateActionAmounts4.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmIncomePortion
	 * CorporateActionAmounts7.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmIncomePortion
	 * CorporateActionAmounts10.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmIncomePortion
	 * CorporateActionAmounts14.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmIncomePortion
	 * CorporateActionAmounts15.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmIncomePortion
	 * CorporateActionAmounts18.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmIncomePortion
	 * CorporateActionAmounts21.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmIncomePortion
	 * CorporateActionAmounts26.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmIncomePortion
	 * CorporateActionAmounts29.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmIncomePortion
	 * CorporateActionAmounts27.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmIncomePortion
	 * CorporateActionAmounts28.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmIncomePortion
	 * CorporateActionAmounts33.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmIncomePortion
	 * CorporateActionAmounts32.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmIncomePortion
	 * CorporateActionAmounts35.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmIncomePortion
	 * CorporateActionAmounts37.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmIncomePortion
	 * CorporateActionAmounts36.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmIncomePortion
	 * CorporateActionAmounts38.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmIncomePortion
	 * CorporateActionAmounts39.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmIncomePortion
	 * CorporateActionAmounts41.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmIncomePortion
	 * CorporateActionAmounts40.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmIncomePortion
	 * CorporateActionAmounts42.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmIncomePortion
	 * CorporateActionAmounts43.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmIncomePortion
	 * CorporateActionAmounts44.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmIncomePortion
	 * CorporateActionAmounts45.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmIncomePortion
	 * CorporateActionAmounts46.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmIncomePortion
	 * CorporateActionAmounts47.mmIncomePortion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount relating to the underlying security for which income is distributed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount> mmIncomePortion = new MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmIncomePortion, CorporateActionAmounts5.mmIncomePortion, CorporateActionAmounts11.mmIncomePortion, CorporateActionAmounts12.mmIncomePortion,
					CorporateActionAmounts17.mmIncomePortion, CorporateActionAmounts20.mmIncomePortion, CorporateActionAmounts23.mmIncomePortion, CorporateActionAmounts24.mmIncomePortion, CorporateActionAmounts3.mmIncomePortion,
					CorporateActionAmounts6.mmIncomePortion, CorporateActionAmounts9.mmIncomePortion, CorporateActionAmounts13.mmIncomePortion, CorporateActionAmounts16.mmIncomePortion, CorporateActionAmounts19.mmIncomePortion,
					CorporateActionAmounts22.mmIncomePortion, CorporateActionAmounts25.mmIncomePortion, CorporateActionAmounts4.mmIncomePortion, CorporateActionAmounts7.mmIncomePortion, CorporateActionAmounts10.mmIncomePortion,
					CorporateActionAmounts14.mmIncomePortion, CorporateActionAmounts15.mmIncomePortion, CorporateActionAmounts18.mmIncomePortion, CorporateActionAmounts21.mmIncomePortion, CorporateActionAmounts26.mmIncomePortion,
					CorporateActionAmounts29.mmIncomePortion, CorporateActionAmounts27.mmIncomePortion, CorporateActionAmounts28.mmIncomePortion, CorporateActionAmounts33.mmIncomePortion, CorporateActionAmounts32.mmIncomePortion,
					CorporateActionAmounts35.mmIncomePortion, CorporateActionAmounts37.mmIncomePortion, CorporateActionAmounts36.mmIncomePortion, CorporateActionAmounts38.mmIncomePortion, CorporateActionAmounts39.mmIncomePortion,
					CorporateActionAmounts41.mmIncomePortion, CorporateActionAmounts40.mmIncomePortion, CorporateActionAmounts42.mmIncomePortion, CorporateActionAmounts43.mmIncomePortion, CorporateActionAmounts44.mmIncomePortion,
					CorporateActionAmounts45.mmIncomePortion, CorporateActionAmounts46.mmIncomePortion, CorporateActionAmounts47.mmIncomePortion);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashProceedsDefinition obj) {
			return obj.getIncomePortion();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, CurrencyAndAmount value) {
			obj.setIncomePortion(value);
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedCashProceedsDefinition
	 * Interest.mmRelatedCashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmInterest
	 * CorporateActionRate3.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmInterest
	 * CorporateActionRate14.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmInterest
	 * CorporateActionRate16.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmInterest
	 * CorporateActionRate24.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmInterest
	 * CorporateActionRate27.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmInterest
	 * CorporateActionRate32.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmInterest
	 * CorporateActionRate35.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmInterest
	 * CorporateActionRate41.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmInterest
	 * CorporateActionRate1.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmInterest
	 * CorporateActionRate43.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmInterest
	 * CorporateActionRate56.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmInterest
	 * CorporateActionRate66.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmInterest
	 * CorporateActionRate78.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmInterestRate
	 * CorporateActionRate91.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate96#mmInterestRate
	 * CorporateActionRate96.mmInterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest paid as the proceeds of a CA event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashProceedsDefinition, List<Interest>> mmInterest = new MMBusinessAssociationEnd<CashProceedsDefinition, List<Interest>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate3.mmInterest, CorporateActionRate14.mmInterest, CorporateActionRate16.mmInterest, CorporateActionRate24.mmInterest, CorporateActionRate27.mmInterest,
					CorporateActionRate32.mmInterest, CorporateActionRate35.mmInterest, CorporateActionRate41.mmInterest, CorporateActionRate1.mmInterest, CorporateActionRate43.mmInterest, CorporateActionRate56.mmInterest,
					CorporateActionRate66.mmInterest, CorporateActionRate78.mmInterest, CorporateActionRate91.mmInterestRate, CorporateActionRate96.mmInterestRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest paid as the proceeds of a CA event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedCashProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}

		@Override
		public List<Interest> getValue(CashProceedsDefinition obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, List<Interest> value) {
			obj.setInterest(value);
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount which is posted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Cash amount which is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashProceedsDefinition obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmCashProceeds
	 * Dividend.mmCashProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, eg, company products or property. The dividend amount is decided by the board of directors."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashProceedsDefinition, List<Dividend>> mmDividend = new MMBusinessAssociationEnd<CashProceedsDefinition, List<Dividend>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, eg, company products or property. The dividend amount is decided by the board of directors.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmCashProceeds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}

		@Override
		public List<Dividend> getValue(CashProceedsDefinition obj) {
			return obj.getDividend();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, List<Dividend> value) {
			obj.setDividend(value);
		}
	};
	protected CurrencyCode paymentCurrency;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for the payment of the cash proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, CurrencyCode> mmPaymentCurrency = new MMBusinessAttribute<CashProceedsDefinition, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency for the payment of the cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CashProceedsDefinition obj) {
			return obj.getPaymentCurrency();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, CurrencyCode value) {
			obj.setPaymentCurrency(value);
		}
	};
	protected CurrencyAndAmount statusCashAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmStatusCashAmount
	 * CorporateActionOption141.mmStatusCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144#mmStatusCashAmount
	 * CorporateActionOption144.mmStatusCashAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash subscribed that has been assigned the status indicated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount> mmStatusCashAmount = new MMBusinessAttribute<CashProceedsDefinition, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption141.mmStatusCashAmount, CorporateActionOption144.mmStatusCashAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusCashAmount";
			definition = "Amount of cash subscribed that has been assigned the status indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashProceedsDefinition obj) {
			return obj.getStatusCashAmount();
		}

		@Override
		public void setValue(CashProceedsDefinition obj, CurrencyAndAmount value) {
			obj.setStatusCashAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashProceedsDefinition";
				definition = "Definition of the cash proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a dividend payment where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentificationForCashProceedsIncome, com.tools20022.repository.entity.Dividend.mmCashProceeds,
						com.tools20022.repository.entity.Interest.mmRelatedCashProceedsDefinition);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionOption4.mmCashMovementDetails, CorporateActionOption14.mmCashMovementDetails, CorporateActionOption23.mmCashMovementDetails,
						CorporateActionOption31.mmCashMovementDetails, CorporateActionOption37.mmCashMovementDetails, CorporateActionOption46.mmCashMovementDetails, CorporateActionOption53.mmCashMovementDetails,
						CorporateActionOption54.mmCashMovementDetails, CorporateActionOption10.mmCashMovementDetails, CorporateActionOption15.mmCashMovementDetails, CorporateActionOption20.mmCashMovementDetails,
						CorporateActionOption32.mmCashMovementDetails, CorporateActionOption35.mmCashMovementDetails, CorporateActionOption44.mmCashMovementDetails, CorporateActionOption52.mmCashMovementDetails,
						CorporateActionOption55.mmCashMovementDetails, CorporateActionOption12.mmCashMovementDetails, CorporateActionOption16.mmCashMovementDetails, CorporateActionOption24.mmCashMovementDetails,
						CorporateActionOption33.mmCashMovementDetails, CorporateActionOption39.mmCashMovementDetails, CorporateActionOption48.mmCashMovementDetails, CorporateActionOption3.mmCashMovementDetails,
						CorporateActionOption17.mmCashMovementDetails, CorporateActionOption19.mmCashMovementDetails, CorporateActionOption34.mmCashMovementDetails, CorporateActionOption36.mmCashMovementDetails,
						CorporateActionOption45.mmCashMovementDetails, CorporateActionOption51.mmCashMovementDetails, CorporateActionOption56.mmCashMovementDetails, CorporateActionOption1.mmCashMovementDetails,
						CorporateActionOption100.mmCashMovementDetails, CorporateActionOption101.mmCashMovementDetails, CorporateActionOption102.mmCashMovementDetails, CorporateActionOption110.mmCashMovementDetails,
						CorporateActionOption108.mmCashMovementDetails, CorporateActionOption106.mmCashMovementDetails, CorporateActionOption111.mmCashMovementDetails, CorporateActionOption113.mmCashMovementDetails,
						CorporateActionOption117.mmCashMovementDetails, CorporateActionOption119.mmCashMovementDetails, CorporateActionOption115.mmCashMovementDetails, CorporateActionOption114.mmCashMovementDetails,
						CorporateActionOption126.mmCashMovementDetails, CorporateActionOption124.mmCashMovementDetails, CorporateActionOption125.mmCashMovementDetails, CorporateActionOption127.mmCashMovementDetails,
						CorporateActionOption132.mmCashMovementDetails, CorporateActionOption130.mmCashMovementDetails, CorporateActionOption129.mmCashMovementDetails, CorporateActionOption136.mmCashMovementDetails,
						CorporateActionOption135.mmCashMovementDetails, CorporateActionOption133.mmCashMovementDetails, CorporateActionOption140.mmCashMovementDetails, CorporateActionOption138.mmCashMovementDetails,
						CorporateActionOption139.mmCashMovementDetails, CorporateActionOption143.mmCashMovementDetails, CorporateActionOption147.mmCashMovementDetails, CorporateActionOption148.mmCashMovementDetails,
						CorporateActionOption149.mmCashMovementDetails, CorporateActionOption150.mmCashMovementDetails);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashProceedsDefinition.mmCashIncentiveRate, com.tools20022.repository.entity.CashProceedsDefinition.mmContractualPaymentIndicator,
						com.tools20022.repository.entity.CashProceedsDefinition.mmIncomeType, com.tools20022.repository.entity.CashProceedsDefinition.mmIndemnityAmount,
						com.tools20022.repository.entity.CashProceedsDefinition.mmCashIncentiveAmount, com.tools20022.repository.entity.CashProceedsDefinition.mmPrincipalOrCorpus,
						com.tools20022.repository.entity.CashProceedsDefinition.mmRedemptionPremiumAmount, com.tools20022.repository.entity.CashProceedsDefinition.mmIncomePortion,
						com.tools20022.repository.entity.CashProceedsDefinition.mmInterest, com.tools20022.repository.entity.CashProceedsDefinition.mmAmount, com.tools20022.repository.entity.CashProceedsDefinition.mmDividend,
						com.tools20022.repository.entity.CashProceedsDefinition.mmPaymentCurrency, com.tools20022.repository.entity.CashProceedsDefinition.mmStatusCashAmount);
				derivationComponent_lazy = () -> Arrays.asList(CashOption2.mmObject(), CashOption9.mmObject(), CashOption12.mmObject(), CashOption13.mmObject(), CashOption18.mmObject(), CashOption22.mmObject(), CashOption26.mmObject(),
						CashOption27.mmObject(), CashOption3.mmObject(), CashOption6.mmObject(), CashOption11.mmObject(), CashOption14.mmObject(), CashOption16.mmObject(), CashOption20.mmObject(), CashOption25.mmObject(),
						CashOption28.mmObject(), CashOption5.mmObject(), CashOption7.mmObject(), CashOption19.mmObject(), CashOption23.mmObject(), CashOption4.mmObject(), CashOption8.mmObject(), CashOption10.mmObject(),
						CashOption15.mmObject(), CashOption17.mmObject(), CashOption21.mmObject(), CashOption24.mmObject(), CashOption29.mmObject(), CashOption1.mmObject(), CashProceeds1.mmObject(), CashOption30.mmObject(),
						CashOption31.mmObject(), CashOption32.mmObject(), CashOption36.mmObject(), CashOption35.mmObject(), CashOption38.mmObject(), CashOption39.mmObject(), CashOption41.mmObject(), CashOption44.mmObject(),
						CashOption45.mmObject(), CashOption42.mmObject(), CashOption43.mmObject(), CashOption46.mmObject(), CashOption49.mmObject(), CashOption47.mmObject(), CashOption48.mmObject(), CashOption52.mmObject(),
						CashOption51.mmObject(), CashOption50.mmObject(), CashOption53.mmObject(), CashOption54.mmObject(), CashOption55.mmObject(), CashOption56.mmObject(), CashOption57.mmObject(), CashOption58.mmObject(),
						CashOption59.mmObject(), CashOption60.mmObject(), CashOption61.mmObject(), CashOption62.mmObject(), CashOption63.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashProceedsDefinition.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getCashIncentiveRate() {
		return cashIncentiveRate;
	}

	public CashProceedsDefinition setCashIncentiveRate(PercentageRate cashIncentiveRate) {
		this.cashIncentiveRate = Objects.requireNonNull(cashIncentiveRate);
		return this;
	}

	public PaymentCode getContractualPaymentIndicator() {
		return contractualPaymentIndicator;
	}

	public CashProceedsDefinition setContractualPaymentIndicator(PaymentCode contractualPaymentIndicator) {
		this.contractualPaymentIndicator = Objects.requireNonNull(contractualPaymentIndicator);
		return this;
	}

	public GenericIdentification getIncomeType() {
		return incomeType;
	}

	public CashProceedsDefinition setIncomeType(GenericIdentification incomeType) {
		this.incomeType = Objects.requireNonNull(incomeType);
		return this;
	}

	public CurrencyAndAmount getIndemnityAmount() {
		return indemnityAmount;
	}

	public CashProceedsDefinition setIndemnityAmount(CurrencyAndAmount indemnityAmount) {
		this.indemnityAmount = Objects.requireNonNull(indemnityAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getCashIncentiveAmount() {
		return cashIncentiveAmount;
	}

	public CashProceedsDefinition setCashIncentiveAmount(ActiveCurrencyAndAmount cashIncentiveAmount) {
		this.cashIncentiveAmount = Objects.requireNonNull(cashIncentiveAmount);
		return this;
	}

	public CurrencyAndAmount getPrincipalOrCorpus() {
		return principalOrCorpus;
	}

	public CashProceedsDefinition setPrincipalOrCorpus(CurrencyAndAmount principalOrCorpus) {
		this.principalOrCorpus = Objects.requireNonNull(principalOrCorpus);
		return this;
	}

	public CurrencyAndAmount getRedemptionPremiumAmount() {
		return redemptionPremiumAmount;
	}

	public CashProceedsDefinition setRedemptionPremiumAmount(CurrencyAndAmount redemptionPremiumAmount) {
		this.redemptionPremiumAmount = Objects.requireNonNull(redemptionPremiumAmount);
		return this;
	}

	public CurrencyAndAmount getIncomePortion() {
		return incomePortion;
	}

	public CashProceedsDefinition setIncomePortion(CurrencyAndAmount incomePortion) {
		this.incomePortion = Objects.requireNonNull(incomePortion);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public CashProceedsDefinition setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public CashProceedsDefinition setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<Dividend> getDividend() {
		return dividend == null ? dividend = new ArrayList<>() : dividend;
	}

	public CashProceedsDefinition setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = Objects.requireNonNull(dividend);
		return this;
	}

	public CurrencyCode getPaymentCurrency() {
		return paymentCurrency;
	}

	public CashProceedsDefinition setPaymentCurrency(CurrencyCode paymentCurrency) {
		this.paymentCurrency = Objects.requireNonNull(paymentCurrency);
		return this;
	}

	public CurrencyAndAmount getStatusCashAmount() {
		return statusCashAmount;
	}

	public CashProceedsDefinition setStatusCashAmount(CurrencyAndAmount statusCashAmount) {
		this.statusCashAmount = Objects.requireNonNull(statusCashAmount);
		return this;
	}
}