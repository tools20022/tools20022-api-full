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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.CCPBackTestingDefinitionReportV01;
import com.tools20022.repository.choice.ModelType1Choice;
import com.tools20022.repository.datatype.BaseOneLimitedRate;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the characteristics of a backtesting methodology used to test the
 * performance of a risk model.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1#mmRiskModelType
 * BackTestingMethodology1.mmRiskModelType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1#mmModelConfidenceLevel
 * BackTestingMethodology1.mmModelConfidenceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1#mmVariationMarginCleanIndicator
 * BackTestingMethodology1.mmVariationMarginCleanIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1#mmDescription
 * BackTestingMethodology1.mmDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPBackTestingDefinitionReportV01#mmMethodology
 * CCPBackTestingDefinitionReportV01.mmMethodology}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BackTestingMethodology1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the characteristics of a backtesting methodology used to test the performance of a risk model."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BackTestingMethodology1", propOrder = {"riskModelType", "modelConfidenceLevel", "variationMarginCleanIndicator", "description"})
public class BackTestingMethodology1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RskMdlTp", required = true)
	protected ModelType1Choice riskModelType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ModelType1Choice
	 * ModelType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1
	 * BackTestingMethodology1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskMdlTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskModelType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the core model type, excluding any modifications for pro-cyclicality."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BackTestingMethodology1, ModelType1Choice> mmRiskModelType = new MMMessageAssociationEnd<BackTestingMethodology1, ModelType1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BackTestingMethodology1.mmObject();
			isDerived = false;
			xmlTag = "RskMdlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskModelType";
			definition = "Specifies the core model type, excluding any modifications for pro-cyclicality.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ModelType1Choice.mmObject();
		}

		@Override
		public ModelType1Choice getValue(BackTestingMethodology1 obj) {
			return obj.getRiskModelType();
		}

		@Override
		public void setValue(BackTestingMethodology1 obj, ModelType1Choice value) {
			obj.setRiskModelType(value);
		}
	};
	@XmlElement(name = "MdlCnfdncLvl", required = true)
	protected BaseOneLimitedRate modelConfidenceLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BaseOneLimitedRate
	 * BaseOneLimitedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1
	 * BackTestingMethodology1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdlCnfdncLvl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelConfidenceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the confidence interval used on a daily basis to assess the performance of the model.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BackTestingMethodology1, BaseOneLimitedRate> mmModelConfidenceLevel = new MMMessageAttribute<BackTestingMethodology1, BaseOneLimitedRate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BackTestingMethodology1.mmObject();
			isDerived = false;
			xmlTag = "MdlCnfdncLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModelConfidenceLevel";
			definition = "Specifies the confidence interval used on a daily basis to assess the performance of the model.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneLimitedRate.mmObject();
		}

		@Override
		public BaseOneLimitedRate getValue(BackTestingMethodology1 obj) {
			return obj.getModelConfidenceLevel();
		}

		@Override
		public void setValue(BackTestingMethodology1 obj, BaseOneLimitedRate value) {
			obj.setModelConfidenceLevel(value);
		}
	};
	@XmlElement(name = "VartnMrgnCleanInd", required = true)
	protected TrueFalseIndicator variationMarginCleanIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1
	 * BackTestingMethodology1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnCleanInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginCleanIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the CCP model calculates mark-to-market changes on fixed portfolios when backtesting.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BackTestingMethodology1, TrueFalseIndicator> mmVariationMarginCleanIndicator = new MMMessageAttribute<BackTestingMethodology1, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BackTestingMethodology1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnCleanInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginCleanIndicator";
			definition = "Indicates whether the CCP model calculates mark-to-market changes on fixed portfolios when backtesting.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(BackTestingMethodology1 obj) {
			return obj.getVariationMarginCleanIndicator();
		}

		@Override
		public void setValue(BackTestingMethodology1 obj, TrueFalseIndicator value) {
			obj.setVariationMarginCleanIndicator(value);
		}
	};
	@XmlElement(name = "Desc")
	protected Max2000Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BackTestingMethodology1
	 * BackTestingMethodology1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of backtesting methodology."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BackTestingMethodology1, Optional<Max2000Text>> mmDescription = new MMMessageAttribute<BackTestingMethodology1, Optional<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BackTestingMethodology1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Description of backtesting methodology.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Optional<Max2000Text> getValue(BackTestingMethodology1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(BackTestingMethodology1 obj, Optional<Max2000Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BackTestingMethodology1.mmRiskModelType, com.tools20022.repository.msg.BackTestingMethodology1.mmModelConfidenceLevel,
						com.tools20022.repository.msg.BackTestingMethodology1.mmVariationMarginCleanIndicator, com.tools20022.repository.msg.BackTestingMethodology1.mmDescription);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPBackTestingDefinitionReportV01.mmMethodology);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BackTestingMethodology1";
				definition = "Specifies the characteristics of a backtesting methodology used to test the performance of a risk model.";
			}
		});
		return mmObject_lazy.get();
	}

	public ModelType1Choice getRiskModelType() {
		return riskModelType;
	}

	public BackTestingMethodology1 setRiskModelType(ModelType1Choice riskModelType) {
		this.riskModelType = Objects.requireNonNull(riskModelType);
		return this;
	}

	public BaseOneLimitedRate getModelConfidenceLevel() {
		return modelConfidenceLevel;
	}

	public BackTestingMethodology1 setModelConfidenceLevel(BaseOneLimitedRate modelConfidenceLevel) {
		this.modelConfidenceLevel = Objects.requireNonNull(modelConfidenceLevel);
		return this;
	}

	public TrueFalseIndicator getVariationMarginCleanIndicator() {
		return variationMarginCleanIndicator;
	}

	public BackTestingMethodology1 setVariationMarginCleanIndicator(TrueFalseIndicator variationMarginCleanIndicator) {
		this.variationMarginCleanIndicator = Objects.requireNonNull(variationMarginCleanIndicator);
		return this;
	}

	public Optional<Max2000Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public BackTestingMethodology1 setDescription(Max2000Text description) {
		this.description = description;
		return this;
	}
}