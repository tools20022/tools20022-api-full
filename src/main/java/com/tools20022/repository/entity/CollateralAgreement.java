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
import com.tools20022.repository.codeset.ExposureConventionTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement between two trading parties that contains information about their
 * relative duties and rights regarding collateral processes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralAgreement" src="doc-files/CollateralAgreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#BaseCurrency
 * CollateralAgreement.BaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#AssociatedMasterAgreement
 * CollateralAgreement.AssociatedMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#StandingSettlementInstructions
 * CollateralAgreement.StandingSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#MarginConvention
 * CollateralAgreement.MarginConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#ExposureTerm
 * CollateralAgreement.ExposureTerm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#CallFrequency
 * CollateralAgreement.CallFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#Collateral
 * CollateralAgreement.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#RiskCoverage
 * CollateralAgreement.RiskCoverage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#RelatedCollateralAgreement
 * ExposureTerm.RelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#RelatedCollateralAgreement
 * StandingSettlementInstruction.RelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAgreement
 * Collateral.CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#CollateralAgreement
 * MasterAgreement.CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#AgreedTerms
 * CollateralManagement.AgreedTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation1 Obligation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement2 Agreement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation2 Obligation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation3 Obligation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement4 Agreement4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two trading parties that contains information about their relative duties and rights regarding collateral processes."
 * </li>
 * </ul>
 */
public class CollateralAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Denomination currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement2#BaseCurrency
	 * Agreement2.BaseCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#BaseCurrency
	 * Agreement4.BaseCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denomination currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BaseCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Agreement2.BaseCurrency, com.tools20022.repository.msg.Agreement4.BaseCurrency);
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Denomination currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Agreement in which the parties agree to most of the terms that will
	 * govern collateral transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#CollateralAgreement
	 * MasterAgreement.CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement2#AgreementFramework
	 * Agreement2.AgreementFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#AgreementFramework
	 * Agreement4.AgreementFramework}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement in which the parties agree to most of the terms that will govern collateral transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssociatedMasterAgreement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Agreement2.AgreementFramework, com.tools20022.repository.msg.Agreement4.AgreementFramework);
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedMasterAgreement";
			definition = "Agreement in which the parties agree to most of the terms that will govern collateral transactions.";
			minOccurs = 0;
			type_lazy = () -> MasterAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.CollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement instructions which must be used for the settlement of
	 * collateral unless otherwise specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#RelatedCollateralAgreement
	 * StandingSettlementInstruction.RelatedCollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral2#StandardSettlementInstructions
	 * Collateral2.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral4#StandardSettlementInstructions
	 * Collateral4.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#StandardSettlementInstructions
	 * CollateralSubstitution1.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#StandardSettlementInstructions
	 * CollateralSubstitution2.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral7#StandardSettlementInstructions
	 * Collateral7.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral8#StandardSettlementInstructions
	 * Collateral8.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#StandardSettlementInstructions
	 * CollateralSubstitution3.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#StandardSettlementInstructions
	 * CollateralSubstitution5.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#StandardSettlementInstructions
	 * CollateralSubstitution4.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral11#StandardSettlementInstructions
	 * Collateral11.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral12#StandardSettlementInstructions
	 * Collateral12.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral16#StandardSettlementInstructions
	 * Collateral16.StandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#StandardSettlementInstructions
	 * Collateral17.StandardSettlementInstructions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instructions which must be used for the settlement of collateral unless otherwise specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingSettlementInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Collateral2.StandardSettlementInstructions, com.tools20022.repository.msg.Collateral4.StandardSettlementInstructions,
					com.tools20022.repository.msg.CollateralSubstitution1.StandardSettlementInstructions, com.tools20022.repository.msg.CollateralSubstitution2.StandardSettlementInstructions,
					com.tools20022.repository.msg.Collateral7.StandardSettlementInstructions, com.tools20022.repository.msg.Collateral8.StandardSettlementInstructions,
					com.tools20022.repository.msg.CollateralSubstitution3.StandardSettlementInstructions, com.tools20022.repository.msg.CollateralSubstitution5.StandardSettlementInstructions,
					com.tools20022.repository.msg.CollateralSubstitution4.StandardSettlementInstructions, com.tools20022.repository.msg.Collateral11.StandardSettlementInstructions,
					com.tools20022.repository.msg.Collateral12.StandardSettlementInstructions, com.tools20022.repository.msg.Collateral16.StandardSettlementInstructions,
					com.tools20022.repository.msg.Collateral17.StandardSettlementInstructions);
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructions";
			definition = "Settlement instructions which must be used for the settlement of collateral unless otherwise specified.";
			minOccurs = 0;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.RelatedCollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Determines how the variation margin requirement will be calculated,
	 * either net or gross.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureConventionTypeCode
	 * ExposureConventionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCall1#ExposureConvention
	 * MarginCall1.ExposureConvention}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determines how the variation margin requirement will be calculated, either net or gross."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginConvention = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginCall1.ExposureConvention);
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginConvention";
			definition = "Determines how the variation margin requirement will be calculated, either net or gross.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExposureConventionTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the terms used to calculate a risk exposure and its coverage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#RelatedCollateralAgreement
	 * ExposureTerm.RelatedCollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureTerm
	 * ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureTerm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the terms used to calculate a risk exposure and its coverage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExposureTerm = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureTerm";
			definition = "Specifies the terms used to calculate a risk exposure and its coverage.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureTerm.RelatedCollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the frequency at which collateral positions are evaluated and
	 * margin calls are issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency at which collateral positions are evaluated and margin calls are issued."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CallFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallFrequency";
			definition = "Specifies the frequency at which collateral positions are evaluated and margin calls are issued.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the collateral which is the subject of the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAgreement
	 * Collateral.CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Collateral
	 * LoanContract1.Collateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral which is the subject of the agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.Collateral);
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral which is the subject of the agreement.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral management process which applies the terms agreed in the
	 * collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#AgreedTerms
	 * CollateralManagement.AgreedTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskCoverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral management process which applies the terms agreed in the collateral agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RiskCoverage = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskCoverage";
			definition = "Collateral management process which applies the terms agreed in the collateral agreement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.AgreedTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralAgreement";
				definition = "Agreement between two trading parties that contains information about their relative duties and rights regarding collateral processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureTerm.RelatedCollateralAgreement, com.tools20022.repository.entity.StandingSettlementInstruction.RelatedCollateralAgreement,
						com.tools20022.repository.entity.Collateral.CollateralAgreement, com.tools20022.repository.entity.MasterAgreement.CollateralAgreement, com.tools20022.repository.entity.CollateralManagement.AgreedTerms);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralAgreement.BaseCurrency, com.tools20022.repository.entity.CollateralAgreement.AssociatedMasterAgreement,
						com.tools20022.repository.entity.CollateralAgreement.StandingSettlementInstructions, com.tools20022.repository.entity.CollateralAgreement.MarginConvention,
						com.tools20022.repository.entity.CollateralAgreement.ExposureTerm, com.tools20022.repository.entity.CollateralAgreement.CallFrequency, com.tools20022.repository.entity.CollateralAgreement.Collateral,
						com.tools20022.repository.entity.CollateralAgreement.RiskCoverage);
				derivationComponent_lazy = () -> Arrays.asList(Obligation1.mmObject(), Agreement2.mmObject(), Obligation2.mmObject(), Obligation3.mmObject(), Obligation4.mmObject(), Agreement4.mmObject(), Obligation5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}