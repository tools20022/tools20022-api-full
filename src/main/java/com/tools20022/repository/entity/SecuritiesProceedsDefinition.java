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
import com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode;
import com.tools20022.repository.codeset.ShareRankingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ProceedsDefinition;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SecuritiesQuantity
 * SecuritiesProceedsDefinition.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ConditionalQuantity
 * SecuritiesProceedsDefinition.ConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#OverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#QuantityToReceive
 * SecuritiesProceedsDefinition.QuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#StatusQuantity
 * SecuritiesProceedsDefinition.StatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ParallelTradingPeriod
 * SecuritiesProceedsDefinition.ParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForSubscribedResultantSecurities
 * SecuritiesProceedsDefinition.
 * AdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForExistingSecurities
 * SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewToOld
 * SecuritiesProceedsDefinition.NewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewSecuritiesToUnderlyingSecurities
 * SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ReinvestmentAmount
 * SecuritiesProceedsDefinition.ReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#IntermediateSecuritiesDistributionType
 * SecuritiesProceedsDefinition.IntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#BoardLotSecuritiesQuantity
 * SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewDenominationSecuritiesQuantity
 * SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#IntermediateSecuritiesToUnderlyingRatio
 * SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ReinvestmentDiscountToMarket
 * SecuritiesProceedsDefinition.ReinvestmentDiscountToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#RedemptionDate
 * SecuritiesProceedsDefinition.RedemptionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AssentedLinePeriod
 * SecuritiesProceedsDefinition.AssentedLinePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SellThruIssuerPeriod
 * SecuritiesProceedsDefinition.SellThruIssuerPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ShareRanking
 * SecuritiesProceedsDefinition.ShareRanking}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ParallelTradingProceedsDefinition
 * DateTimePeriod.ParallelTradingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssentedLinePeriodProceedsDefinition
 * DateTimePeriod.AssentedLinePeriodProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SellThruIssuerProceedsDefinition
 * DateTimePeriod.SellThruIssuerProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesProceedsDefinition
 * SecuritiesQuantity.SecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ConditionalQuantitySecuritiesProceeds
 * SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#OverAndAboveQuantitySecuritiesProceeds
 * SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ExpectedQuantitySecuritiesProceeds
 * SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#StatusRelatedSecuritiesProceeds
 * SecuritiesQuantity.StatusRelatedSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BoardLotSecuritiesProceeds
 * SecuritiesQuantity.BoardLotSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NewDenominationSecuritiesProceeds
 * SecuritiesQuantity.NewDenominationSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForResultantSecuritiesProceedsDefinition
 * QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForSubscribedSecuritiesProceedsDefinition
 * QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToOldProceedsDefinition
 * QuantityRatio.NewToOldProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToUnderlyingProceedsDefinition
 * QuantityRatio.NewToUnderlyingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#IntermediateSecuritiesProceedsDefinition
 * QuantityRatio.IntermediateSecuritiesProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
 * ProceedsDefinition}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * The quantity of financial instruments that is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesProceedsDefinition
	 * SecuritiesQuantity.SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#SecuritiesQuantity
	 * CorporateActionOption5.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#SecuritiesQuantity
	 * CorporateActionOption13.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#SecuritiesQuantity
	 * CorporateActionOption25.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#SecuritiesQuantity
	 * CorporateActionOption30.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#SecuritiesQuantity
	 * CorporateActionOption38.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#SecuritiesQuantity
	 * CorporateActionOption47.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#SecuritiesQuantity
	 * CorporateActionOption57.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#SecuritiesQuantity
	 * CorporateActionOption58.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#SecuritiesQuantity
	 * CorporateActionOption10.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#SecuritiesQuantity
	 * CorporateActionOption15.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#SecuritiesQuantity
	 * CorporateActionOption20.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#SecuritiesQuantity
	 * CorporateActionOption32.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#SecuritiesQuantity
	 * CorporateActionOption35.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#SecuritiesQuantity
	 * CorporateActionOption44.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#SecuritiesQuantity
	 * CorporateActionOption52.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#SecuritiesQuantity
	 * CorporateActionOption55.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#SecuritiesQuantity
	 * CorporateActionOption3.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#SecuritiesQuantity
	 * CorporateActionOption17.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#SecuritiesQuantity
	 * CorporateActionOption19.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#SecuritiesQuantity
	 * CorporateActionOption34.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#SecuritiesQuantity
	 * CorporateAction7.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#SecuritiesQuantity
	 * CorporateActionOption36.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#SecuritiesQuantity
	 * CorporateAction8.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#SecuritiesQuantity
	 * CorporateActionOption45.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#SecuritiesQuantity
	 * CorporateActionOption51.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#SecuritiesQuantity
	 * CorporateActionOption56.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#SecuritiesQuantity
	 * SecurityOption1.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#SecuritiesQuantity
	 * CorporateActionOption103.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#SecuritiesQuantity
	 * CorporateActionOption100.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#SecuritiesQuantity
	 * CorporateActionOption101.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#SecuritiesQuantity
	 * CorporateActionOption108.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#SecuritiesQuantity
	 * CorporateActionOption107.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#SecuritiesQuantity
	 * CorporateActionOption106.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#SecuritiesQuantity
	 * CorporateActionOption118.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#SecuritiesQuantity
	 * CorporateActionOption115.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#SecuritiesQuantity
	 * CorporateActionOption114.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#SecuritiesQuantity
	 * CorporateActionOption125.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#SecuritiesQuantity
	 * CorporateActionOption123.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#SecuritiesQuantity
	 * CorporateActionOption127.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#SecuritiesQuantity
	 * CorporateActionOption130.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#SecuritiesQuantityOrInstructedAmount
	 * CorporateActionOption131.SecuritiesQuantityOrInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#SecuritiesQuantity
	 * CorporateActionOption129.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#SecuritiesQuantityOrInstructedAmount
	 * CorporateActionOption134.SecuritiesQuantityOrInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#SecuritiesQuantity
	 * CorporateActionOption135.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#SecuritiesQuantity
	 * CorporateActionOption133.SecuritiesQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption13.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption25.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption30.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption38.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption47.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption57.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption58.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption10.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption15.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption20.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption32.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption35.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption44.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption52.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption55.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption3.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption17.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption19.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption34.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction7.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption36.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction8.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption45.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption51.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption56.SecuritiesQuantity, com.tools20022.repository.msg.SecurityOption1.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption103.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption100.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption101.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption108.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption107.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption106.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption118.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption115.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption114.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption125.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption123.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption127.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionOption130.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption131.SecuritiesQuantityOrInstructedAmount,
					com.tools20022.repository.msg.CorporateActionOption129.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption134.SecuritiesQuantityOrInstructedAmount,
					com.tools20022.repository.msg.CorporateActionOption135.SecuritiesQuantity, com.tools20022.repository.msg.CorporateActionOption133.SecuritiesQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "The quantity of financial instruments that is posted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ConditionalQuantitySecuritiesProceeds
	 * SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#ConditionalQuantity
	 * SecuritiesOption2.ConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption7#ConditionalQuantity
	 * SecuritiesOption7.ConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#ConditionalQuantity
	 * SecuritiesOption52.ConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption54#ConditionalQuantity
	 * SecuritiesOption54.ConditionalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd ConditionalQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption2.ConditionalQuantity, com.tools20022.repository.msg.SecuritiesOption7.ConditionalQuantity,
					com.tools20022.repository.msg.SecuritiesOption52.ConditionalQuantity, com.tools20022.repository.msg.SecuritiesOption54.ConditionalQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity instructed to be received over and above normal ensured
	 * entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#OverAndAboveQuantitySecuritiesProceeds
	 * SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#OverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesOption2.OverAndAboveNormalEnsuredEntitlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption7#OverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesOption7.OverAndAboveNormalEnsuredEntitlementQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd OverAndAboveNormalEnsuredEntitlementQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption2.OverAndAboveNormalEnsuredEntitlementQuantity, com.tools20022.repository.msg.SecuritiesOption7.OverAndAboveNormalEnsuredEntitlementQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveNormalEnsuredEntitlementQuantity";
			definition = "Quantity instructed to be received over and above normal ensured entitlement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of the benefits that the account owner wants to receive, for
	 * example, as a result of dividend reinvestment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ExpectedQuantitySecuritiesProceeds
	 * SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice#QuantityToReceive
	 * InstructedOrQuantityToReceive1Choice.QuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice#QuantityToReceive
	 * InstructedOrQuantityToReceive2Choice.QuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive1Choice#QuantityToReceive
	 * StatusOrQuantityToReceive1Choice.QuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice#QuantityToReceive
	 * StatusOrQuantityToReceive2Choice.QuantityToReceive}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd QuantityToReceive = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice.QuantityToReceive, com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice.QuantityToReceive,
					com.tools20022.repository.choice.StatusOrQuantityToReceive1Choice.QuantityToReceive, com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice.QuantityToReceive);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of securities that has been assigned the status indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#StatusRelatedSecuritiesProceeds
	 * SecuritiesQuantity.StatusRelatedSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive1Choice#StatusQuantity
	 * StatusOrQuantityToReceive1Choice.StatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice#StatusQuantity
	 * StatusOrQuantityToReceive2Choice.StatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#StatusQuantity
	 * CorporateActionOption116.StatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#StatusQuantity
	 * CorporateActionOption121.StatusQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd StatusQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.StatusOrQuantityToReceive1Choice.StatusQuantity, com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice.StatusQuantity,
					com.tools20022.repository.msg.CorporateActionOption116.StatusQuantity, com.tools20022.repository.msg.CorporateActionOption121.StatusQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusQuantity";
			definition = "Quantity of securities that has been assigned the status indicated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which both old and new equity may be traded simultaneously,
	 * eg, consolidation of equity or splitting of equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ParallelTradingProceedsDefinition
	 * DateTimePeriod.ParallelTradingProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod4#ParallelTradingPeriod
	 * CorporateActionPeriod4.ParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#ParallelTradingPeriod
	 * CorporateActionPeriod9.ParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#ParallelTradingPeriod
	 * CorporateActionPeriod5.ParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#ParallelTradingPeriod
	 * CorporateActionPeriod7.ParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#ParallelTradingPeriod
	 * CorporateActionPeriod2.ParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#ParallelTradingPeriod
	 * CorporateActionPeriod11.ParallelTradingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd ParallelTradingPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod4.ParallelTradingPeriod, com.tools20022.repository.msg.CorporateActionPeriod9.ParallelTradingPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod5.ParallelTradingPeriod, com.tools20022.repository.msg.CorporateActionPeriod7.ParallelTradingPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod2.ParallelTradingPeriod, com.tools20022.repository.msg.CorporateActionPeriod11.ParallelTradingPeriod);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of additional intermediate securities/new equities awarded for a
	 * given quantity of securities derived from subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForResultantSecuritiesProceedsDefinition
	 * QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate6.AdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate11.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate21#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate21.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate23#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate23.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate29.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate34.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate7.AdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate13.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate17.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate19.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate28.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate33.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate2.AdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#AdditionalQuantityForSubscribedResultantSecurities
	 * SecurityOption1.AdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate48.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate49.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate58.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate65.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate69.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate72.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate77.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#AdditionalQuantityForSubscribedResultantSecurities
	 * CorporateActionRate75.AdditionalQuantityForSubscribedResultantSecurities}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd AdditionalQuantityForSubscribedResultantSecurities = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate6.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate11.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate21.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate23.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate29.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate34.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate7.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate13.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate17.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate19.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate28.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate33.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate2.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.SecurityOption1.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate48.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate49.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate58.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate65.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate69.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate72.AdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate77.AdditionalQuantityForSubscribedResultantSecurities,
					com.tools20022.repository.msg.CorporateActionRate75.AdditionalQuantityForSubscribedResultantSecurities);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForSubscribedSecuritiesProceedsDefinition
	 * QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate6.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate11.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate21#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate21.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate23#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate23.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate29.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate34.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate7.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate13.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate17.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate19.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate28.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate33.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate2.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#AdditionalQuantityForExistingSecurities
	 * SecurityOption1.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate48.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate49.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate58.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate65.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate69.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate72.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate77.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#AdditionalQuantityForExistingSecurities
	 * CorporateActionRate75.AdditionalQuantityForExistingSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd AdditionalQuantityForExistingSecurities = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate6.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate11.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate21.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate23.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate29.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate34.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate7.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate13.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate17.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate19.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate28.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate33.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate2.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.SecurityOption1.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate48.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate49.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate58.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate65.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate69.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate72.AdditionalQuantityForExistingSecurities,
					com.tools20022.repository.msg.CorporateActionRate77.AdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate75.AdditionalQuantityForExistingSecurities);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToOldProceedsDefinition
	 * QuantityRatio.NewToOldProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#NewToOld
	 * CorporateActionRate6.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#NewToOld
	 * CorporateActionRate11.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate21#NewToOld
	 * CorporateActionRate21.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate23#NewToOld
	 * CorporateActionRate23.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#NewToOld
	 * CorporateActionRate29.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#NewToOld
	 * CorporateActionRate34.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#NewToOld
	 * CorporateActionRate7.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#NewToOld
	 * CorporateActionRate13.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#NewToOld
	 * CorporateActionRate17.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#NewToOld
	 * CorporateActionRate19.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#NewToOld
	 * CorporateActionRate28.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#NewToOld
	 * CorporateActionRate33.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#NewToOld
	 * CorporateActionRate2.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#NewToOld
	 * CorporateActionRate48.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#NewToOld
	 * CorporateActionRate49.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#NewToOld
	 * CorporateActionRate58.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#NewToOld
	 * CorporateActionRate65.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#NewToOld
	 * CorporateActionRate69.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#NewToOld
	 * CorporateActionRate72.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#NewToOld
	 * CorporateActionRate77.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#NewToOld
	 * CorporateActionRate75.NewToOld}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd NewToOld = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate6.NewToOld, com.tools20022.repository.msg.CorporateActionRate11.NewToOld, com.tools20022.repository.msg.CorporateActionRate21.NewToOld,
					com.tools20022.repository.msg.CorporateActionRate23.NewToOld, com.tools20022.repository.msg.CorporateActionRate29.NewToOld, com.tools20022.repository.msg.CorporateActionRate34.NewToOld,
					com.tools20022.repository.msg.CorporateActionRate7.NewToOld, com.tools20022.repository.msg.CorporateActionRate13.NewToOld, com.tools20022.repository.msg.CorporateActionRate17.NewToOld,
					com.tools20022.repository.msg.CorporateActionRate19.NewToOld, com.tools20022.repository.msg.CorporateActionRate28.NewToOld, com.tools20022.repository.msg.CorporateActionRate33.NewToOld,
					com.tools20022.repository.msg.CorporateActionRate2.NewToOld, com.tools20022.repository.msg.CorporateActionRate48.NewToOld, com.tools20022.repository.msg.CorporateActionRate49.NewToOld,
					com.tools20022.repository.msg.CorporateActionRate58.NewToOld, com.tools20022.repository.msg.CorporateActionRate65.NewToOld, com.tools20022.repository.msg.CorporateActionRate69.NewToOld,
					com.tools20022.repository.msg.CorporateActionRate72.NewToOld, com.tools20022.repository.msg.CorporateActionRate77.NewToOld, com.tools20022.repository.msg.CorporateActionRate75.NewToOld);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of new equities that will be derived by the exercise of a given
	 * quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToUnderlyingProceedsDefinition
	 * QuantityRatio.NewToUnderlyingProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate6#NewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate6.NewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate11#NewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate11.NewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#NewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate7.NewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#NewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate13.NewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#NewSecuritiesToUnderlyingSecurities
	 * CorporateActionRate2.NewSecuritiesToUnderlyingSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd NewSecuritiesToUnderlyingSecurities = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate6.NewSecuritiesToUnderlyingSecurities, com.tools20022.repository.msg.CorporateActionRate11.NewSecuritiesToUnderlyingSecurities,
					com.tools20022.repository.msg.CorporateActionRate7.NewSecuritiesToUnderlyingSecurities, com.tools20022.repository.msg.CorporateActionRate13.NewSecuritiesToUnderlyingSecurities,
					com.tools20022.repository.msg.CorporateActionRate2.NewSecuritiesToUnderlyingSecurities);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#ReinvestmentAmount
	 * CorporateActionAmounts2.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#ReinvestmentAmount
	 * CorporateActionAmounts5.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#ReinvestmentAmount
	 * CorporateActionAmounts11.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#ReinvestmentAmount
	 * CorporateActionAmounts12.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#ReinvestmentAmount
	 * CorporateActionAmounts17.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#ReinvestmentAmount
	 * CorporateActionAmounts20.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#ReinvestmentAmount
	 * CorporateActionAmounts23.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#ReinvestmentAmount
	 * CorporateActionAmounts24.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#ReinvestmentAmount
	 * CorporateActionAmounts3.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#ReinvestmentAmount
	 * CorporateActionAmounts6.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#ReinvestmentAmount
	 * CorporateActionAmounts9.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#ReinvestmentAmount
	 * CorporateActionAmounts13.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#ReinvestmentAmount
	 * CorporateActionAmounts16.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#ReinvestmentAmount
	 * CorporateActionAmounts19.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#ReinvestmentAmount
	 * CorporateActionAmounts22.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#ReinvestmentAmount
	 * CorporateActionAmounts25.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#ReinvestmentAmount
	 * CorporateActionAmounts4.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#ReinvestmentAmount
	 * CorporateActionAmounts7.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#ReinvestmentAmount
	 * CorporateActionAmounts10.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#ReinvestmentAmount
	 * CorporateActionAmounts14.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#ReinvestmentAmount
	 * CorporateActionAmounts15.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#ReinvestmentAmount
	 * CorporateActionAmounts18.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#ReinvestmentAmount
	 * CorporateActionAmounts21.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#ReinvestmentAmount
	 * CorporateActionAmounts26.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#ReinvestmentAmount
	 * CorporateActionAmounts1.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#ReinvestmentAmount
	 * CorporateActionAmounts29.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#ReinvestmentAmount
	 * CorporateActionAmounts27.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#ReinvestmentAmount
	 * CorporateActionAmounts28.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#ReinvestmentAmount
	 * CorporateActionAmounts33.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#ReinvestmentAmount
	 * CorporateActionAmounts32.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#ReinvestmentAmount
	 * CorporateActionAmounts35.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#ReinvestmentAmount
	 * CorporateActionAmounts37.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#ReinvestmentAmount
	 * CorporateActionAmounts36.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#ReinvestmentAmount
	 * CorporateActionAmounts38.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#ReinvestmentAmount
	 * CorporateActionAmounts39.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#ReinvestmentAmount
	 * CorporateActionAmounts41.ReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#ReinvestmentAmount
	 * CorporateActionAmounts40.ReinvestmentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAttribute ReinvestmentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts5.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts12.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts20.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts24.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts6.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts13.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts19.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts25.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts7.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts14.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts18.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts26.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts1.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts29.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts28.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts32.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts37.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts38.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.ReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts41.ReinvestmentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts40.ReinvestmentAmount);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat2Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat2Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat6Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat6Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation39.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat7Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat7Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation47.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation50.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation62.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#IntermediateSecuritiesDistributionType
	 * CorporateActionOption10.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat4Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat4Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#IntermediateSecuritiesDistributionType
	 * CorporateActionOption15.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#IntermediateSecuritiesDistributionType
	 * CorporateActionOption20.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#IntermediateSecuritiesDistributionType
	 * CorporateActionOption32.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat1Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat1Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#IntermediateSecuritiesDistributionType
	 * CorporateActionOption35.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#IntermediateSecuritiesDistributionType
	 * CorporateActionOption44.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#IntermediateSecuritiesDistributionType
	 * CorporateActionOption52.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#IntermediateSecuritiesDistributionType
	 * CorporateActionOption55.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#IntermediateSecuritiesDistributionType
	 * CorporateAction3.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#IntermediateSecuritiesDistributionType
	 * CorporateActionOption3.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat3Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat3Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#IntermediateSecuritiesDistributionType
	 * CorporateAction4.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#IntermediateSecuritiesDistributionType
	 * CorporateActionOption17.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#IntermediateSecuritiesDistributionType
	 * CorporateAction5.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat8Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat8Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#IntermediateSecuritiesDistributionType
	 * CorporateAction6.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#IntermediateSecuritiesDistributionType
	 * CorporateAction7.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#IntermediateSecuritiesDistributionType
	 * CorporateAction8.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#IntermediateSecuritiesDistributionType
	 * CorporateAction10.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#IntermediateSecuritiesDistributionType
	 * CorporateAction11.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice#Code
	 * IntermediateSecurityDistributionType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice#Proprietary
	 * IntermediateSecurityDistributionType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#IntermediateSecuritiesDistributionType
	 * CorporateAction2.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#IntermediateSecuritiesDistributionType
	 * CorporateActionOption1.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#IntermediateSecuritiesDistributionType
	 * CorporateActionOption100.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#IntermediateSecuritiesDistributionType
	 * CorporateAction12.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#IntermediateSecuritiesDistributionType
	 * CorporateActionOption108.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#IntermediateSecuritiesDistributionType
	 * CorporateAction17.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation79.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation83.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation82.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat13Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat13Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat14Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat14Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation89.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#IntermediateSecuritiesDistributionType
	 * CorporateActionOption115.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#IntermediateSecuritiesDistributionType
	 * CorporateAction31.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat16Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat16Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation98.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#IntermediateSecuritiesDistributionType
	 * CorporateActionOption125.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#IntermediateSecuritiesDistributionType
	 * CorporateAction40.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice#Code
	 * IntermediateSecuritiesDistributionTypeFormat17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice#Proprietary
	 * IntermediateSecuritiesDistributionTypeFormat17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation111.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#IntermediateSecuritiesDistributionType
	 * CorporateActionOption129.IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#IntermediateSecuritiesDistributionType
	 * CorporateActionGeneralInformation118.
	 * IntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#IntermediateSecuritiesDistributionType
	 * CorporateActionOption135.IntermediateSecuritiesDistributionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAttribute IntermediateSecuritiesDistributionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat2Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat2Choice.Proprietary,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat6Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat6Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation39.IntermediateSecuritiesDistributionType, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat7Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat7Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation47.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation50.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionGeneralInformation62.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption10.IntermediateSecuritiesDistributionType, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat4Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat4Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption15.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption20.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionOption32.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat1Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat1Choice.Proprietary,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice.Proprietary,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption35.IntermediateSecuritiesDistributionType, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption44.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption52.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionOption55.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateAction3.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionOption3.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat3Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction4.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionOption17.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateAction5.IntermediateSecuritiesDistributionType, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat8Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat8Choice.Proprietary, com.tools20022.repository.msg.CorporateAction6.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateAction7.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction8.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateAction10.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction11.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice.Code, com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateAction2.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionOption1.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption100.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction12.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption108.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction17.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionGeneralInformation83.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.IntermediateSecuritiesDistributionType, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat13Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat13Choice.Proprietary, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat14Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat14Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation89.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption115.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction31.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat16Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat16Choice.Proprietary,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice.Code, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation98.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionOption125.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateAction40.IntermediateSecuritiesDistributionType, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice.Proprietary, com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice.Code,
					com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation111.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption129.IntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionGeneralInformation118.IntermediateSecuritiesDistributionType,
					com.tools20022.repository.msg.CorporateActionOption135.IntermediateSecuritiesDistributionType);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediate securities distribution, eg, stock dividend, reverse right.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
		}
	};
	/**
	 * Quantity of equity that makes up a board lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BoardLotSecuritiesProceeds
	 * SecuritiesQuantity.BoardLotSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#NewBoardLotQuantity
	 * SecuritiesOption1.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#NewBoardLotQuantity
	 * SecuritiesOption9.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#NewBoardLotQuantity
	 * SecuritiesOption15.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#NewBoardLotQuantity
	 * SecuritiesOption16.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#NewBoardLotQuantity
	 * SecuritiesOption23.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#NewBoardLotQuantity
	 * SecuritiesOption28.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#NewBoardLotQuantity
	 * CorporateActionQuantity1.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#NewBoardLotQuantity
	 * CorporateActionQuantity2.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#NewBoardLotQuantity
	 * CorporateActionQuantity3.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#NewBoardLotQuantity
	 * CorporateActionQuantity4.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#NewBoardLotQuantity
	 * CorporateActionQuantity5.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#NewBoardLotQuantity
	 * CorporateActionQuantity6.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#NewBoardLotSecuritiesQuantity
	 * CorporateAction2.NewBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#NewBoardLotSecuritiesQuantity
	 * SecurityOption1.NewBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#NewBoardLotQuantity
	 * SecuritiesOption51.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#NewBoardLotQuantity
	 * CorporateActionQuantity7.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#NewBoardLotQuantity
	 * SecuritiesOption56.NewBoardLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#NewBoardLotQuantity
	 * CorporateActionQuantity8.NewBoardLotQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd BoardLotSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption1.NewBoardLotQuantity, com.tools20022.repository.msg.SecuritiesOption9.NewBoardLotQuantity,
					com.tools20022.repository.msg.SecuritiesOption15.NewBoardLotQuantity, com.tools20022.repository.msg.SecuritiesOption16.NewBoardLotQuantity, com.tools20022.repository.msg.SecuritiesOption23.NewBoardLotQuantity,
					com.tools20022.repository.msg.SecuritiesOption28.NewBoardLotQuantity, com.tools20022.repository.msg.CorporateActionQuantity1.NewBoardLotQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity2.NewBoardLotQuantity, com.tools20022.repository.msg.CorporateActionQuantity3.NewBoardLotQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity4.NewBoardLotQuantity, com.tools20022.repository.msg.CorporateActionQuantity5.NewBoardLotQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity6.NewBoardLotQuantity, com.tools20022.repository.msg.CorporateAction2.NewBoardLotSecuritiesQuantity,
					com.tools20022.repository.msg.SecurityOption1.NewBoardLotSecuritiesQuantity, com.tools20022.repository.msg.SecuritiesOption51.NewBoardLotQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity7.NewBoardLotQuantity, com.tools20022.repository.msg.SecuritiesOption56.NewBoardLotQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity8.NewBoardLotQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesQuantity";
			definition = "Quantity of equity that makes up a board lot.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * New denomination of the financial instrument following, eg, an increase
	 * or decrease in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NewDenominationSecuritiesProceeds
	 * SecuritiesQuantity.NewDenominationSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#NewDenominationQuantity
	 * SecuritiesOption1.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#NewDenominationQuantity
	 * SecuritiesOption9.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#NewDenominationQuantity
	 * SecuritiesOption15.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#NewDenominationQuantity
	 * SecuritiesOption16.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#NewDenominationQuantity
	 * SecuritiesOption23.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#NewDenominationQuantity
	 * SecuritiesOption28.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#NewDenominationQuantity
	 * CorporateActionQuantity1.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#NewDenominationQuantity
	 * CorporateActionQuantity2.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#NewDenominationQuantity
	 * CorporateActionQuantity3.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#NewDenominationQuantity
	 * CorporateActionQuantity4.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#NewDenominationQuantity
	 * CorporateActionQuantity5.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#NewDenominationQuantity
	 * CorporateActionQuantity6.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#NewDenominationSecuritiesQuantity
	 * CorporateAction2.NewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#NewDenominationSecuritiesQuantity
	 * SecurityOption1.NewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#NewDenominationQuantity
	 * SecuritiesOption51.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#NewDenominationQuantity
	 * CorporateActionQuantity7.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#NewDenominationQuantity
	 * SecuritiesOption56.NewDenominationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#NewDenominationQuantity
	 * CorporateActionQuantity8.NewDenominationQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd NewDenominationSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption1.NewDenominationQuantity, com.tools20022.repository.msg.SecuritiesOption9.NewDenominationQuantity,
					com.tools20022.repository.msg.SecuritiesOption15.NewDenominationQuantity, com.tools20022.repository.msg.SecuritiesOption16.NewDenominationQuantity,
					com.tools20022.repository.msg.SecuritiesOption23.NewDenominationQuantity, com.tools20022.repository.msg.SecuritiesOption28.NewDenominationQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity1.NewDenominationQuantity, com.tools20022.repository.msg.CorporateActionQuantity2.NewDenominationQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity3.NewDenominationQuantity, com.tools20022.repository.msg.CorporateActionQuantity4.NewDenominationQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity5.NewDenominationQuantity, com.tools20022.repository.msg.CorporateActionQuantity6.NewDenominationQuantity,
					com.tools20022.repository.msg.CorporateAction2.NewDenominationSecuritiesQuantity, com.tools20022.repository.msg.SecurityOption1.NewDenominationSecuritiesQuantity,
					com.tools20022.repository.msg.SecuritiesOption51.NewDenominationQuantity, com.tools20022.repository.msg.CorporateActionQuantity7.NewDenominationQuantity,
					com.tools20022.repository.msg.SecuritiesOption56.NewDenominationQuantity, com.tools20022.repository.msg.CorporateActionQuantity8.NewDenominationQuantity);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesQuantity";
			definition = "New denomination of the financial instrument following, eg, an increase or decrease in nominal value.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of intermediate securities awarded for a given quantity of
	 * underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#IntermediateSecuritiesProceedsDefinition
	 * QuantityRatio.IntermediateSecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes3.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes12.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes17.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes25.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes46.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes47.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes68.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#IntermediateSecuritiesToUnderlyingRatio
	 * FinancialInstrumentAttributes73.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd IntermediateSecuritiesToUnderlyingRatio = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes3.IntermediateSecuritiesToUnderlyingRatio,
					com.tools20022.repository.msg.FinancialInstrumentAttributes12.IntermediateSecuritiesToUnderlyingRatio, com.tools20022.repository.msg.FinancialInstrumentAttributes17.IntermediateSecuritiesToUnderlyingRatio,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.IntermediateSecuritiesToUnderlyingRatio, com.tools20022.repository.msg.FinancialInstrumentAttributes46.IntermediateSecuritiesToUnderlyingRatio,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.IntermediateSecuritiesToUnderlyingRatio, com.tools20022.repository.msg.FinancialInstrumentAttributes68.IntermediateSecuritiesToUnderlyingRatio,
					com.tools20022.repository.msg.FinancialInstrumentAttributes73.IntermediateSecuritiesToUnderlyingRatio);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesToUnderlyingRatio";
			definition = "Quantity of intermediate securities awarded for a given quantity of underlying security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate3.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate14.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate16.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate24.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate27.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate32.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate35.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate41.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#ReinvestmentDiscountToMarket
	 * CorporateActionRate1.ReinvestmentDiscountToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate43.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate56.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate66.ReinvestmentDiscountRateToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#ReinvestmentDiscountRateToMarket
	 * CorporateActionRate78.ReinvestmentDiscountRateToMarket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAttribute ReinvestmentDiscountToMarket = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate3.ReinvestmentDiscountRateToMarket, com.tools20022.repository.msg.CorporateActionRate14.ReinvestmentDiscountRateToMarket,
					com.tools20022.repository.msg.CorporateActionRate16.ReinvestmentDiscountRateToMarket, com.tools20022.repository.msg.CorporateActionRate24.ReinvestmentDiscountRateToMarket,
					com.tools20022.repository.msg.CorporateActionRate27.ReinvestmentDiscountRateToMarket, com.tools20022.repository.msg.CorporateActionRate32.ReinvestmentDiscountRateToMarket,
					com.tools20022.repository.msg.CorporateActionRate35.ReinvestmentDiscountRateToMarket, com.tools20022.repository.msg.CorporateActionRate41.ReinvestmentDiscountRateToMarket,
					com.tools20022.repository.msg.CorporateActionRate1.ReinvestmentDiscountToMarket, com.tools20022.repository.msg.CorporateActionRate43.ReinvestmentDiscountRateToMarket,
					com.tools20022.repository.msg.CorporateActionRate56.ReinvestmentDiscountRateToMarket, com.tools20022.repository.msg.CorporateActionRate66.ReinvestmentDiscountRateToMarket,
					com.tools20022.repository.msg.CorporateActionRate78.ReinvestmentDiscountRateToMarket);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDiscountToMarket";
			definition = "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#RedemptionDate
	 * CorporateActionDate2.RedemptionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAttribute RedemptionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate2.RedemptionDate);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionDate";
			definition = "Date on which the securities will be redeemed (early) for payment of principal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period during which the assented line is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssentedLinePeriodProceedsDefinition
	 * DateTimePeriod.AssentedLinePeriodProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#AssentedLinePeriod
	 * CorporateActionPeriod2.AssentedLinePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd AssentedLinePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod2.AssentedLinePeriod);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriod";
			definition = "Period during which the assented line is available.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period (last day included) during which an account owner can surrender or
	 * sell securities to the issuer and receive the sale proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SellThruIssuerProceedsDefinition
	 * DateTimePeriod.SellThruIssuerProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#SellThruIssuerPeriod
	 * CorporateActionPeriod2.SellThruIssuerPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd SellThruIssuerPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod2.SellThruIssuerPeriod);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerPeriod";
			definition = "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#ShareRanking
	 * SecurityOption1.ShareRanking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
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
	public static final MMBusinessAttribute ShareRanking = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityOption1.ShareRanking);
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShareRanking";
			definition = "Specifies whether the shares are ranking for dividend or pari passu.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ShareRankingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesProceedsDefinition";
				definition = "The definition of the securities proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a  bonus rights issue where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ParallelTradingPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewToOld,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ReinvestmentAmount,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesDistributionType, com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.ReinvestmentDiscountToMarket, com.tools20022.repository.entity.SecuritiesProceedsDefinition.RedemptionDate,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AssentedLinePeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.SellThruIssuerPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.ShareRanking);
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
}