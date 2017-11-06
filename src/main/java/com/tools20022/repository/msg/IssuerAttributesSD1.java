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
import com.tools20022.repository.codeset.RegisteredNumberType1Code;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details of the issuer, as required by ASX.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1#mmPlaceAndName
 * IssuerAttributesSD1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerAttributesSD1#mmName
 * IssuerAttributesSD1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1#mmRegisteredNumberType
 * IssuerAttributesSD1.mmRegisteredNumberType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1#mmOtherRegisteredNumberType
 * IssuerAttributesSD1.mmOtherRegisteredNumberType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1#mmRegistrationNumber
 * IssuerAttributesSD1.mmRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1#mmIssuerIdentification
 * IssuerAttributesSD1.mmIssuerIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuerAttributesSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the issuer, as required by ASX."</li>
 * </ul>
 */
public class IssuerAttributesSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance.
	 * 
	 * In the case of XML, this is expressed by a valid XPath.<br>
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
	 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1
	 * IssuerAttributesSD1}</li>
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
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \n\nIn the case of XML, this is expressed by a valid XPath.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IssuerAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \n\nIn the case of XML, this is expressed by a valid XPath.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected RestrictedFINXMax140Text name;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax140Text
	 * RestrictedFINXMax140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1
	 * IssuerAttributesSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IssuerAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax140Text.mmObject();
		}
	};
	protected RegisteredNumberType1Code registeredNumberType;
	/**
	 * Registered number type of the entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
	 * RegisteredNumberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1
	 * IssuerAttributesSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdNbTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredNumberType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registered number type of the entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredNumberType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IssuerAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "RegdNbTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredNumberType";
			definition = "Registered number type of the entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RegisteredNumberType1Code.mmObject();
		}
	};
	protected Max35Text otherRegisteredNumberType;
	/**
	 * Other type of Registered Number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1
	 * IssuerAttributesSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRegdNbTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRegisteredNumberType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of Registered Number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherRegisteredNumberType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IssuerAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "OthrRegdNbTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRegisteredNumberType";
			definition = "Other type of Registered Number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max16Text registrationNumber;
	/**
	 * Equivalent, unique number of the entity for the Registered Number Type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1
	 * IssuerAttributesSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Equivalent, unique number of the entity for the  Registered Number Type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IssuerAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "RegnNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationNumber";
			definition = "Equivalent, unique number of the entity for the  Registered Number Type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Exact3UpperCaseAlphaNumericText issuerIdentification;
	/**
	 * ASX Issuer Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3UpperCaseAlphaNumericText
	 * Exact3UpperCaseAlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAttributesSD1
	 * IssuerAttributesSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ASX  Issuer Code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IssuerAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "IssrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerIdentification";
			definition = "ASX  Issuer Code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3UpperCaseAlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IssuerAttributesSD1.mmPlaceAndName, com.tools20022.repository.msg.IssuerAttributesSD1.mmName,
						com.tools20022.repository.msg.IssuerAttributesSD1.mmRegisteredNumberType, com.tools20022.repository.msg.IssuerAttributesSD1.mmOtherRegisteredNumberType,
						com.tools20022.repository.msg.IssuerAttributesSD1.mmRegistrationNumber, com.tools20022.repository.msg.IssuerAttributesSD1.mmIssuerIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IssuerAttributesSD1";
				definition = "Details of the issuer, as required by ASX.";
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

	public RestrictedFINXMax140Text getName() {
		return name;
	}

	public void setName(RestrictedFINXMax140Text name) {
		this.name = name;
	}

	public RegisteredNumberType1Code getRegisteredNumberType() {
		return registeredNumberType;
	}

	public void setRegisteredNumberType(RegisteredNumberType1Code registeredNumberType) {
		this.registeredNumberType = registeredNumberType;
	}

	public Max35Text getOtherRegisteredNumberType() {
		return otherRegisteredNumberType;
	}

	public void setOtherRegisteredNumberType(Max35Text otherRegisteredNumberType) {
		this.otherRegisteredNumberType = otherRegisteredNumberType;
	}

	public Max16Text getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Max16Text registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Exact3UpperCaseAlphaNumericText getIssuerIdentification() {
		return issuerIdentification;
	}

	public void setIssuerIdentification(Exact3UpperCaseAlphaNumericText issuerIdentification) {
		this.issuerIdentification = issuerIdentification;
	}
}