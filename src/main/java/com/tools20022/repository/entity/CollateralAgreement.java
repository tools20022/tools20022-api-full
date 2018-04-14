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
import com.tools20022.repository.codeset.ExposureConventionTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmBaseCurrency
 * CollateralAgreement.mmBaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmAssociatedMasterAgreement
 * CollateralAgreement.mmAssociatedMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
 * CollateralAgreement.mmStandingSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmMarginConvention
 * CollateralAgreement.mmMarginConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmExposureTerm
 * CollateralAgreement.mmExposureTerm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmCallFrequency
 * CollateralAgreement.mmCallFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmCollateral
 * CollateralAgreement.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmRiskCoverage
 * CollateralAgreement.mmRiskCoverage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRelatedCollateralAgreement
 * ExposureTerm.mmRelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmRelatedCollateralAgreement
 * StandingSettlementInstruction.mmRelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAgreement
 * Collateral.mmCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmCollateralAgreement
 * MasterAgreement.mmCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmAgreedTerms
 * CollateralManagement.mmAgreedTerms}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two trading parties that contains information about their relative duties and rights regarding collateral processes."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class CollateralAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode baseCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement2#mmBaseCurrency
	 * Agreement2.mmBaseCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#mmBaseCurrency
	 * Agreement4.mmBaseCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denomination currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralAgreement, CurrencyCode> mmBaseCurrency = new MMBusinessAttribute<CollateralAgreement, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Agreement2.mmBaseCurrency, Agreement4.mmBaseCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Denomination currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CollateralAgreement obj) {
			return obj.getBaseCurrency();
		}

		@Override
		public void setValue(CollateralAgreement obj, CurrencyCode value) {
			obj.setBaseCurrency(value);
		}
	};
	protected List<MasterAgreement> associatedMasterAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmCollateralAgreement
	 * MasterAgreement.mmCollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementFramework
	 * Agreement2.mmAgreementFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementFramework
	 * Agreement4.mmAgreementFramework}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement in which the parties agree to most of the terms that will govern collateral transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralAgreement, List<MasterAgreement>> mmAssociatedMasterAgreement = new MMBusinessAssociationEnd<CollateralAgreement, List<MasterAgreement>>() {
		{
			derivation_lazy = () -> Arrays.asList(Agreement2.mmAgreementFramework, Agreement4.mmAgreementFramework);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedMasterAgreement";
			definition = "Agreement in which the parties agree to most of the terms that will govern collateral transactions.";
			minOccurs = 0;
			opposite_lazy = () -> MasterAgreement.mmCollateralAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MasterAgreement.mmObject();
		}

		@Override
		public List<MasterAgreement> getValue(CollateralAgreement obj) {
			return obj.getAssociatedMasterAgreement();
		}

		@Override
		public void setValue(CollateralAgreement obj, List<MasterAgreement> value) {
			obj.setAssociatedMasterAgreement(value);
		}
	};
	protected List<StandingSettlementInstruction> standingSettlementInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmRelatedCollateralAgreement
	 * StandingSettlementInstruction.mmRelatedCollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral2#mmStandardSettlementInstructions
	 * Collateral2.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral4#mmStandardSettlementInstructions
	 * Collateral4.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmStandardSettlementInstructions
	 * CollateralSubstitution1.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmStandardSettlementInstructions
	 * CollateralSubstitution2.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmStandardSettlementInstructions
	 * Collateral7.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral8#mmStandardSettlementInstructions
	 * Collateral8.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#mmStandardSettlementInstructions
	 * CollateralSubstitution3.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmStandardSettlementInstructions
	 * CollateralSubstitution5.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#mmStandardSettlementInstructions
	 * CollateralSubstitution4.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral11#mmStandardSettlementInstructions
	 * Collateral11.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral12#mmStandardSettlementInstructions
	 * Collateral12.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral16#mmStandardSettlementInstructions
	 * Collateral16.mmStandardSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmStandardSettlementInstructions
	 * Collateral17.mmStandardSettlementInstructions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instructions which must be used for the settlement of collateral unless otherwise specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralAgreement, List<StandingSettlementInstruction>> mmStandingSettlementInstructions = new MMBusinessAssociationEnd<CollateralAgreement, List<StandingSettlementInstruction>>() {
		{
			derivation_lazy = () -> Arrays.asList(Collateral2.mmStandardSettlementInstructions, Collateral4.mmStandardSettlementInstructions, CollateralSubstitution1.mmStandardSettlementInstructions,
					CollateralSubstitution2.mmStandardSettlementInstructions, Collateral7.mmStandardSettlementInstructions, Collateral8.mmStandardSettlementInstructions, CollateralSubstitution3.mmStandardSettlementInstructions,
					CollateralSubstitution5.mmStandardSettlementInstructions, CollateralSubstitution4.mmStandardSettlementInstructions, Collateral11.mmStandardSettlementInstructions, Collateral12.mmStandardSettlementInstructions,
					Collateral16.mmStandardSettlementInstructions, Collateral17.mmStandardSettlementInstructions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructions";
			definition = "Settlement instructions which must be used for the settlement of collateral unless otherwise specified.";
			minOccurs = 0;
			opposite_lazy = () -> StandingSettlementInstruction.mmRelatedCollateralAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
		}

		@Override
		public List<StandingSettlementInstruction> getValue(CollateralAgreement obj) {
			return obj.getStandingSettlementInstructions();
		}

		@Override
		public void setValue(CollateralAgreement obj, List<StandingSettlementInstruction> value) {
			obj.setStandingSettlementInstructions(value);
		}
	};
	protected ExposureConventionTypeCode marginConvention;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MarginCall1#mmExposureConvention
	 * MarginCall1.mmExposureConvention}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determines how the variation margin requirement will be calculated, either net or gross."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralAgreement, ExposureConventionTypeCode> mmMarginConvention = new MMBusinessAttribute<CollateralAgreement, ExposureConventionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MarginCall1.mmExposureConvention);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginConvention";
			definition = "Determines how the variation margin requirement will be calculated, either net or gross.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureConventionTypeCode.mmObject();
		}

		@Override
		public ExposureConventionTypeCode getValue(CollateralAgreement obj) {
			return obj.getMarginConvention();
		}

		@Override
		public void setValue(CollateralAgreement obj, ExposureConventionTypeCode value) {
			obj.setMarginConvention(value);
		}
	};
	protected List<com.tools20022.repository.entity.ExposureTerm> exposureTerm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureTerm
	 * ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRelatedCollateralAgreement
	 * ExposureTerm.mmRelatedCollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureTerm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the terms used to calculate a risk exposure and its coverage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralAgreement, List<ExposureTerm>> mmExposureTerm = new MMBusinessAssociationEnd<CollateralAgreement, List<ExposureTerm>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureTerm";
			definition = "Specifies the terms used to calculate a risk exposure and its coverage.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmRelatedCollateralAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
		}

		@Override
		public List<ExposureTerm> getValue(CollateralAgreement obj) {
			return obj.getExposureTerm();
		}

		@Override
		public void setValue(CollateralAgreement obj, List<ExposureTerm> value) {
			obj.setExposureTerm(value);
		}
	};
	protected FrequencyCode callFrequency;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency at which collateral positions are evaluated and margin calls are issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralAgreement, FrequencyCode> mmCallFrequency = new MMBusinessAttribute<CollateralAgreement, FrequencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallFrequency";
			definition = "Specifies the frequency at which collateral positions are evaluated and margin calls are issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(CollateralAgreement obj) {
			return obj.getCallFrequency();
		}

		@Override
		public void setValue(CollateralAgreement obj, FrequencyCode value) {
			obj.setCallFrequency(value);
		}
	};
	protected List<com.tools20022.repository.entity.Collateral> collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAgreement
	 * Collateral.mmCollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmCollateral
	 * LoanContract1.mmCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral which is the subject of the agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralAgreement, List<Collateral>> mmCollateral = new MMBusinessAssociationEnd<CollateralAgreement, List<Collateral>>() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContract1.mmCollateral);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral which is the subject of the agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmCollateralAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}

		@Override
		public List<Collateral> getValue(CollateralAgreement obj) {
			return obj.getCollateral();
		}

		@Override
		public void setValue(CollateralAgreement obj, List<Collateral> value) {
			obj.setCollateral(value);
		}
	};
	protected CollateralManagement riskCoverage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmAgreedTerms
	 * CollateralManagement.mmAgreedTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskCoverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral management process which applies the terms agreed in the collateral agreement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralAgreement, Optional<CollateralManagement>> mmRiskCoverage = new MMBusinessAssociationEnd<CollateralAgreement, Optional<CollateralManagement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskCoverage";
			definition = "Collateral management process which applies the terms agreed in the collateral agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CollateralManagement.mmAgreedTerms;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public Optional<CollateralManagement> getValue(CollateralAgreement obj) {
			return obj.getRiskCoverage();
		}

		@Override
		public void setValue(CollateralAgreement obj, Optional<CollateralManagement> value) {
			obj.setRiskCoverage(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralAgreement";
				definition = "Agreement between two trading parties that contains information about their relative duties and rights regarding collateral processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureTerm.mmRelatedCollateralAgreement, StandingSettlementInstruction.mmRelatedCollateralAgreement,
						com.tools20022.repository.entity.Collateral.mmCollateralAgreement, MasterAgreement.mmCollateralAgreement, CollateralManagement.mmAgreedTerms);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralAgreement.mmBaseCurrency, com.tools20022.repository.entity.CollateralAgreement.mmAssociatedMasterAgreement,
						com.tools20022.repository.entity.CollateralAgreement.mmStandingSettlementInstructions, com.tools20022.repository.entity.CollateralAgreement.mmMarginConvention,
						com.tools20022.repository.entity.CollateralAgreement.mmExposureTerm, com.tools20022.repository.entity.CollateralAgreement.mmCallFrequency, com.tools20022.repository.entity.CollateralAgreement.mmCollateral,
						com.tools20022.repository.entity.CollateralAgreement.mmRiskCoverage);
				derivationComponent_lazy = () -> Arrays.asList(Obligation1.mmObject(), Agreement2.mmObject(), Obligation2.mmObject(), Obligation3.mmObject(), Obligation4.mmObject(), Agreement4.mmObject(), Obligation5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralAgreement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public CollateralAgreement setBaseCurrency(CurrencyCode baseCurrency) {
		this.baseCurrency = Objects.requireNonNull(baseCurrency);
		return this;
	}

	public List<MasterAgreement> getAssociatedMasterAgreement() {
		return associatedMasterAgreement == null ? associatedMasterAgreement = new ArrayList<>() : associatedMasterAgreement;
	}

	public CollateralAgreement setAssociatedMasterAgreement(List<MasterAgreement> associatedMasterAgreement) {
		this.associatedMasterAgreement = Objects.requireNonNull(associatedMasterAgreement);
		return this;
	}

	public List<StandingSettlementInstruction> getStandingSettlementInstructions() {
		return standingSettlementInstructions == null ? standingSettlementInstructions = new ArrayList<>() : standingSettlementInstructions;
	}

	public CollateralAgreement setStandingSettlementInstructions(List<StandingSettlementInstruction> standingSettlementInstructions) {
		this.standingSettlementInstructions = Objects.requireNonNull(standingSettlementInstructions);
		return this;
	}

	public ExposureConventionTypeCode getMarginConvention() {
		return marginConvention;
	}

	public CollateralAgreement setMarginConvention(ExposureConventionTypeCode marginConvention) {
		this.marginConvention = Objects.requireNonNull(marginConvention);
		return this;
	}

	public List<ExposureTerm> getExposureTerm() {
		return exposureTerm == null ? exposureTerm = new ArrayList<>() : exposureTerm;
	}

	public CollateralAgreement setExposureTerm(List<com.tools20022.repository.entity.ExposureTerm> exposureTerm) {
		this.exposureTerm = Objects.requireNonNull(exposureTerm);
		return this;
	}

	public FrequencyCode getCallFrequency() {
		return callFrequency;
	}

	public CollateralAgreement setCallFrequency(FrequencyCode callFrequency) {
		this.callFrequency = Objects.requireNonNull(callFrequency);
		return this;
	}

	public List<Collateral> getCollateral() {
		return collateral == null ? collateral = new ArrayList<>() : collateral;
	}

	public CollateralAgreement setCollateral(List<com.tools20022.repository.entity.Collateral> collateral) {
		this.collateral = Objects.requireNonNull(collateral);
		return this;
	}

	public Optional<CollateralManagement> getRiskCoverage() {
		return riskCoverage == null ? Optional.empty() : Optional.of(riskCoverage);
	}

	public CollateralAgreement setRiskCoverage(CollateralManagement riskCoverage) {
		this.riskCoverage = riskCoverage;
		return this;
	}
}