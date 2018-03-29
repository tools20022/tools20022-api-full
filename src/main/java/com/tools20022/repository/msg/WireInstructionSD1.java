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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmPlaceAndName
 * WireInstructionSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmWireQuantity
 * WireInstructionSD1.mmWireQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBankName
 * WireInstructionSD1.mmBankName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBankAddress
 * WireInstructionSD1.mmBankAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBankCity
 * WireInstructionSD1.mmBankCity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBankCountry
 * WireInstructionSD1.mmBankCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBankAttentionTo
 * WireInstructionSD1.mmBankAttentionTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBankComments
 * WireInstructionSD1.mmBankComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBeneficiaryAccount
 * WireInstructionSD1.mmBeneficiaryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBeneficiaryAccountIdentification
 * WireInstructionSD1.mmBeneficiaryAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1#mmBeneficiaryAccountComments
 * WireInstructionSD1.mmBeneficiaryAccountComments}</li>
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
 * "WireInstructionSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment wire instruction details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.WireInstructionSD2
 * WireInstructionSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "WireInstructionSD1", propOrder = {"placeAndName", "wireQuantity", "bankName", "bankAddress", "bankCity", "bankCountry", "bankAttentionTo", "bankComments", "beneficiaryAccount", "beneficiaryAccountIdentification",
		"beneficiaryAccountComments"})
public class WireInstructionSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<WireInstructionSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(WireInstructionSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
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
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WireQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Wire Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WireQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities concerned in this wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, FinancialInstrumentQuantity15Choice> mmWireQuantity = new MMMessageAttribute<WireInstructionSD1, FinancialInstrumentQuantity15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "WireQty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Wire Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WireQuantity";
			definition = "Quantity of securities concerned in this wire.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity15Choice getValue(WireInstructionSD1 obj) {
			return obj.getWireQuantity();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, FinancialInstrumentQuantity15Choice value) {
			obj.setWireQuantity(value);
		}
	};
	@XmlElement(name = "BkNm", required = true)
	protected Max105Text bankName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Name</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the recipient bank for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max105Text> mmBankName = new MMMessageAttribute<WireInstructionSD1, Max105Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkNm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Name"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankName";
			definition = "Name of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Max105Text getValue(WireInstructionSD1 obj) {
			return obj.getBankName();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max105Text value) {
			obj.setBankName(value);
		}
	};
	@XmlElement(name = "BkAdr", required = true)
	protected Max140Text bankAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Address</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Street address of the recipient bank for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max140Text> mmBankAddress = new MMMessageAttribute<WireInstructionSD1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Address"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankAddress";
			definition = "Street address of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(WireInstructionSD1 obj) {
			return obj.getBankAddress();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max140Text value) {
			obj.setBankAddress(value);
		}
	};
	@XmlElement(name = "BkCity", required = true)
	protected Max70Text bankCity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank City</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankCity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "City of the recipient bank for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max70Text> mmBankCity = new MMMessageAttribute<WireInstructionSD1, Max70Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkCity";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank City"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCity";
			definition = "City of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(WireInstructionSD1 obj) {
			return obj.getBankCity();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max70Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Country</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the recipient bank for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, CountryCode> mmBankCountry = new MMMessageAttribute<WireInstructionSD1, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Country"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCountry";
			definition = "Country of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(WireInstructionSD1 obj) {
			return obj.getBankCountry();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, CountryCode value) {
			obj.setBankCountry(value);
		}
	};
	@XmlElement(name = "BkAttnTo", required = true)
	protected Max105Text bankAttentionTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkAttnTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Attention To</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankAttentionTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Responsible person in the recipient back for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max105Text> mmBankAttentionTo = new MMMessageAttribute<WireInstructionSD1, Max105Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkAttnTo";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Attention To"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankAttentionTo";
			definition = "Responsible person in the recipient back for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Max105Text getValue(WireInstructionSD1 obj) {
			return obj.getBankAttentionTo();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max105Text value) {
			obj.setBankAttentionTo(value);
		}
	};
	@XmlElement(name = "BkCmnts", required = true)
	protected Max140Text bankComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Bank Comments</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notes or comments for the recipient bank for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max140Text> mmBankComments = new MMMessageAttribute<WireInstructionSD1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkCmnts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Bank Comments"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankComments";
			definition = "Notes or comments for the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(WireInstructionSD1 obj) {
			return obj.getBankComments();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max140Text value) {
			obj.setBankComments(value);
		}
	};
	@XmlElement(name = "BnfcryAcct", required = true)
	protected Max70Text beneficiaryAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficiary Account</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account type at the recipient bank for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max70Text> mmBeneficiaryAccount = new MMMessageAttribute<WireInstructionSD1, Max70Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficiary Account"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccount";
			definition = "Account type at the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(WireInstructionSD1 obj) {
			return obj.getBeneficiaryAccount();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max70Text value) {
			obj.setBeneficiaryAccount(value);
		}
	};
	@XmlElement(name = "BnfcryAcctId", required = true)
	protected RestrictedFINMax35Text beneficiaryAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax35Text
	 * RestrictedFINMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficiary Account ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification at the recipient bank for the wire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, RestrictedFINMax35Text> mmBeneficiaryAccountIdentification = new MMMessageAttribute<WireInstructionSD1, RestrictedFINMax35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcctId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficiary Account ID "));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccountIdentification";
			definition = "Account identification at the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINMax35Text.mmObject();
		}

		@Override
		public RestrictedFINMax35Text getValue(WireInstructionSD1 obj) {
			return obj.getBeneficiaryAccountIdentification();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, RestrictedFINMax35Text value) {
			obj.setBeneficiaryAccountIdentification(value);
		}
	};
	@XmlElement(name = "BnfcryAcctCmnts", required = true)
	protected Max140Text beneficiaryAccountComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryAcctCmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficiary Account Comments</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryAccountComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notes or comments for the beneficiary account at the recipient bank for the wire."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WireInstructionSD1, Max140Text> mmBeneficiaryAccountComments = new MMMessageAttribute<WireInstructionSD1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcctCmnts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficiary Account Comments"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccountComments";
			definition = "Notes or comments for the beneficiary account at the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(WireInstructionSD1 obj) {
			return obj.getBeneficiaryAccountComments();
		}

		@Override
		public void setValue(WireInstructionSD1 obj, Max140Text value) {
			obj.setBeneficiaryAccountComments(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.WireInstructionSD1.mmPlaceAndName, com.tools20022.repository.msg.WireInstructionSD1.mmWireQuantity,
						com.tools20022.repository.msg.WireInstructionSD1.mmBankName, com.tools20022.repository.msg.WireInstructionSD1.mmBankAddress, com.tools20022.repository.msg.WireInstructionSD1.mmBankCity,
						com.tools20022.repository.msg.WireInstructionSD1.mmBankCountry, com.tools20022.repository.msg.WireInstructionSD1.mmBankAttentionTo, com.tools20022.repository.msg.WireInstructionSD1.mmBankComments,
						com.tools20022.repository.msg.WireInstructionSD1.mmBeneficiaryAccount, com.tools20022.repository.msg.WireInstructionSD1.mmBeneficiaryAccountIdentification,
						com.tools20022.repository.msg.WireInstructionSD1.mmBeneficiaryAccountComments);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "WireInstructionSD1";
				definition = "Payment wire instruction details.";
				nextVersions_lazy = () -> Arrays.asList(WireInstructionSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public WireInstructionSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public FinancialInstrumentQuantity15Choice getWireQuantity() {
		return wireQuantity;
	}

	public WireInstructionSD1 setWireQuantity(FinancialInstrumentQuantity15Choice wireQuantity) {
		this.wireQuantity = Objects.requireNonNull(wireQuantity);
		return this;
	}

	public Max105Text getBankName() {
		return bankName;
	}

	public WireInstructionSD1 setBankName(Max105Text bankName) {
		this.bankName = Objects.requireNonNull(bankName);
		return this;
	}

	public Max140Text getBankAddress() {
		return bankAddress;
	}

	public WireInstructionSD1 setBankAddress(Max140Text bankAddress) {
		this.bankAddress = Objects.requireNonNull(bankAddress);
		return this;
	}

	public Max70Text getBankCity() {
		return bankCity;
	}

	public WireInstructionSD1 setBankCity(Max70Text bankCity) {
		this.bankCity = Objects.requireNonNull(bankCity);
		return this;
	}

	public CountryCode getBankCountry() {
		return bankCountry;
	}

	public WireInstructionSD1 setBankCountry(CountryCode bankCountry) {
		this.bankCountry = Objects.requireNonNull(bankCountry);
		return this;
	}

	public Max105Text getBankAttentionTo() {
		return bankAttentionTo;
	}

	public WireInstructionSD1 setBankAttentionTo(Max105Text bankAttentionTo) {
		this.bankAttentionTo = Objects.requireNonNull(bankAttentionTo);
		return this;
	}

	public Max140Text getBankComments() {
		return bankComments;
	}

	public WireInstructionSD1 setBankComments(Max140Text bankComments) {
		this.bankComments = Objects.requireNonNull(bankComments);
		return this;
	}

	public Max70Text getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public WireInstructionSD1 setBeneficiaryAccount(Max70Text beneficiaryAccount) {
		this.beneficiaryAccount = Objects.requireNonNull(beneficiaryAccount);
		return this;
	}

	public RestrictedFINMax35Text getBeneficiaryAccountIdentification() {
		return beneficiaryAccountIdentification;
	}

	public WireInstructionSD1 setBeneficiaryAccountIdentification(RestrictedFINMax35Text beneficiaryAccountIdentification) {
		this.beneficiaryAccountIdentification = Objects.requireNonNull(beneficiaryAccountIdentification);
		return this;
	}

	public Max140Text getBeneficiaryAccountComments() {
		return beneficiaryAccountComments;
	}

	public WireInstructionSD1 setBeneficiaryAccountComments(Max140Text beneficiaryAccountComments) {
		this.beneficiaryAccountComments = Objects.requireNonNull(beneficiaryAccountComments);
		return this;
	}
}