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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class WireInstructionSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice wireQuantity;
	/**
	 * Quantity of securities concerned in this wire.
	 * <p>
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
	public static final MMMessageAttribute mmWireQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "WireQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WireQuantity";
			definition = "Quantity of securities concerned in this wire.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected Max105Text bankName;
	/**
	 * Name of the recipient bank for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBankName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankName";
			definition = "Name of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected Max140Text bankAddress;
	/**
	 * Street address of the recipient bank for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBankAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankAddress";
			definition = "Street address of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max70Text bankCity;
	/**
	 * City of the recipient bank for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBankCity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkCity";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCity";
			definition = "City of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CountryCode bankCountry;
	/**
	 * Country of the recipient bank for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBankCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCountry";
			definition = "Country of the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max105Text bankAttentionTo;
	/**
	 * Responsible person in the recipient back for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBankAttentionTo = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkAttnTo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankAttentionTo";
			definition = "Responsible person in the recipient back for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected Max140Text bankComments;
	/**
	 * Notes or comments for the recipient bank for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBankComments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BkCmnts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankComments";
			definition = "Notes or comments for the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max70Text beneficiaryAccount;
	/**
	 * Account type at the recipient bank for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBeneficiaryAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccount";
			definition = "Account type at the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected RestrictedFINMax35Text beneficiaryAccountIdentification;
	/**
	 * Account identification at the recipient bank for the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBeneficiaryAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccountIdentification";
			definition = "Account identification at the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINMax35Text.mmObject();
		}
	};
	protected Max140Text beneficiaryAccountComments;
	/**
	 * Notes or comments for the beneficiary account at the recipient bank for
	 * the wire.
	 * <p>
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
	public static final MMMessageAttribute mmBeneficiaryAccountComments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> WireInstructionSD1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcctCmnts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccountComments";
			definition = "Notes or comments for the beneficiary account at the recipient bank for the wire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public FinancialInstrumentQuantity15Choice getWireQuantity() {
		return wireQuantity;
	}

	public void setWireQuantity(FinancialInstrumentQuantity15Choice wireQuantity) {
		this.wireQuantity = wireQuantity;
	}

	public Max105Text getBankName() {
		return bankName;
	}

	public void setBankName(Max105Text bankName) {
		this.bankName = bankName;
	}

	public Max140Text getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(Max140Text bankAddress) {
		this.bankAddress = bankAddress;
	}

	public Max70Text getBankCity() {
		return bankCity;
	}

	public void setBankCity(Max70Text bankCity) {
		this.bankCity = bankCity;
	}

	public CountryCode getBankCountry() {
		return bankCountry;
	}

	public void setBankCountry(CountryCode bankCountry) {
		this.bankCountry = bankCountry;
	}

	public Max105Text getBankAttentionTo() {
		return bankAttentionTo;
	}

	public void setBankAttentionTo(Max105Text bankAttentionTo) {
		this.bankAttentionTo = bankAttentionTo;
	}

	public Max140Text getBankComments() {
		return bankComments;
	}

	public void setBankComments(Max140Text bankComments) {
		this.bankComments = bankComments;
	}

	public Max70Text getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(Max70Text beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	public RestrictedFINMax35Text getBeneficiaryAccountIdentification() {
		return beneficiaryAccountIdentification;
	}

	public void setBeneficiaryAccountIdentification(RestrictedFINMax35Text beneficiaryAccountIdentification) {
		this.beneficiaryAccountIdentification = beneficiaryAccountIdentification;
	}

	public Max140Text getBeneficiaryAccountComments() {
		return beneficiaryAccountComments;
	}

	public void setBeneficiaryAccountComments(Max140Text beneficiaryAccountComments) {
		this.beneficiaryAccountComments = beneficiaryAccountComments;
	}
}