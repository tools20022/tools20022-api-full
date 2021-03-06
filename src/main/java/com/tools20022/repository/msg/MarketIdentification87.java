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
import com.tools20022.repository.choice.ClassificationType1Choice;
import com.tools20022.repository.choice.Purpose3Choice;
import com.tools20022.repository.codeset.CountryCode;
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
 * Identifies the market and purpose for the settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification87#mmCountry
 * MarketIdentification87.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification87#mmClassificationType
 * MarketIdentification87.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification87#mmSettlementPurpose
 * MarketIdentification87.mmSettlementPurpose}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketIdentification87"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the market and purpose for the settlement."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarketIdentification87", propOrder = {"country", "classificationType", "settlementPurpose"})
public class MarketIdentification87 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctry", required = true)
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification87
	 * MarketIdentification87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the financial instrument is to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification87, CountryCode> mmCountry = new MMMessageAttribute<MarketIdentification87, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification87.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country in which the financial instrument is to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(MarketIdentification87 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(MarketIdentification87 obj, CountryCode value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "ClssfctnTp", required = true)
	protected ClassificationType1Choice classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice
	 * ClassificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification87
	 * MarketIdentification87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instrument covered by the SSI instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarketIdentification87, ClassificationType1Choice> mmClassificationType = new MMMessageAssociationEnd<MarketIdentification87, ClassificationType1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification87.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Type of instrument covered by the SSI instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ClassificationType1Choice.mmObject();
		}

		@Override
		public ClassificationType1Choice getValue(MarketIdentification87 obj) {
			return obj.getClassificationType();
		}

		@Override
		public void setValue(MarketIdentification87 obj, ClassificationType1Choice value) {
			obj.setClassificationType(value);
		}
	};
	@XmlElement(name = "SttlmPurp")
	protected Purpose3Choice settlementPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose3Choice
	 * Purpose3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification87
	 * MarketIdentification87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPurp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purpose of the instruction, for example, whether for regular payments, margin payments related to a collateral movement, securities settlements, securities lending."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarketIdentification87, Optional<Purpose3Choice>> mmSettlementPurpose = new MMMessageAssociationEnd<MarketIdentification87, Optional<Purpose3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification87.mmObject();
			isDerived = false;
			xmlTag = "SttlmPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPurpose";
			definition = "Purpose of the instruction, for example, whether for regular payments, margin payments related to a collateral movement, securities settlements, securities lending.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose3Choice.mmObject();
		}

		@Override
		public Optional<Purpose3Choice> getValue(MarketIdentification87 obj) {
			return obj.getSettlementPurpose();
		}

		@Override
		public void setValue(MarketIdentification87 obj, Optional<Purpose3Choice> value) {
			obj.setSettlementPurpose(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarketIdentification87.mmCountry, com.tools20022.repository.msg.MarketIdentification87.mmClassificationType,
						com.tools20022.repository.msg.MarketIdentification87.mmSettlementPurpose);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketIdentification87";
				definition = "Identifies the market and purpose for the settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getCountry() {
		return country;
	}

	public MarketIdentification87 setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public ClassificationType1Choice getClassificationType() {
		return classificationType;
	}

	public MarketIdentification87 setClassificationType(ClassificationType1Choice classificationType) {
		this.classificationType = Objects.requireNonNull(classificationType);
		return this;
	}

	public Optional<Purpose3Choice> getSettlementPurpose() {
		return settlementPurpose == null ? Optional.empty() : Optional.of(settlementPurpose);
	}

	public MarketIdentification87 setSettlementPurpose(Purpose3Choice settlementPurpose) {
		this.settlementPurpose = settlementPurpose;
		return this;
	}
}