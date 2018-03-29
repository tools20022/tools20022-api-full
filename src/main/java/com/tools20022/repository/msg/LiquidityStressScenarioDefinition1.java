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
import com.tools20022.repository.area.auth.CCPLiquidityStressTestingDefinitionReportV01;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification166;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Attributes and information that describe a scenario used to test whether a
 * legal entity or other financial construct has sufficient liquid resources to
 * meet its obligations as they arise.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1#mmIdentification
 * LiquidityStressScenarioDefinition1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1#mmDescription
 * LiquidityStressScenarioDefinition1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1#mmType
 * LiquidityStressScenarioDefinition1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1#mmStressCurrency
 * LiquidityStressScenarioDefinition1.mmStressCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPLiquidityStressTestingDefinitionReportV01#mmLiquidityStressScenarioDefinition
 * CCPLiquidityStressTestingDefinitionReportV01.
 * mmLiquidityStressScenarioDefinition}</li>
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
 * "LiquidityStressScenarioDefinition1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Attributes and information that describe a scenario used to test whether a legal entity or other financial construct has sufficient liquid resources to meet its obligations as they arise."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityStressScenarioDefinition1", propOrder = {"identification", "description", "type", "stressCurrency"})
public class LiquidityStressScenarioDefinition1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification166 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification166
	 * GenericIdentification166}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1
	 * LiquidityStressScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CCP’s internal unique identifier of the stress scenario that generates the reported liquidity need.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityStressScenarioDefinition1, GenericIdentification166> mmIdentification = new MMMessageAssociationEnd<LiquidityStressScenarioDefinition1, GenericIdentification166>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "CCP’s internal unique identifier of the stress scenario that generates the reported liquidity need.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification166.mmObject();
		}

		@Override
		public GenericIdentification166 getValue(LiquidityStressScenarioDefinition1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(LiquidityStressScenarioDefinition1 obj, GenericIdentification166 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Desc", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1
	 * LiquidityStressScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the method and assumptions used for estimating operational outflows.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityStressScenarioDefinition1, Max2000Text> mmDescription = new MMMessageAttribute<LiquidityStressScenarioDefinition1, Max2000Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Details of the method and assumptions used for estimating operational outflows.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Max2000Text getValue(LiquidityStressScenarioDefinition1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(LiquidityStressScenarioDefinition1 obj, Max2000Text value) {
			obj.setDescription(value);
		}
	};
	@XmlElement(name = "Tp")
	protected Max35Text type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1
	 * LiquidityStressScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CCP’s internal classification of stress scenario type.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityStressScenarioDefinition1, Optional<Max35Text>> mmType = new MMMessageAttribute<LiquidityStressScenarioDefinition1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "CCP’s internal classification of stress scenario type.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(LiquidityStressScenarioDefinition1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(LiquidityStressScenarioDefinition1 obj, Optional<Max35Text> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "StrssCcy", required = true)
	protected ActiveCurrencyCode stressCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressScenarioDefinition1
	 * LiquidityStressScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrssCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StressCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stress currency, or if aggregate, report ‘XLL’.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityStressScenarioDefinition1, ActiveCurrencyCode> mmStressCurrency = new MMMessageAttribute<LiquidityStressScenarioDefinition1, ActiveCurrencyCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "StrssCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StressCurrency";
			definition = "Stress currency, or if aggregate, report ‘XLL’.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(LiquidityStressScenarioDefinition1 obj) {
			return obj.getStressCurrency();
		}

		@Override
		public void setValue(LiquidityStressScenarioDefinition1 obj, ActiveCurrencyCode value) {
			obj.setStressCurrency(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmIdentification, com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmDescription,
						com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmType, com.tools20022.repository.msg.LiquidityStressScenarioDefinition1.mmStressCurrency);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPLiquidityStressTestingDefinitionReportV01.mmLiquidityStressScenarioDefinition);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityStressScenarioDefinition1";
				definition = "Attributes and information that describe a scenario used to test whether a legal entity or other financial construct has sufficient liquid resources to meet its obligations as they arise.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification166 getIdentification() {
		return identification;
	}

	public LiquidityStressScenarioDefinition1 setIdentification(GenericIdentification166 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max2000Text getDescription() {
		return description;
	}

	public LiquidityStressScenarioDefinition1 setDescription(Max2000Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Optional<Max35Text> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public LiquidityStressScenarioDefinition1 setType(Max35Text type) {
		this.type = type;
		return this;
	}

	public ActiveCurrencyCode getStressCurrency() {
		return stressCurrency;
	}

	public LiquidityStressScenarioDefinition1 setStressCurrency(ActiveCurrencyCode stressCurrency) {
		this.stressCurrency = Objects.requireNonNull(stressCurrency);
		return this;
	}
}