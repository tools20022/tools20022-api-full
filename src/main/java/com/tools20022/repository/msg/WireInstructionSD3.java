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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max30Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max60Text;
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
 * Payment wire instruction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmPlaceAndName
 * WireInstructionSD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmWireQuantity
 * WireInstructionSD3.mmWireQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBankName
 * WireInstructionSD3.mmBankName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBankAddress
 * WireInstructionSD3.mmBankAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBankCity
 * WireInstructionSD3.mmBankCity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBankCountry
 * WireInstructionSD3.mmBankCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBankAttentionTo
 * WireInstructionSD3.mmBankAttentionTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBankComments
 * WireInstructionSD3.mmBankComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBeneficiaryAccount
 * WireInstructionSD3.mmBeneficiaryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBeneficiaryAccountIdentification
 * WireInstructionSD3.mmBeneficiaryAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3#mmBeneficiaryAccountComments
 * WireInstructionSD3.mmBeneficiaryAccountComments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WireInstructionSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment wire instruction details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2
 * WireInstructionSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "WireInstructionSD3", propOrder = {"placeAndName", "wireQuantity", "bankName", "bankAddress", "bankCity", "bankCountry", "bankAttentionTo", "bankComments", "beneficiaryAccount", "beneficiaryAccountIdentification",
		"beneficiaryAccountComments"})
public class WireInstructionSD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmPlaceAndName
	 * WireInstructionSD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<WireInstructionSD3, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> WireInstructionSD2.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(WireInstructionSD3 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "WireQty", required = true)
	protected FinancialInstrumentQuantity15Choice wireQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WireQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WireQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities concerned in this wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Wire Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmWireQuantity
	 * WireInstructionSD2.mmWireQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, FinancialInstrumentQuantity15Choice> mmWireQuantity = new MMMessageAttribute<WireInstructionSD3, FinancialInstrumentQuantity15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "WireQty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Wire Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WireQuantity";
			definition = "Quantity of securities concerned in this wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmWireQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity15Choice getValue(WireInstructionSD3 obj) {
			return obj.getWireQuantity();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, FinancialInstrumentQuantity15Choice value) {
			obj.setWireQuantity(value);
		}
	};
	@XmlElement(name = "BkNm", required = true)
	protected Max30Text bankName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the recipient bank for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Name</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBankName
	 * WireInstructionSD2.mmBankName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max30Text> mmBankName = new MMMessageAttribute<WireInstructionSD3, Max30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BkNm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Name"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankName";
			definition = "Name of the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBankName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Max30Text getValue(WireInstructionSD3 obj) {
			return obj.getBankName();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max30Text value) {
			obj.setBankName(value);
		}
	};
	@XmlElement(name = "BkAdr", required = true)
	protected Max30Text bankAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Street address of the recipient bank for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Address</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBankAddress
	 * WireInstructionSD2.mmBankAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max30Text> mmBankAddress = new MMMessageAttribute<WireInstructionSD3, Max30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BkAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Address"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankAddress";
			definition = "Street address of the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBankAddress;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Max30Text getValue(WireInstructionSD3 obj) {
			return obj.getBankAddress();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max30Text value) {
			obj.setBankAddress(value);
		}
	};
	@XmlElement(name = "BkCity", required = true)
	protected Max30Text bankCity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankCity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "City of the recipient bank for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank City</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBankCity
	 * WireInstructionSD2.mmBankCity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max30Text> mmBankCity = new MMMessageAttribute<WireInstructionSD3, Max30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BkCity";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank City"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCity";
			definition = "City of the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBankCity;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Max30Text getValue(WireInstructionSD3 obj) {
			return obj.getBankCity();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max30Text value) {
			obj.setBankCity(value);
		}
	};
	@XmlElement(name = "BkCtry", required = true)
	protected CountryCode bankCountry;
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
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the recipient bank for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Country</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBankCountry
	 * WireInstructionSD2.mmBankCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, CountryCode> mmBankCountry = new MMMessageAttribute<WireInstructionSD3, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BkCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Country"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCountry";
			definition = "Country of the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBankCountry;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(WireInstructionSD3 obj) {
			return obj.getBankCountry();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, CountryCode value) {
			obj.setBankCountry(value);
		}
	};
	@XmlElement(name = "BkAttnTo", required = true)
	protected Max30Text bankAttentionTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkAttnTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankAttentionTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Responsible person in the recipient back for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Attention To</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBankAttentionTo
	 * WireInstructionSD2.mmBankAttentionTo}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max30Text> mmBankAttentionTo = new MMMessageAttribute<WireInstructionSD3, Max30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BkAttnTo";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Attention To"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankAttentionTo";
			definition = "Responsible person in the recipient back for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBankAttentionTo;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Max30Text getValue(WireInstructionSD3 obj) {
			return obj.getBankAttentionTo();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max30Text value) {
			obj.setBankAttentionTo(value);
		}
	};
	@XmlElement(name = "BkCmnts", required = true)
	protected Max60Text bankComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max60Text
	 * Max60Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCmnts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notes or comments for the recipient bank for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Comments</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBankComments
	 * WireInstructionSD2.mmBankComments}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max60Text> mmBankComments = new MMMessageAttribute<WireInstructionSD3, Max60Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BkCmnts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Comments"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankComments";
			definition = "Notes or comments for the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBankComments;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max60Text.mmObject();
		}

		@Override
		public Max60Text getValue(WireInstructionSD3 obj) {
			return obj.getBankComments();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max60Text value) {
			obj.setBankComments(value);
		}
	};
	@XmlElement(name = "BnfcryAcct", required = true)
	protected Max30Text beneficiaryAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account type at the recipient bank for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficiary Account</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBeneficiaryAccount
	 * WireInstructionSD2.mmBeneficiaryAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max30Text> mmBeneficiaryAccount = new MMMessageAttribute<WireInstructionSD3, Max30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficiary Account"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccount";
			definition = "Account type at the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBeneficiaryAccount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Max30Text getValue(WireInstructionSD3 obj) {
			return obj.getBeneficiaryAccount();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max30Text value) {
			obj.setBeneficiaryAccount(value);
		}
	};
	@XmlElement(name = "BnfcryAcctId", required = true)
	protected Max30Text beneficiaryAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryAcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification at the recipient bank for the wire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficiary Account ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBeneficiaryAccountIdentification
	 * WireInstructionSD2.mmBeneficiaryAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max30Text> mmBeneficiaryAccountIdentification = new MMMessageAttribute<WireInstructionSD3, Max30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcctId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficiary Account ID "));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccountIdentification";
			definition = "Account identification at the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBeneficiaryAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Max30Text getValue(WireInstructionSD3 obj) {
			return obj.getBeneficiaryAccountIdentification();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max30Text value) {
			obj.setBeneficiaryAccountIdentification(value);
		}
	};
	@XmlElement(name = "BnfcryAcctCmnts", required = true)
	protected Max30Text beneficiaryAccountComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD3
	 * WireInstructionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryAcctCmnts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryAccountComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notes or comments for the beneficiary account at the recipient bank for the wire."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficiary Account Comments</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD2#mmBeneficiaryAccountComments
	 * WireInstructionSD2.mmBeneficiaryAccountComments}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD3, Max30Text> mmBeneficiaryAccountComments = new MMMessageAttribute<WireInstructionSD3, Max30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD3.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcctCmnts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficiary Account Comments"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccountComments";
			definition = "Notes or comments for the beneficiary account at the recipient bank for the wire.";
			previousVersion_lazy = () -> WireInstructionSD2.mmBeneficiaryAccountComments;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Max30Text getValue(WireInstructionSD3 obj) {
			return obj.getBeneficiaryAccountComments();
		}

		@Override
		public void setValue(WireInstructionSD3 obj, Max30Text value) {
			obj.setBeneficiaryAccountComments(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.WireInstructionSD3.mmPlaceAndName, com.tools20022.repository.msg.WireInstructionSD3.mmWireQuantity,
						com.tools20022.repository.msg.WireInstructionSD3.mmBankName, com.tools20022.repository.msg.WireInstructionSD3.mmBankAddress, com.tools20022.repository.msg.WireInstructionSD3.mmBankCity,
						com.tools20022.repository.msg.WireInstructionSD3.mmBankCountry, com.tools20022.repository.msg.WireInstructionSD3.mmBankAttentionTo, com.tools20022.repository.msg.WireInstructionSD3.mmBankComments,
						com.tools20022.repository.msg.WireInstructionSD3.mmBeneficiaryAccount, com.tools20022.repository.msg.WireInstructionSD3.mmBeneficiaryAccountIdentification,
						com.tools20022.repository.msg.WireInstructionSD3.mmBeneficiaryAccountComments);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WireInstructionSD3";
				definition = "Payment wire instruction details.";
				previousVersion_lazy = () -> WireInstructionSD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public WireInstructionSD3 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getWireQuantity() {
		return wireQuantity;
	}

	public WireInstructionSD3 setWireQuantity(FinancialInstrumentQuantity15Choice wireQuantity) {
		this.wireQuantity = Objects.requireNonNull(wireQuantity);
		return this;
	}

	public Max30Text getBankName() {
		return bankName;
	}

	public WireInstructionSD3 setBankName(Max30Text bankName) {
		this.bankName = Objects.requireNonNull(bankName);
		return this;
	}

	public Max30Text getBankAddress() {
		return bankAddress;
	}

	public WireInstructionSD3 setBankAddress(Max30Text bankAddress) {
		this.bankAddress = Objects.requireNonNull(bankAddress);
		return this;
	}

	public Max30Text getBankCity() {
		return bankCity;
	}

	public WireInstructionSD3 setBankCity(Max30Text bankCity) {
		this.bankCity = Objects.requireNonNull(bankCity);
		return this;
	}

	public CountryCode getBankCountry() {
		return bankCountry;
	}

	public WireInstructionSD3 setBankCountry(CountryCode bankCountry) {
		this.bankCountry = Objects.requireNonNull(bankCountry);
		return this;
	}

	public Max30Text getBankAttentionTo() {
		return bankAttentionTo;
	}

	public WireInstructionSD3 setBankAttentionTo(Max30Text bankAttentionTo) {
		this.bankAttentionTo = Objects.requireNonNull(bankAttentionTo);
		return this;
	}

	public Max60Text getBankComments() {
		return bankComments;
	}

	public WireInstructionSD3 setBankComments(Max60Text bankComments) {
		this.bankComments = Objects.requireNonNull(bankComments);
		return this;
	}

	public Max30Text getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public WireInstructionSD3 setBeneficiaryAccount(Max30Text beneficiaryAccount) {
		this.beneficiaryAccount = Objects.requireNonNull(beneficiaryAccount);
		return this;
	}

	public Max30Text getBeneficiaryAccountIdentification() {
		return beneficiaryAccountIdentification;
	}

	public WireInstructionSD3 setBeneficiaryAccountIdentification(Max30Text beneficiaryAccountIdentification) {
		this.beneficiaryAccountIdentification = Objects.requireNonNull(beneficiaryAccountIdentification);
		return this;
	}

	public Max30Text getBeneficiaryAccountComments() {
		return beneficiaryAccountComments;
	}

	public WireInstructionSD3 setBeneficiaryAccountComments(Max30Text beneficiaryAccountComments) {
		this.beneficiaryAccountComments = Objects.requireNonNull(beneficiaryAccountComments);
		return this;
	}
}