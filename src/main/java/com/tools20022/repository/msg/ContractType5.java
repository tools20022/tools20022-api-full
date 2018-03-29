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
import com.tools20022.repository.choice.ProductClassification1Choice;
import com.tools20022.repository.choice.SecurityIdentification18Choice;
import com.tools20022.repository.choice.SecurityIdentification19Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.FinancialInstrumentContractType2Code;
import com.tools20022.repository.codeset.ProductType4Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to contract attributes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractType5#mmContractType
 * ContractType5.mmContractType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractType5#mmAssetClass
 * ContractType5.mmAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractType5#mmProductClassification
 * ContractType5.mmProductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractType5#mmProductIdentification
 * ContractType5.mmProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractType5#mmUnderlyingAsset
 * ContractType5.mmUnderlyingAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractType5#mmNotionalCurrencyFirstLeg
 * ContractType5.mmNotionalCurrencyFirstLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractType5#mmNotionalCurrencySecondLeg
 * ContractType5.mmNotionalCurrencySecondLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractType5#mmSettlementCurrency
 * ContractType5.mmSettlementCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "ContractType5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to contract attributes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractType5", propOrder = {"contractType", "assetClass", "productClassification", "productIdentification", "underlyingAsset", "notionalCurrencyFirstLeg", "notionalCurrencySecondLeg", "settlementCurrency"})
public class ContractType5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctTp")
	protected FinancialInstrumentContractType2Code contractType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType2Code
	 * FinancialInstrumentContractType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAsset
	 * AssetClassification.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classification of information according to contract type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractType5, Optional<FinancialInstrumentContractType2Code>> mmContractType = new MMMessageAttribute<ContractType5, Optional<FinancialInstrumentContractType2Code>>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "CtrctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractType";
			definition = "Classification of information according to contract type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialInstrumentContractType2Code.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentContractType2Code> getValue(ContractType5 obj) {
			return obj.getContractType();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<FinancialInstrumentContractType2Code> value) {
			obj.setContractType(value.orElse(null));
		}
	};
	@XmlElement(name = "AsstClss")
	protected ProductType4Code assetClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType4Code
	 * ProductType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the classification according to the asset class of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractType5, Optional<ProductType4Code>> mmAssetClass = new MMMessageAttribute<ContractType5, Optional<ProductType4Code>>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "AsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClass";
			definition = "Specifies the classification according to the asset class of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ProductType4Code.mmObject();
		}

		@Override
		public Optional<ProductType4Code> getValue(ContractType5 obj) {
			return obj.getAssetClass();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<ProductType4Code> value) {
			obj.setAssetClass(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctClssfctn")
	protected ProductClassification1Choice productClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProductClassification1Choice
	 * ProductClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
	 * Asset.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the classification of the derivative product."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractType5, Optional<ProductClassification1Choice>> mmProductClassification = new MMMessageAssociationEnd<ContractType5, Optional<ProductClassification1Choice>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "PdctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductClassification";
			definition = "Specifies the classification of the derivative product.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductClassification1Choice.mmObject();
		}

		@Override
		public Optional<ProductClassification1Choice> getValue(ContractType5 obj) {
			return obj.getProductClassification();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<ProductClassification1Choice> value) {
			obj.setProductClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctId")
	protected SecurityIdentification18Choice productIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification18Choice
	 * SecurityIdentification18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the identification of the derivative product."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractType5, Optional<SecurityIdentification18Choice>> mmProductIdentification = new MMMessageAssociationEnd<ContractType5, Optional<SecurityIdentification18Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "Specifies the identification of the derivative product.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification18Choice.mmObject();
		}

		@Override
		public Optional<SecurityIdentification18Choice> getValue(ContractType5 obj) {
			return obj.getProductIdentification();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<SecurityIdentification18Choice> value) {
			obj.setProductIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygAsst")
	protected SecurityIdentification19Choice underlyingAsset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
	 * SecurityIdentification19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygAsst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAsset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to identify the direct underlying asset based on its type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractType5, Optional<SecurityIdentification19Choice>> mmUnderlyingAsset = new MMMessageAssociationEnd<ContractType5, Optional<SecurityIdentification19Choice>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "UndrlygAsst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingAsset";
			definition = "Unique identification to identify the direct underlying asset based on its type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19Choice.mmObject();
		}

		@Override
		public Optional<SecurityIdentification19Choice> getValue(ContractType5 obj) {
			return obj.getUnderlyingAsset();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<SecurityIdentification19Choice> value) {
			obj.setUnderlyingAsset(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlCcyFrstLeg")
	protected ActiveOrHistoricCurrencyCode notionalCurrencyFirstLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmCurrency
	 * Leg.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcyFrstLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrencyFirstLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the notional amount. \r\n\r\nUsage: In the case of an interest rate or currency derivative contract, this will be the notional currency of first leg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractType5, Optional<ActiveOrHistoricCurrencyCode>> mmNotionalCurrencyFirstLeg = new MMMessageAttribute<ContractType5, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Leg.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcyFrstLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrencyFirstLeg";
			definition = "Currency of the notional amount. \r\n\r\nUsage: In the case of an interest rate or currency derivative contract, this will be the notional currency of first leg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(ContractType5 obj) {
			return obj.getNotionalCurrencyFirstLeg();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setNotionalCurrencyFirstLeg(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlCcyScndLeg")
	protected ActiveOrHistoricCurrencyCode notionalCurrencySecondLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmCurrency
	 * Leg.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcyScndLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrencySecondLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other currency of the notional amount. \r\n\r\nUsage: In the case of an interest rate or currency derivative contract, this will be the notional currency of the second leg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractType5, Optional<ActiveOrHistoricCurrencyCode>> mmNotionalCurrencySecondLeg = new MMMessageAttribute<ContractType5, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Leg.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcyScndLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrencySecondLeg";
			definition = "Other currency of the notional amount. \r\n\r\nUsage: In the case of an interest rate or currency derivative contract, this will be the notional currency of the second leg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(ContractType5 obj) {
			return obj.getNotionalCurrencySecondLeg();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setNotionalCurrencySecondLeg(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmCcy")
	protected ActiveOrHistoricCurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmCurrency
	 * Leg.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractType5 ContractType5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the currency to be delivered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractType5, Optional<ActiveOrHistoricCurrencyCode>> mmSettlementCurrency = new MMMessageAttribute<ContractType5, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Leg.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractType5.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(ContractType5 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(ContractType5 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setSettlementCurrency(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractType5.mmContractType, com.tools20022.repository.msg.ContractType5.mmAssetClass,
						com.tools20022.repository.msg.ContractType5.mmProductClassification, com.tools20022.repository.msg.ContractType5.mmProductIdentification, com.tools20022.repository.msg.ContractType5.mmUnderlyingAsset,
						com.tools20022.repository.msg.ContractType5.mmNotionalCurrencyFirstLeg, com.tools20022.repository.msg.ContractType5.mmNotionalCurrencySecondLeg, com.tools20022.repository.msg.ContractType5.mmSettlementCurrency);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ContractType5";
				definition = "Information related to contract attributes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentContractType2Code> getContractType() {
		return contractType == null ? Optional.empty() : Optional.of(contractType);
	}

	public ContractType5 setContractType(FinancialInstrumentContractType2Code contractType) {
		this.contractType = contractType;
		return this;
	}

	public Optional<ProductType4Code> getAssetClass() {
		return assetClass == null ? Optional.empty() : Optional.of(assetClass);
	}

	public ContractType5 setAssetClass(ProductType4Code assetClass) {
		this.assetClass = assetClass;
		return this;
	}

	public Optional<ProductClassification1Choice> getProductClassification() {
		return productClassification == null ? Optional.empty() : Optional.of(productClassification);
	}

	public ContractType5 setProductClassification(ProductClassification1Choice productClassification) {
		this.productClassification = productClassification;
		return this;
	}

	public Optional<SecurityIdentification18Choice> getProductIdentification() {
		return productIdentification == null ? Optional.empty() : Optional.of(productIdentification);
	}

	public ContractType5 setProductIdentification(SecurityIdentification18Choice productIdentification) {
		this.productIdentification = productIdentification;
		return this;
	}

	public Optional<SecurityIdentification19Choice> getUnderlyingAsset() {
		return underlyingAsset == null ? Optional.empty() : Optional.of(underlyingAsset);
	}

	public ContractType5 setUnderlyingAsset(SecurityIdentification19Choice underlyingAsset) {
		this.underlyingAsset = underlyingAsset;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getNotionalCurrencyFirstLeg() {
		return notionalCurrencyFirstLeg == null ? Optional.empty() : Optional.of(notionalCurrencyFirstLeg);
	}

	public ContractType5 setNotionalCurrencyFirstLeg(ActiveOrHistoricCurrencyCode notionalCurrencyFirstLeg) {
		this.notionalCurrencyFirstLeg = notionalCurrencyFirstLeg;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getNotionalCurrencySecondLeg() {
		return notionalCurrencySecondLeg == null ? Optional.empty() : Optional.of(notionalCurrencySecondLeg);
	}

	public ContractType5 setNotionalCurrencySecondLeg(ActiveOrHistoricCurrencyCode notionalCurrencySecondLeg) {
		this.notionalCurrencySecondLeg = notionalCurrencySecondLeg;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? Optional.empty() : Optional.of(settlementCurrency);
	}

	public ContractType5 setSettlementCurrency(ActiveOrHistoricCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
		return this;
	}
}