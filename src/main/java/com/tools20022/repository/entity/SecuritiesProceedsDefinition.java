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
import com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode;
import com.tools20022.repository.codeset.ShareRankingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The definition of the securities proceeds for a corporate action in generic
 * terms; that is, before applying it to specific securities holding. An example
 * would be the definition of a bonus rights issue where all the information
 * will be given in general on a per share basis.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesProceedsDefinition"
 * src="doc-files/SecuritiesProceedsDefinition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat2Choice
 * IntermediateSecuritiesDistributionTypeFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat6Choice
 * IntermediateSecuritiesDistributionTypeFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat7Choice
 * IntermediateSecuritiesDistributionTypeFormat7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat4Choice
 * IntermediateSecuritiesDistributionTypeFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat1Choice
 * IntermediateSecuritiesDistributionTypeFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice
 * IntermediateSecuritiesDistributionTypeFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice
 * IntermediateSecuritiesDistributionTypeFormat9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice
 * IntermediateSecuritiesDistributionTypeFormat10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat3Choice
 * IntermediateSecuritiesDistributionTypeFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat8Choice
 * IntermediateSecuritiesDistributionTypeFormat8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice
 * IntermediateSecurityDistributionType1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat13Choice
 * IntermediateSecuritiesDistributionTypeFormat13Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat14Choice
 * IntermediateSecuritiesDistributionTypeFormat14Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat16Choice
 * IntermediateSecuritiesDistributionTypeFormat16Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice
 * IntermediateSecuritiesDistributionTypeFormat15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice
 * IntermediateSecuritiesDistributionTypeFormat18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice
 * IntermediateSecuritiesDistributionTypeFormat17Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmParallelTradingProceedsDefinition
 * DateTimePeriod.mmParallelTradingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssentedLinePeriodProceedsDefinition
 * DateTimePeriod.mmAssentedLinePeriodProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSellThruIssuerProceedsDefinition
 * DateTimePeriod.mmSellThruIssuerProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesProceedsDefinition
 * SecuritiesQuantity.mmSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmConditionalQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOverAndAboveQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmExpectedQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmStatusRelatedSecuritiesProceeds
 * SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBoardLotSecuritiesProceeds
 * SecuritiesQuantity.mmBoardLotSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNewDenominationSecuritiesProceeds
 * SecuritiesQuantity.mmNewDenominationSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForResultantSecuritiesProceedsDefinition
 * QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition
 * QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToOldProceedsDefinition
 * QuantityRatio.mmNewToOldProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToUnderlyingProceedsDefinition
 * QuantityRatio.mmNewToUnderlyingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmIntermediateSecuritiesProceedsDefinition
 * QuantityRatio.mmIntermediateSecuritiesProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
 * ProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmConditionalQuantity
 * SecuritiesProceedsDefinition.mmConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmOverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmQuantityToReceive
 * SecuritiesProceedsDefinition.mmQuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmStatusQuantity
 * SecuritiesProceedsDefinition.mmStatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
 * SecuritiesProceedsDefinition.
 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
 * SecuritiesProceedsDefinition.mmNewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentAmount
 * SecuritiesProceedsDefinition.mmReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesToUnderlyingRatio
 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentDiscountToMarket
 * SecuritiesProceedsDefinition.mmReinvestmentDiscountToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmRedemptionDate
 * SecuritiesProceedsDefinition.mmRedemptionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAssentedLinePeriod
 * SecuritiesProceedsDefinition.mmAssentedLinePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSellThruIssuerPeriod
 * SecuritiesProceedsDefinition.mmSellThruIssuerPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmShareRanking
 * SecuritiesProceedsDefinition.mmShareRanking}</li>
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
 * "SecuritiesProceedsDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The definition of the securities proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a  bonus rights issue where all the information will be given in general on a per share basis."
 * </li>
 * </ul>
 */
public class SecuritiesProceedsDefinition extends ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity securitiesQuantity;
	/**
	 * The quantity of financial instruments that is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesProceedsDefinition
	 * SecuritiesQuantity.mmSecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmSecuritiesQuantity
	 * CorporateActionOption5.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmSecuritiesQuantity
	 * CorporateActionOption13.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmSecuritiesQuantity
	 * CorporateActionOption25.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmSecuritiesQuantity
	 * CorporateActionOption30.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmSecuritiesQuantity
	 * CorporateActionOption38.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmSecuritiesQuantity
	 * CorporateActionOption47.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmSecuritiesQuantity
	 * CorporateActionOption57.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmSecuritiesQuantity
	 * CorporateActionOption58.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmSecuritiesQuantity
	 * CorporateActionOption10.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmSecuritiesQuantity
	 * CorporateActionOption15.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmSecuritiesQuantity
	 * CorporateActionOption20.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmSecuritiesQuantity
	 * CorporateActionOption32.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmSecuritiesQuantity
	 * CorporateActionOption35.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmSecuritiesQuantity
	 * CorporateActionOption44.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmSecuritiesQuantity
	 * CorporateActionOption52.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmSecuritiesQuantity
	 * CorporateActionOption55.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmSecuritiesQuantity
	 * CorporateActionOption3.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmSecuritiesQuantity
	 * CorporateActionOption17.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmSecuritiesQuantity
	 * CorporateActionOption19.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmSecuritiesQuantity
	 * CorporateActionOption34.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmSecuritiesQuantity
	 * CorporateAction7.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmSecuritiesQuantity
	 * CorporateActionOption36.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmSecuritiesQuantity
	 * CorporateAction8.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmSecuritiesQuantity
	 * CorporateActionOption45.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmSecuritiesQuantity
	 * CorporateActionOption51.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmSecuritiesQuantity
	 * CorporateActionOption56.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmSecuritiesQuantity
	 * SecurityOption1.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmSecuritiesQuantity
	 * CorporateActionOption103.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmSecuritiesQuantity
	 * CorporateActionOption100.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmSecuritiesQuantity
	 * CorporateActionOption101.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmSecuritiesQuantity
	 * CorporateActionOption108.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmSecuritiesQuantity
	 * CorporateActionOption107.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmSecuritiesQuantity
	 * CorporateActionOption106.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmSecuritiesQuantity
	 * CorporateActionOption118.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmSecuritiesQuantity
	 * CorporateActionOption115.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmSecuritiesQuantity
	 * CorporateActionOption114.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmSecuritiesQuantity
	 * CorporateActionOption125.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmSecuritiesQuantity
	 * CorporateActionOption123.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmSecuritiesQuantity
	 * CorporateActionOption127.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmSecuritiesQuantity
	 * CorporateActionOption130.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmSecuritiesQuantityOrInstructedAmount
	 * CorporateActionOption131.mmSecuritiesQuantityOrInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmSecuritiesQuantity
	 * CorporateActionOption129.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmSecuritiesQuantityOrInstructedAmount
	 * CorporateActionOption134.mmSecuritiesQuantityOrInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmSecuritiesQuantity
	 * CorporateActionOption135.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmSecuritiesQuantity
	 * CorporateActionOption133.mmSecuritiesQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The quantity of financial instruments that is posted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption5.mmSecuritiesQuantity, CorporateActionOption13.mmSecuritiesQuantity, CorporateActionOption25.mmSecuritiesQuantity, CorporateActionOption30.mmSecuritiesQuantity,
					CorporateActionOption38.mmSecuritiesQuantity, CorporateActionOption47.mmSecuritiesQuantity, CorporateActionOption57.mmSecuritiesQuantity, CorporateActionOption58.mmSecuritiesQuantity,
					CorporateActionOption10.mmSecuritiesQuantity, CorporateActionOption15.mmSecuritiesQuantity, CorporateActionOption20.mmSecuritiesQuantity, CorporateActionOption32.mmSecuritiesQuantity,
					CorporateActionOption35.mmSecuritiesQuantity, CorporateActionOption44.mmSecuritiesQuantity, CorporateActionOption52.mmSecuritiesQuantity, CorporateActionOption55.mmSecuritiesQuantity,
					CorporateActionOption3.mmSecuritiesQuantity, CorporateActionOption17.mmSecuritiesQuantity, CorporateActionOption19.mmSecuritiesQuantity, CorporateActionOption34.mmSecuritiesQuantity,
					CorporateAction7.mmSecuritiesQuantity, CorporateActionOption36.mmSecuritiesQuantity, CorporateAction8.mmSecuritiesQuantity, CorporateActionOption45.mmSecuritiesQuantity, CorporateActionOption51.mmSecuritiesQuantity,
					CorporateActionOption56.mmSecuritiesQuantity, SecurityOption1.mmSecuritiesQuantity, CorporateActionOption103.mmSecuritiesQuantity, CorporateActionOption100.mmSecuritiesQuantity,
					CorporateActionOption101.mmSecuritiesQuantity, CorporateActionOption108.mmSecuritiesQuantity, CorporateActionOption107.mmSecuritiesQuantity, CorporateActionOption106.mmSecuritiesQuantity,
					CorporateActionOption118.mmSecuritiesQuantity, CorporateActionOption115.mmSecuritiesQuantity, CorporateActionOption114.mmSecuritiesQuantity, CorporateActionOption125.mmSecuritiesQuantity,
					CorporateActionOption123.mmSecuritiesQuantity, CorporateActionOption127.mmSecuritiesQuantity, CorporateActionOption130.mmSecuritiesQuantity, CorporateActionOption131.mmSecuritiesQuantityOrInstructedAmount,
					CorporateActionOption129.mmSecuritiesQuantity, CorporateActionOption134.mmSecuritiesQuantityOrInstructedAmount, CorporateActionOption135.mmSecuritiesQuantity, CorporateActionOption133.mmSecuritiesQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "The quantity of financial instruments that is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity conditionalQuantity;
	/**
	 * Minimum quantity of securities to be accepted (used in the framework of
	 * conditional privilege on election). In case of proration, if this minimum
	 * quantity is not reached then the instruction is void.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmConditionalQuantitySecuritiesProceeds
	 * SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#mmConditionalQuantity
	 * SecuritiesOption2.mmConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption7#mmConditionalQuantity
	 * SecuritiesOption7.mmConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#mmConditionalQuantity
	 * SecuritiesOption52.mmConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption54#mmConditionalQuantity
	 * SecuritiesOption54.mmConditionalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConditionalQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption2.mmConditionalQuantity, SecuritiesOption7.mmConditionalQuantity, SecuritiesOption52.mmConditionalQuantity, SecuritiesOption54.mmConditionalQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity overAndAboveNormalEnsuredEntitlementQuantity;
	/**
	 * Quantity instructed to be received over and above normal ensured
	 * entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOverAndAboveQuantitySecuritiesProceeds
	 * SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#mmOverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesOption2.mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption7#mmOverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesOption7.mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAboveNormalEnsuredEntitlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed to be received over and above normal ensured entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOverAndAboveNormalEnsuredEntitlementQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption2.mmOverAndAboveNormalEnsuredEntitlementQuantity, SecuritiesOption7.mmOverAndAboveNormalEnsuredEntitlementQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveNormalEnsuredEntitlementQuantity";
			definition = "Quantity instructed to be received over and above normal ensured entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity quantityToReceive;
	/**
	 * Quantity of the benefits that the account owner wants to receive, for
	 * example, as a result of dividend reinvestment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmExpectedQuantitySecuritiesProceeds
	 * SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice#mmQuantityToReceive
	 * InstructedOrQuantityToReceive1Choice.mmQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice#mmQuantityToReceive
	 * InstructedOrQuantityToReceive2Choice.mmQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive1Choice#mmQuantityToReceive
	 * StatusOrQuantityToReceive1Choice.mmQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice#mmQuantityToReceive
	 * StatusOrQuantityToReceive2Choice.mmQuantityToReceive}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantityToReceive = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InstructedOrQuantityToReceive1Choice.mmQuantityToReceive, InstructedOrQuantityToReceive2Choice.mmQuantityToReceive, StatusOrQuantityToReceive1Choice.mmQuantityToReceive,
					StatusOrQuantityToReceive2Choice.mmQuantityToReceive);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity statusQuantity;
	/**
	 * Quantity of securities that has been assigned the status indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmStatusRelatedSecuritiesProceeds
	 * SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive1Choice#mmStatusQuantity
	 * StatusOrQuantityToReceive1Choice.mmStatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice#mmStatusQuantity
	 * StatusOrQuantityToReceive2Choice.mmStatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmStatusQuantity
	 * CorporateActionOption116.mmStatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmStatusQuantity
	 * CorporateActionOption121.mmStatusQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities that has been assigned the status indicated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatusQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatusOrQuantityToReceive1Choice.mmStatusQuantity, StatusOrQuantityToReceive2Choice.mmStatusQuantity, CorporateActionOption116.mmStatusQuantity, CorporateActionOption121.mmStatusQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusQuantity";
			definition = "Quantity of securities that has been assigned the status indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected DateTimePeriod parallelTradingPeriod;
	/**
	 * Period during which both old and new equity may be traded simultaneously,
	 * eg, consolidation of equity or splitting of equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmParallelTradingProceedsDefinition
	 * DateTimePeriod.mmParallelTradingProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod4#mmParallelTradingPeriod
	 * CorporateActionPeriod4.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#mmParallelTradingPeriod
	 * CorporateActionPeriod9.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#mmParallelTradingPeriod
	 * CorporateActionPeriod5.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmParallelTradingPeriod
	 * CorporateActionPeriod7.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmParallelTradingPeriod
	 * CorporateActionPeriod2.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmParallelTradingPeriod
	 * CorporateActionPeriod11.mmParallelTradingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParallelTradingPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod4.mmParallelTradingPeriod, CorporateActionPeriod9.mmParallelTradingPeriod, CorporateActionPeriod5.mmParallelTradingPeriod,
					CorporateActionPeriod7.mmParallelTradingPeriod, CorporateActionPeriod2.mmParallelTradingPeriod, CorporateActionPeriod11.mmParallelTradingPeriod);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmParallelTradingProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected QuantityRatio additionalQuantityForSubscribedResultantSecurities;
	/**
	 * Quantity of additional intermediate securities/new equities awarded for a
	 * given quantity of securities derived from subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForResultantSecuritiesProceedsDefinition
	 * QuantityRatio.
	 * mmAdditionalQuantityForResultantSecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate6.mmAdditionalQuantityForSubscribedResultantSecurities
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate11.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate21#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate21.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate23#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate23.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate29.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate34.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate7.mmAdditionalQuantityForSubscribedResultantSecurities
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate13.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate17.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate19.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate28.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate33.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate2.mmAdditionalQuantityForSubscribedResultantSecurities
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecurityOption1.mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate48.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate49.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate58.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate65.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate69.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate72.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate77.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmAdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate75.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedResultantSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalQuantityForSubscribedResultantSecurities = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate6.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate11.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate21.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate23.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate29.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate34.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate7.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate13.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate17.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate19.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate28.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate33.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate2.mmAdditionalQuantityForSubscribedResultantSecurities, SecurityOption1.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate48.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate49.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate58.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate65.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate69.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate72.mmAdditionalQuantityForSubscribedResultantSecurities,
					CorporateActionRate77.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate75.mmAdditionalQuantityForSubscribedResultantSecurities);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
		}
	};
	protected QuantityRatio additionalQuantityForExistingSecurities;
	/**
	 * Quantity of additional securities for a given quantity of underlying
	 * securities where underlying securities are not exchanged or debited, eg,
	 * 1 for 1: 1 new equity credited for every 1 underlying equity = 2
	 * resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition
	 * QuantityRatio.
	 * mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate6.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate11.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate21#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate21.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate23#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate23.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate29.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate34.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate7.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate13.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate17.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate19.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate28.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate33.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate2.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmAdditionalQuantityForExistingSecurities
	 * SecurityOption1.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate48.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate49.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate58.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate65.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate69.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate72.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate77.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmAdditionalQuantityForExistingSecurities
	 * CorporateActionRate75.mmAdditionalQuantityForExistingSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForExistingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalQuantityForExistingSecurities = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate6.mmAdditionalQuantityForExistingSecurities, CorporateActionRate11.mmAdditionalQuantityForExistingSecurities,
					CorporateActionRate21.mmAdditionalQuantityForExistingSecurities, CorporateActionRate23.mmAdditionalQuantityForExistingSecurities, CorporateActionRate29.mmAdditionalQuantityForExistingSecurities,
					CorporateActionRate34.mmAdditionalQuantityForExistingSecurities, CorporateActionRate7.mmAdditionalQuantityForExistingSecurities, CorporateActionRate13.mmAdditionalQuantityForExistingSecurities,
					CorporateActionRate17.mmAdditionalQuantityForExistingSecurities, CorporateActionRate19.mmAdditionalQuantityForExistingSecurities, CorporateActionRate28.mmAdditionalQuantityForExistingSecurities,
					CorporateActionRate33.mmAdditionalQuantityForExistingSecurities, CorporateActionRate2.mmAdditionalQuantityForExistingSecurities, SecurityOption1.mmAdditionalQuantityForExistingSecurities,
					CorporateActionRate48.mmAdditionalQuantityForExistingSecurities, CorporateActionRate49.mmAdditionalQuantityForExistingSecurities, CorporateActionRate58.mmAdditionalQuantityForExistingSecurities,
					CorporateActionRate65.mmAdditionalQuantityForExistingSecurities, CorporateActionRate69.mmAdditionalQuantityForExistingSecurities, CorporateActionRate72.mmAdditionalQuantityForExistingSecurities,
					CorporateActionRate77.mmAdditionalQuantityForExistingSecurities, CorporateActionRate75.mmAdditionalQuantityForExistingSecurities);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
		}
	};
	protected QuantityRatio newToOld;
	/**
	 * Quantity of new securities for a given quantity of underlying securities,
	 * where the underlying securities will be exchanged or debited, eg, 2 for
	 * 1: 2 new equities credited for every 1 underlying equity debited = 2
	 * resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToOldProceedsDefinition
	 * QuantityRatio.mmNewToOldProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#mmNewToOld
	 * CorporateActionRate6.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#mmNewToOld
	 * CorporateActionRate11.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate21#mmNewToOld
	 * CorporateActionRate21.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate23#mmNewToOld
	 * CorporateActionRate23.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#mmNewToOld
	 * CorporateActionRate29.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#mmNewToOld
	 * CorporateActionRate34.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmNewToOld
	 * CorporateActionRate7.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmNewToOld
	 * CorporateActionRate13.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#mmNewToOld
	 * CorporateActionRate17.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#mmNewToOld
	 * CorporateActionRate19.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmNewToOld
	 * CorporateActionRate28.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmNewToOld
	 * CorporateActionRate33.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNewToOld
	 * CorporateActionRate2.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmNewToOld
	 * CorporateActionRate48.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmNewToOld
	 * CorporateActionRate49.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmNewToOld
	 * CorporateActionRate58.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmNewToOld
	 * CorporateActionRate65.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmNewToOld
	 * CorporateActionRate69.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmNewToOld
	 * CorporateActionRate72.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmNewToOld
	 * CorporateActionRate77.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmNewToOld
	 * CorporateActionRate75.mmNewToOld}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewToOld = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate6.mmNewToOld, CorporateActionRate11.mmNewToOld, CorporateActionRate21.mmNewToOld, CorporateActionRate23.mmNewToOld, CorporateActionRate29.mmNewToOld,
					CorporateActionRate34.mmNewToOld, CorporateActionRate7.mmNewToOld, CorporateActionRate13.mmNewToOld, CorporateActionRate17.mmNewToOld, CorporateActionRate19.mmNewToOld, CorporateActionRate28.mmNewToOld,
					CorporateActionRate33.mmNewToOld, CorporateActionRate2.mmNewToOld, CorporateActionRate48.mmNewToOld, CorporateActionRate49.mmNewToOld, CorporateActionRate58.mmNewToOld, CorporateActionRate65.mmNewToOld,
					CorporateActionRate69.mmNewToOld, CorporateActionRate72.mmNewToOld, CorporateActionRate77.mmNewToOld, CorporateActionRate75.mmNewToOld);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmNewToOldProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
		}
	};
	protected QuantityRatio newSecuritiesToUnderlyingSecurities;
	/**
	 * Quantity of new equities that will be derived by the exercise of a given
	 * quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToUnderlyingProceedsDefinition
	 * QuantityRatio.mmNewToUnderlyingProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#mmNewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate6.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#mmNewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate11.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmNewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate7.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmNewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate13.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate2.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecuritiesToUnderlyingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewSecuritiesToUnderlyingSecurities = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate6.mmNewSecuritiesToUnderlyingSecurities, CorporateActionRate11.mmNewSecuritiesToUnderlyingSecurities, CorporateActionRate7.mmNewSecuritiesToUnderlyingSecurities,
					CorporateActionRate13.mmNewSecuritiesToUnderlyingSecurities, CorporateActionRate2.mmNewSecuritiesToUnderlyingSecurities);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmNewToUnderlyingProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
		}
	};
	protected CurrencyAndAmount reinvestmentAmount;
	/**
	 * Amount of money reinvested in additional securities.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmReinvestmentAmount
	 * CorporateActionAmounts2.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmReinvestmentAmount
	 * CorporateActionAmounts5.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmReinvestmentAmount
	 * CorporateActionAmounts11.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmReinvestmentAmount
	 * CorporateActionAmounts12.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmReinvestmentAmount
	 * CorporateActionAmounts17.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmReinvestmentAmount
	 * CorporateActionAmounts20.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmReinvestmentAmount
	 * CorporateActionAmounts23.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmReinvestmentAmount
	 * CorporateActionAmounts24.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmReinvestmentAmount
	 * CorporateActionAmounts3.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmReinvestmentAmount
	 * CorporateActionAmounts6.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmReinvestmentAmount
	 * CorporateActionAmounts9.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmReinvestmentAmount
	 * CorporateActionAmounts13.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmReinvestmentAmount
	 * CorporateActionAmounts16.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmReinvestmentAmount
	 * CorporateActionAmounts19.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmReinvestmentAmount
	 * CorporateActionAmounts22.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmReinvestmentAmount
	 * CorporateActionAmounts25.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmReinvestmentAmount
	 * CorporateActionAmounts4.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmReinvestmentAmount
	 * CorporateActionAmounts7.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmReinvestmentAmount
	 * CorporateActionAmounts10.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmReinvestmentAmount
	 * CorporateActionAmounts14.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmReinvestmentAmount
	 * CorporateActionAmounts15.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmReinvestmentAmount
	 * CorporateActionAmounts18.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmReinvestmentAmount
	 * CorporateActionAmounts21.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmReinvestmentAmount
	 * CorporateActionAmounts26.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmReinvestmentAmount
	 * CorporateActionAmounts1.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmReinvestmentAmount
	 * CorporateActionAmounts29.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmReinvestmentAmount
	 * CorporateActionAmounts27.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmReinvestmentAmount
	 * CorporateActionAmounts28.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmReinvestmentAmount
	 * CorporateActionAmounts33.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmReinvestmentAmount
	 * CorporateActionAmounts32.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmReinvestmentAmount
	 * CorporateActionAmounts35.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmReinvestmentAmount
	 * CorporateActionAmounts37.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmReinvestmentAmount
	 * CorporateActionAmounts36.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmReinvestmentAmount
	 * CorporateActionAmounts38.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmReinvestmentAmount
	 * CorporateActionAmounts39.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmReinvestmentAmount
	 * CorporateActionAmounts41.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmReinvestmentAmount
	 * CorporateActionAmounts40.mmReinvestmentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money reinvested in additional securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReinvestmentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmReinvestmentAmount, CorporateActionAmounts5.mmReinvestmentAmount, CorporateActionAmounts11.mmReinvestmentAmount, CorporateActionAmounts12.mmReinvestmentAmount,
					CorporateActionAmounts17.mmReinvestmentAmount, CorporateActionAmounts20.mmReinvestmentAmount, CorporateActionAmounts23.mmReinvestmentAmount, CorporateActionAmounts24.mmReinvestmentAmount,
					CorporateActionAmounts3.mmReinvestmentAmount, CorporateActionAmounts6.mmReinvestmentAmount, CorporateActionAmounts9.mmReinvestmentAmount, CorporateActionAmounts13.mmReinvestmentAmount,
					CorporateActionAmounts16.mmReinvestmentAmount, CorporateActionAmounts19.mmReinvestmentAmount, CorporateActionAmounts22.mmReinvestmentAmount, CorporateActionAmounts25.mmReinvestmentAmount,
					CorporateActionAmounts4.mmReinvestmentAmount, CorporateActionAmounts7.mmReinvestmentAmount, CorporateActionAmounts10.mmReinvestmentAmount, CorporateActionAmounts14.mmReinvestmentAmount,
					CorporateActionAmounts15.mmReinvestmentAmount, CorporateActionAmounts18.mmReinvestmentAmount, CorporateActionAmounts21.mmReinvestmentAmount, CorporateActionAmounts26.mmReinvestmentAmount,
					CorporateActionAmounts1.mmReinvestmentAmount, CorporateActionAmounts29.mmReinvestmentAmount, CorporateActionAmounts27.mmReinvestmentAmount, CorporateActionAmounts28.mmReinvestmentAmount,
					CorporateActionAmounts33.mmReinvestmentAmount, CorporateActionAmounts32.mmReinvestmentAmount, CorporateActionAmounts35.mmReinvestmentAmount, CorporateActionAmounts37.mmReinvestmentAmount,
					CorporateActionAmounts36.mmReinvestmentAmount, CorporateActionAmounts38.mmReinvestmentAmount, CorporateActionAmounts39.mmReinvestmentAmount, CorporateActionAmounts41.mmReinvestmentAmount,
					CorporateActionAmounts40.mmReinvestmentAmount);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected IntermediateSecurityDistributionTypeCode intermediateSecuritiesDistributionType;
	/**
	 * Type of intermediate securities distribution, eg, stock dividend, reverse
	 * right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat2Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat2Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat6Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat6Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation39.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat7Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat7Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation47.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation50.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation62.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption10.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat4Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat4Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption15.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption20.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption32.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat1Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat1Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption35.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption44.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption52.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption55.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmIntermediateSecuritiesDistributionType
	 * CorporateAction3.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption3.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat3Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat3Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmIntermediateSecuritiesDistributionType
	 * CorporateAction4.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption17.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmIntermediateSecuritiesDistributionType
	 * CorporateAction5.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat8Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat8Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmIntermediateSecuritiesDistributionType
	 * CorporateAction6.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmIntermediateSecuritiesDistributionType
	 * CorporateAction7.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmIntermediateSecuritiesDistributionType
	 * CorporateAction8.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmIntermediateSecuritiesDistributionType
	 * CorporateAction10.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmIntermediateSecuritiesDistributionType
	 * CorporateAction11.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice#mmCode
	 * IntermediateSecurityDistributionType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice#mmProprietary
	 * IntermediateSecurityDistributionType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmIntermediateSecuritiesDistributionType
	 * CorporateAction2.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption1.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption100.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmIntermediateSecuritiesDistributionType
	 * CorporateAction12.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption108.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmIntermediateSecuritiesDistributionType
	 * CorporateAction17.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation79.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation83.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation82.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat13Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat13Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat14Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat14Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation89.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption115.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmIntermediateSecuritiesDistributionType
	 * CorporateAction31.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat16Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat16Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation98.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption125.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmIntermediateSecuritiesDistributionType
	 * CorporateAction40.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice#mmCode
	 * IntermediateSecuritiesDistributionTypeFormat17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice#mmProprietary
	 * IntermediateSecuritiesDistributionTypeFormat17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation111.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption129.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#mmIntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation118.
	 * mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmIntermediateSecuritiesDistributionType
	 * CorporateActionOption135.mmIntermediateSecuritiesDistributionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of intermediate securities distribution, eg, stock dividend, reverse right."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIntermediateSecuritiesDistributionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IntermediateSecuritiesDistributionTypeFormat2Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat2Choice.mmProprietary, IntermediateSecuritiesDistributionTypeFormat6Choice.mmCode,
					IntermediateSecuritiesDistributionTypeFormat6Choice.mmProprietary, CorporateActionGeneralInformation39.mmIntermediateSecuritiesDistributionType, IntermediateSecuritiesDistributionTypeFormat7Choice.mmCode,
					IntermediateSecuritiesDistributionTypeFormat7Choice.mmProprietary, CorporateActionGeneralInformation47.mmIntermediateSecuritiesDistributionType,
					CorporateActionGeneralInformation50.mmIntermediateSecuritiesDistributionType, CorporateActionGeneralInformation62.mmIntermediateSecuritiesDistributionType,
					CorporateActionOption10.mmIntermediateSecuritiesDistributionType, IntermediateSecuritiesDistributionTypeFormat4Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat4Choice.mmProprietary,
					CorporateActionOption15.mmIntermediateSecuritiesDistributionType, CorporateActionOption20.mmIntermediateSecuritiesDistributionType, CorporateActionOption32.mmIntermediateSecuritiesDistributionType,
					IntermediateSecuritiesDistributionTypeFormat1Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat1Choice.mmProprietary, IntermediateSecuritiesDistributionTypeFormat5Choice.mmCode,
					IntermediateSecuritiesDistributionTypeFormat5Choice.mmProprietary, IntermediateSecuritiesDistributionTypeFormat9Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat9Choice.mmProprietary,
					CorporateActionOption35.mmIntermediateSecuritiesDistributionType, IntermediateSecuritiesDistributionTypeFormat10Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat10Choice.mmProprietary,
					CorporateActionOption44.mmIntermediateSecuritiesDistributionType, CorporateActionOption52.mmIntermediateSecuritiesDistributionType, CorporateActionOption55.mmIntermediateSecuritiesDistributionType,
					CorporateAction3.mmIntermediateSecuritiesDistributionType, CorporateActionOption3.mmIntermediateSecuritiesDistributionType, IntermediateSecuritiesDistributionTypeFormat3Choice.mmCode,
					IntermediateSecuritiesDistributionTypeFormat3Choice.mmProprietary, CorporateAction4.mmIntermediateSecuritiesDistributionType, CorporateActionOption17.mmIntermediateSecuritiesDistributionType,
					CorporateAction5.mmIntermediateSecuritiesDistributionType, IntermediateSecuritiesDistributionTypeFormat8Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat8Choice.mmProprietary,
					CorporateAction6.mmIntermediateSecuritiesDistributionType, CorporateAction7.mmIntermediateSecuritiesDistributionType, CorporateAction8.mmIntermediateSecuritiesDistributionType,
					CorporateAction10.mmIntermediateSecuritiesDistributionType, CorporateAction11.mmIntermediateSecuritiesDistributionType, IntermediateSecurityDistributionType1FormatChoice.mmCode,
					IntermediateSecurityDistributionType1FormatChoice.mmProprietary, CorporateAction2.mmIntermediateSecuritiesDistributionType, CorporateActionOption1.mmIntermediateSecuritiesDistributionType,
					CorporateActionOption100.mmIntermediateSecuritiesDistributionType, CorporateAction12.mmIntermediateSecuritiesDistributionType, CorporateActionOption108.mmIntermediateSecuritiesDistributionType,
					CorporateAction17.mmIntermediateSecuritiesDistributionType, CorporateActionGeneralInformation79.mmIntermediateSecuritiesDistributionType, CorporateActionGeneralInformation83.mmIntermediateSecuritiesDistributionType,
					CorporateActionGeneralInformation82.mmIntermediateSecuritiesDistributionType, IntermediateSecuritiesDistributionTypeFormat13Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat13Choice.mmProprietary,
					IntermediateSecuritiesDistributionTypeFormat14Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat14Choice.mmProprietary, CorporateActionGeneralInformation89.mmIntermediateSecuritiesDistributionType,
					CorporateActionOption115.mmIntermediateSecuritiesDistributionType, CorporateAction31.mmIntermediateSecuritiesDistributionType, IntermediateSecuritiesDistributionTypeFormat16Choice.mmCode,
					IntermediateSecuritiesDistributionTypeFormat16Choice.mmProprietary, IntermediateSecuritiesDistributionTypeFormat15Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat15Choice.mmProprietary,
					CorporateActionGeneralInformation98.mmIntermediateSecuritiesDistributionType, CorporateActionOption125.mmIntermediateSecuritiesDistributionType, CorporateAction40.mmIntermediateSecuritiesDistributionType,
					IntermediateSecuritiesDistributionTypeFormat18Choice.mmCode, IntermediateSecuritiesDistributionTypeFormat18Choice.mmProprietary, IntermediateSecuritiesDistributionTypeFormat17Choice.mmCode,
					IntermediateSecuritiesDistributionTypeFormat17Choice.mmProprietary, CorporateActionGeneralInformation111.mmIntermediateSecuritiesDistributionType, CorporateActionOption129.mmIntermediateSecuritiesDistributionType,
					CorporateActionGeneralInformation118.mmIntermediateSecuritiesDistributionType, CorporateActionOption135.mmIntermediateSecuritiesDistributionType);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediate securities distribution, eg, stock dividend, reverse right.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
		}
	};
	protected SecuritiesQuantity boardLotSecuritiesQuantity;
	/**
	 * Quantity of equity that makes up a board lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBoardLotSecuritiesProceeds
	 * SecuritiesQuantity.mmBoardLotSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#mmNewBoardLotQuantity
	 * SecuritiesOption1.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#mmNewBoardLotQuantity
	 * SecuritiesOption9.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#mmNewBoardLotQuantity
	 * SecuritiesOption15.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#mmNewBoardLotQuantity
	 * SecuritiesOption16.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmNewBoardLotQuantity
	 * SecuritiesOption23.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmNewBoardLotQuantity
	 * SecuritiesOption28.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmNewBoardLotQuantity
	 * CorporateActionQuantity1.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmNewBoardLotQuantity
	 * CorporateActionQuantity2.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmNewBoardLotQuantity
	 * CorporateActionQuantity3.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmNewBoardLotQuantity
	 * CorporateActionQuantity4.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmNewBoardLotQuantity
	 * CorporateActionQuantity5.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmNewBoardLotQuantity
	 * CorporateActionQuantity6.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewBoardLotSecuritiesQuantity
	 * CorporateAction2.mmNewBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmNewBoardLotSecuritiesQuantity
	 * SecurityOption1.mmNewBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmNewBoardLotQuantity
	 * SecuritiesOption51.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmNewBoardLotQuantity
	 * CorporateActionQuantity7.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#mmNewBoardLotQuantity
	 * SecuritiesOption56.mmNewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#mmNewBoardLotQuantity
	 * CorporateActionQuantity8.mmNewBoardLotQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLotSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of equity that makes up a board lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBoardLotSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption1.mmNewBoardLotQuantity, SecuritiesOption9.mmNewBoardLotQuantity, SecuritiesOption15.mmNewBoardLotQuantity, SecuritiesOption16.mmNewBoardLotQuantity,
					SecuritiesOption23.mmNewBoardLotQuantity, SecuritiesOption28.mmNewBoardLotQuantity, CorporateActionQuantity1.mmNewBoardLotQuantity, CorporateActionQuantity2.mmNewBoardLotQuantity,
					CorporateActionQuantity3.mmNewBoardLotQuantity, CorporateActionQuantity4.mmNewBoardLotQuantity, CorporateActionQuantity5.mmNewBoardLotQuantity, CorporateActionQuantity6.mmNewBoardLotQuantity,
					CorporateAction2.mmNewBoardLotSecuritiesQuantity, SecurityOption1.mmNewBoardLotSecuritiesQuantity, SecuritiesOption51.mmNewBoardLotQuantity, CorporateActionQuantity7.mmNewBoardLotQuantity,
					SecuritiesOption56.mmNewBoardLotQuantity, CorporateActionQuantity8.mmNewBoardLotQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesQuantity";
			definition = "Quantity of equity that makes up a board lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmBoardLotSecuritiesProceeds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity newDenominationSecuritiesQuantity;
	/**
	 * New denomination of the financial instrument following, eg, an increase
	 * or decrease in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNewDenominationSecuritiesProceeds
	 * SecuritiesQuantity.mmNewDenominationSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#mmNewDenominationQuantity
	 * SecuritiesOption1.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#mmNewDenominationQuantity
	 * SecuritiesOption9.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#mmNewDenominationQuantity
	 * SecuritiesOption15.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#mmNewDenominationQuantity
	 * SecuritiesOption16.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmNewDenominationQuantity
	 * SecuritiesOption23.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmNewDenominationQuantity
	 * SecuritiesOption28.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmNewDenominationQuantity
	 * CorporateActionQuantity1.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmNewDenominationQuantity
	 * CorporateActionQuantity2.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmNewDenominationQuantity
	 * CorporateActionQuantity3.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmNewDenominationQuantity
	 * CorporateActionQuantity4.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmNewDenominationQuantity
	 * CorporateActionQuantity5.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmNewDenominationQuantity
	 * CorporateActionQuantity6.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewDenominationSecuritiesQuantity
	 * CorporateAction2.mmNewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmNewDenominationSecuritiesQuantity
	 * SecurityOption1.mmNewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmNewDenominationQuantity
	 * SecuritiesOption51.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmNewDenominationQuantity
	 * CorporateActionQuantity7.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#mmNewDenominationQuantity
	 * SecuritiesOption56.mmNewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#mmNewDenominationQuantity
	 * CorporateActionQuantity8.mmNewDenominationQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New denomination of the financial instrument following, eg, an increase or decrease in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewDenominationSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption1.mmNewDenominationQuantity, SecuritiesOption9.mmNewDenominationQuantity, SecuritiesOption15.mmNewDenominationQuantity, SecuritiesOption16.mmNewDenominationQuantity,
					SecuritiesOption23.mmNewDenominationQuantity, SecuritiesOption28.mmNewDenominationQuantity, CorporateActionQuantity1.mmNewDenominationQuantity, CorporateActionQuantity2.mmNewDenominationQuantity,
					CorporateActionQuantity3.mmNewDenominationQuantity, CorporateActionQuantity4.mmNewDenominationQuantity, CorporateActionQuantity5.mmNewDenominationQuantity, CorporateActionQuantity6.mmNewDenominationQuantity,
					CorporateAction2.mmNewDenominationSecuritiesQuantity, SecurityOption1.mmNewDenominationSecuritiesQuantity, SecuritiesOption51.mmNewDenominationQuantity, CorporateActionQuantity7.mmNewDenominationQuantity,
					SecuritiesOption56.mmNewDenominationQuantity, CorporateActionQuantity8.mmNewDenominationQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesQuantity";
			definition = "New denomination of the financial instrument following, eg, an increase or decrease in nominal value.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmNewDenominationSecuritiesProceeds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected QuantityRatio intermediateSecuritiesToUnderlyingRatio;
	/**
	 * Quantity of intermediate securities awarded for a given quantity of
	 * underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmIntermediateSecuritiesProceedsDefinition
	 * QuantityRatio.mmIntermediateSecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes3.mmIntermediateSecuritiesToUnderlyingRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes12.mmIntermediateSecuritiesToUnderlyingRatio
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes17.mmIntermediateSecuritiesToUnderlyingRatio
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes25.mmIntermediateSecuritiesToUnderlyingRatio
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes46.mmIntermediateSecuritiesToUnderlyingRatio
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes47.mmIntermediateSecuritiesToUnderlyingRatio
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes68.mmIntermediateSecuritiesToUnderlyingRatio
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmIntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes73.mmIntermediateSecuritiesToUnderlyingRatio
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesToUnderlyingRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of intermediate securities awarded for a given quantity of underlying security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIntermediateSecuritiesToUnderlyingRatio = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes3.mmIntermediateSecuritiesToUnderlyingRatio, FinancialInstrumentAttributes12.mmIntermediateSecuritiesToUnderlyingRatio,
					FinancialInstrumentAttributes17.mmIntermediateSecuritiesToUnderlyingRatio, FinancialInstrumentAttributes25.mmIntermediateSecuritiesToUnderlyingRatio,
					FinancialInstrumentAttributes46.mmIntermediateSecuritiesToUnderlyingRatio, FinancialInstrumentAttributes47.mmIntermediateSecuritiesToUnderlyingRatio,
					FinancialInstrumentAttributes68.mmIntermediateSecuritiesToUnderlyingRatio, FinancialInstrumentAttributes73.mmIntermediateSecuritiesToUnderlyingRatio);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesToUnderlyingRatio";
			definition = "Quantity of intermediate securities awarded for a given quantity of underlying security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmIntermediateSecuritiesProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
		}
	};
	protected PercentageRate reinvestmentDiscountToMarket;
	/**
	 * Rate of discount for securities purchased through a reinvestment scheme
	 * as compared to the current market price of security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate3.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate14.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate16.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate24.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate27.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate32.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate35.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate41.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmReinvestmentDiscountToMarket
	 * CorporateActionRate1.mmReinvestmentDiscountToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate43.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate56.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate66.mmReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmReinvestmentDiscountRateToMarket
	 * CorporateActionRate78.mmReinvestmentDiscountRateToMarket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDiscountToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReinvestmentDiscountToMarket = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate3.mmReinvestmentDiscountRateToMarket, CorporateActionRate14.mmReinvestmentDiscountRateToMarket, CorporateActionRate16.mmReinvestmentDiscountRateToMarket,
					CorporateActionRate24.mmReinvestmentDiscountRateToMarket, CorporateActionRate27.mmReinvestmentDiscountRateToMarket, CorporateActionRate32.mmReinvestmentDiscountRateToMarket,
					CorporateActionRate35.mmReinvestmentDiscountRateToMarket, CorporateActionRate41.mmReinvestmentDiscountRateToMarket, CorporateActionRate1.mmReinvestmentDiscountToMarket,
					CorporateActionRate43.mmReinvestmentDiscountRateToMarket, CorporateActionRate56.mmReinvestmentDiscountRateToMarket, CorporateActionRate66.mmReinvestmentDiscountRateToMarket,
					CorporateActionRate78.mmReinvestmentDiscountRateToMarket);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDiscountToMarket";
			definition = "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ISODateTime redemptionDate;
	/**
	 * Date on which the securities will be redeemed (early) for payment of
	 * principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRedemptionDate
	 * CorporateActionDate2.mmRedemptionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the securities will be redeemed (early) for payment of principal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRedemptionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmRedemptionDate);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionDate";
			definition = "Date on which the securities will be redeemed (early) for payment of principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriod assentedLinePeriod;
	/**
	 * Period during which the assented line is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssentedLinePeriodProceedsDefinition
	 * DateTimePeriod.mmAssentedLinePeriodProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmAssentedLinePeriod
	 * CorporateActionPeriod2.mmAssentedLinePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssentedLinePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the assented line is available."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssentedLinePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod2.mmAssentedLinePeriod);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriod";
			definition = "Period during which the assented line is available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmAssentedLinePeriodProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod sellThruIssuerPeriod;
	/**
	 * Period (last day included) during which an account owner can surrender or
	 * sell securities to the issuer and receive the sale proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSellThruIssuerProceedsDefinition
	 * DateTimePeriod.mmSellThruIssuerProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmSellThruIssuerPeriod
	 * CorporateActionPeriod2.mmSellThruIssuerPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellThruIssuerPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSellThruIssuerPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod2.mmSellThruIssuerPeriod);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerPeriod";
			definition = "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmSellThruIssuerProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected ShareRankingCode shareRanking;
	/**
	 * Specifies whether the shares are ranking for dividend or pari passu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShareRankingCode
	 * ShareRankingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmShareRanking
	 * SecurityOption1.mmShareRanking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareRanking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the shares are ranking for dividend or pari passu."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmShareRanking = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityOption1.mmShareRanking);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShareRanking";
			definition = "Specifies whether the shares are ranking for dividend or pari passu.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShareRankingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesProceedsDefinition";
				definition = "The definition of the securities proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a  bonus rights issue where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.mmAssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.mmSellThruIssuerProceedsDefinition, com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.mmBoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.mmNewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmNewToOldProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmNewToUnderlyingProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmIntermediateSecuritiesProceedsDefinition);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(SecuritiesProceedsDefinition.mmSecuritiesQuantity, SecuritiesProceedsDefinition.mmConditionalQuantity, SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity,
						SecuritiesProceedsDefinition.mmQuantityToReceive, SecuritiesProceedsDefinition.mmStatusQuantity, SecuritiesProceedsDefinition.mmParallelTradingPeriod,
						SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities, SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities, SecuritiesProceedsDefinition.mmNewToOld,
						SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities, SecuritiesProceedsDefinition.mmReinvestmentAmount, SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType,
						SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity, SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity, SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio,
						SecuritiesProceedsDefinition.mmReinvestmentDiscountToMarket, SecuritiesProceedsDefinition.mmRedemptionDate, SecuritiesProceedsDefinition.mmAssentedLinePeriod, SecuritiesProceedsDefinition.mmSellThruIssuerPeriod,
						SecuritiesProceedsDefinition.mmShareRanking);
				derivationComponent_lazy = () -> Arrays.asList(IntermediateSecuritiesDistributionTypeFormat2Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat6Choice.mmObject(),
						IntermediateSecuritiesDistributionTypeFormat7Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat4Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat1Choice.mmObject(),
						IntermediateSecuritiesDistributionTypeFormat5Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat9Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat10Choice.mmObject(),
						IntermediateSecuritiesDistributionTypeFormat3Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat8Choice.mmObject(), IntermediateSecurityDistributionType1FormatChoice.mmObject(),
						IntermediateSecuritiesDistributionTypeFormat13Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat14Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat16Choice.mmObject(),
						IntermediateSecuritiesDistributionTypeFormat15Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat18Choice.mmObject(), IntermediateSecuritiesDistributionTypeFormat17Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(com.tools20022.repository.entity.SecuritiesQuantity securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public SecuritiesQuantity getConditionalQuantity() {
		return conditionalQuantity;
	}

	public void setConditionalQuantity(com.tools20022.repository.entity.SecuritiesQuantity conditionalQuantity) {
		this.conditionalQuantity = conditionalQuantity;
	}

	public SecuritiesQuantity getOverAndAboveNormalEnsuredEntitlementQuantity() {
		return overAndAboveNormalEnsuredEntitlementQuantity;
	}

	public void setOverAndAboveNormalEnsuredEntitlementQuantity(com.tools20022.repository.entity.SecuritiesQuantity overAndAboveNormalEnsuredEntitlementQuantity) {
		this.overAndAboveNormalEnsuredEntitlementQuantity = overAndAboveNormalEnsuredEntitlementQuantity;
	}

	public SecuritiesQuantity getQuantityToReceive() {
		return quantityToReceive;
	}

	public void setQuantityToReceive(com.tools20022.repository.entity.SecuritiesQuantity quantityToReceive) {
		this.quantityToReceive = quantityToReceive;
	}

	public SecuritiesQuantity getStatusQuantity() {
		return statusQuantity;
	}

	public void setStatusQuantity(com.tools20022.repository.entity.SecuritiesQuantity statusQuantity) {
		this.statusQuantity = statusQuantity;
	}

	public DateTimePeriod getParallelTradingPeriod() {
		return parallelTradingPeriod;
	}

	public void setParallelTradingPeriod(com.tools20022.repository.entity.DateTimePeriod parallelTradingPeriod) {
		this.parallelTradingPeriod = parallelTradingPeriod;
	}

	public QuantityRatio getAdditionalQuantityForSubscribedResultantSecurities() {
		return additionalQuantityForSubscribedResultantSecurities;
	}

	public void setAdditionalQuantityForSubscribedResultantSecurities(com.tools20022.repository.entity.QuantityRatio additionalQuantityForSubscribedResultantSecurities) {
		this.additionalQuantityForSubscribedResultantSecurities = additionalQuantityForSubscribedResultantSecurities;
	}

	public QuantityRatio getAdditionalQuantityForExistingSecurities() {
		return additionalQuantityForExistingSecurities;
	}

	public void setAdditionalQuantityForExistingSecurities(com.tools20022.repository.entity.QuantityRatio additionalQuantityForExistingSecurities) {
		this.additionalQuantityForExistingSecurities = additionalQuantityForExistingSecurities;
	}

	public QuantityRatio getNewToOld() {
		return newToOld;
	}

	public void setNewToOld(com.tools20022.repository.entity.QuantityRatio newToOld) {
		this.newToOld = newToOld;
	}

	public QuantityRatio getNewSecuritiesToUnderlyingSecurities() {
		return newSecuritiesToUnderlyingSecurities;
	}

	public void setNewSecuritiesToUnderlyingSecurities(com.tools20022.repository.entity.QuantityRatio newSecuritiesToUnderlyingSecurities) {
		this.newSecuritiesToUnderlyingSecurities = newSecuritiesToUnderlyingSecurities;
	}

	public CurrencyAndAmount getReinvestmentAmount() {
		return reinvestmentAmount;
	}

	public void setReinvestmentAmount(CurrencyAndAmount reinvestmentAmount) {
		this.reinvestmentAmount = reinvestmentAmount;
	}

	public IntermediateSecurityDistributionTypeCode getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType;
	}

	public void setIntermediateSecuritiesDistributionType(IntermediateSecurityDistributionTypeCode intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
	}

	public SecuritiesQuantity getBoardLotSecuritiesQuantity() {
		return boardLotSecuritiesQuantity;
	}

	public void setBoardLotSecuritiesQuantity(com.tools20022.repository.entity.SecuritiesQuantity boardLotSecuritiesQuantity) {
		this.boardLotSecuritiesQuantity = boardLotSecuritiesQuantity;
	}

	public SecuritiesQuantity getNewDenominationSecuritiesQuantity() {
		return newDenominationSecuritiesQuantity;
	}

	public void setNewDenominationSecuritiesQuantity(com.tools20022.repository.entity.SecuritiesQuantity newDenominationSecuritiesQuantity) {
		this.newDenominationSecuritiesQuantity = newDenominationSecuritiesQuantity;
	}

	public QuantityRatio getIntermediateSecuritiesToUnderlyingRatio() {
		return intermediateSecuritiesToUnderlyingRatio;
	}

	public void setIntermediateSecuritiesToUnderlyingRatio(com.tools20022.repository.entity.QuantityRatio intermediateSecuritiesToUnderlyingRatio) {
		this.intermediateSecuritiesToUnderlyingRatio = intermediateSecuritiesToUnderlyingRatio;
	}

	public PercentageRate getReinvestmentDiscountToMarket() {
		return reinvestmentDiscountToMarket;
	}

	public void setReinvestmentDiscountToMarket(PercentageRate reinvestmentDiscountToMarket) {
		this.reinvestmentDiscountToMarket = reinvestmentDiscountToMarket;
	}

	public ISODateTime getRedemptionDate() {
		return redemptionDate;
	}

	public void setRedemptionDate(ISODateTime redemptionDate) {
		this.redemptionDate = redemptionDate;
	}

	public DateTimePeriod getAssentedLinePeriod() {
		return assentedLinePeriod;
	}

	public void setAssentedLinePeriod(com.tools20022.repository.entity.DateTimePeriod assentedLinePeriod) {
		this.assentedLinePeriod = assentedLinePeriod;
	}

	public DateTimePeriod getSellThruIssuerPeriod() {
		return sellThruIssuerPeriod;
	}

	public void setSellThruIssuerPeriod(com.tools20022.repository.entity.DateTimePeriod sellThruIssuerPeriod) {
		this.sellThruIssuerPeriod = sellThruIssuerPeriod;
	}

	public ShareRankingCode getShareRanking() {
		return shareRanking;
	}

	public void setShareRanking(ShareRankingCode shareRanking) {
		this.shareRanking = shareRanking;
	}
}