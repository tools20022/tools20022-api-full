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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AddressType2Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.MailingInstructions;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that locates and identifies a specific address, as defined by
 * postal services.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmAddressType
 * PostalAddress21.mmAddressType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmMailingIndicator
 * PostalAddress21.mmMailingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmRegistrationAddressIndicator
 * PostalAddress21.mmRegistrationAddressIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmCareOf
 * PostalAddress21.mmCareOf}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmAddressLine
 * PostalAddress21.mmAddressLine}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmStreetName
 * PostalAddress21.mmStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmBuildingNumber
 * PostalAddress21.mmBuildingNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmBuildingName
 * PostalAddress21.mmBuildingName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmPostBox
 * PostalAddress21.mmPostBox}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmSideInBuilding
 * PostalAddress21.mmSideInBuilding}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmFloor
 * PostalAddress21.mmFloor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmSuiteIdentification
 * PostalAddress21.mmSuiteIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmPostCode
 * PostalAddress21.mmPostCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmDistrictName
 * PostalAddress21.mmDistrictName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmVillage
 * PostalAddress21.mmVillage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmTownName
 * PostalAddress21.mmTownName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmState
 * PostalAddress21.mmState}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmCountry
 * PostalAddress21.mmCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PostalAddress
 * PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMailingIndicatorRule#forPostalAddress21
 * ConstraintMailingIndicatorRule.forPostalAddress21}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PostalAddress21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that locates and identifies a specific address, as defined by postal services."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PostalAddress3
 * PostalAddress3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PostalAddress21", propOrder = {"addressType", "mailingIndicator", "registrationAddressIndicator", "careOf", "addressLine", "streetName", "buildingNumber", "buildingName", "postBox", "sideInBuilding", "floor",
		"suiteIdentification", "postCode", "districtName", "village", "townName", "state", "country"})
public class PostalAddress21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AdrTp")
	protected AddressType2Choice addressType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AddressType2Choice
	 * AddressType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmAddressType
	 * PostalAddress.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3#mmAddressType
	 * PostalAddress3.mmAddressType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddressType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmAddressType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "AdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressType";
			definition = "Type of address.";
			previousVersion_lazy = () -> PostalAddress3.mmAddressType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AddressType2Choice.mmObject();
		}
	};
	@XmlElement(name = "MlngInd")
	protected YesNoIndicator mailingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmMailingIndicator
	 * MailingInstructions.mmMailingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MlngInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether mail should be sent to the address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3#mmMailingIndicator
	 * PostalAddress3.mmMailingIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMailingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MailingInstructions.mmMailingIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "MlngInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailingIndicator";
			definition = "Indicates whether mail should be sent to the address.";
			previousVersion_lazy = () -> PostalAddress3.mmMailingIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RegnAdrInd")
	protected YesNoIndicator registrationAddressIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRegistrationAddressIndicator
	 * MailingInstructions.mmRegistrationAddressIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnAdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the address is the official address of the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3#mmRegistrationAddressIndicator
	 * PostalAddress3.mmRegistrationAddressIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationAddressIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MailingInstructions.mmRegistrationAddressIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "RegnAdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator";
			definition = "Indicates whether the address is the official address of the party.";
			previousVersion_lazy = () -> PostalAddress3.mmRegistrationAddressIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CareOf")
	protected Max70Text careOf;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CareOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CareOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the individual resides at another person’s address, the name of the other person."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCareOf = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> GenericIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "CareOf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CareOf";
			definition = "When the individual resides at another person’s address, the name of the other person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "AdrLine")
	protected List<Max70Text> addressLine;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddressLine = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "AdrLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressLine";
			definition = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "StrtNm")
	protected Max70Text streetName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetName
	 * PostalAddress.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the street or thoroughfare."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStreetName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmStreetName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "StrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetName";
			definition = "Name of the street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "BldgNb")
	protected Max16Text buildingNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetBuildingIdentification
	 * PostalAddress.mmStreetBuildingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BldgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of the building on a street."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuildingNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmStreetBuildingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "BldgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuildingNumber";
			definition = "Number that identifies the position of the building on a street.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "BldgNm")
	protected Max35Text buildingName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmBuildingName
	 * PostalAddress.mmBuildingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BldgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the building or house."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuildingName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmBuildingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "BldgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PstBx")
	protected Max10Text postBox;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostOfficeBox
	 * PostalAddress.mmPostOfficeBox}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstBx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Post box number of the addressee within the residential or company building."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostBox = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmPostOfficeBox;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "PstBx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostBox";
			definition = "Post box number of the addressee within the residential or company building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	@XmlElement(name = "SdInBldg")
	protected Max35Text sideInBuilding;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmBuildingIdentification
	 * PostalAddress.mmBuildingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdInBldg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideInBuilding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Side or wing of the building, for example, ‘wing A’."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSideInBuilding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmBuildingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "SdInBldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideInBuilding";
			definition = "Side or wing of the building, for example, ‘wing A’.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Flr")
	protected Max70Text floor;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmFloor
	 * PostalAddress.mmFloor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Flr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Floor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor or storey within the building."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFloor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmFloor;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "Flr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Floor";
			definition = "Floor or storey within the building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "SuiteId")
	protected Max10Text suiteIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmSuiteIdentification
	 * PostalAddress.mmSuiteIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SuiteId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuiteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the suite or apartment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSuiteIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmSuiteIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "SuiteId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuiteIdentification";
			definition = "Identification of the suite or apartment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	@XmlElement(name = "PstCd")
	protected Max16Text postCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostCodeIdentification
	 * PostalAddress.mmPostCodeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmPostCodeIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "PstCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostCode";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "DstrctNm")
	protected Max35Text districtName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmDistrictName
	 * PostalAddress.mmDistrictName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistrictName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a district, that is, a part of the town or region."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDistrictName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmDistrictName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "DstrctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, that is, a part of the town or region.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Vllg")
	protected Max70Text village;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmTownName
	 * PostalAddress.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vllg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Village"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the village."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVillage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmTownName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "Vllg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Village";
			definition = "Name of the village.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "TwnNm")
	protected Max35Text townName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmTownName
	 * PostalAddress.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the town or city."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTownName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmTownName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "TwnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TownName";
			definition = "Name of the town or city.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Stat")
	protected Max70Text state;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmState
	 * PostalAddress.mmState}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "State"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the state, county or country sub-division."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmState = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmState;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "Stat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "State";
			definition = "Name of the state, county or country sub-division.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the address."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country of the address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress21.mmAddressType, com.tools20022.repository.msg.PostalAddress21.mmMailingIndicator,
						com.tools20022.repository.msg.PostalAddress21.mmRegistrationAddressIndicator, com.tools20022.repository.msg.PostalAddress21.mmCareOf, com.tools20022.repository.msg.PostalAddress21.mmAddressLine,
						com.tools20022.repository.msg.PostalAddress21.mmStreetName, com.tools20022.repository.msg.PostalAddress21.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress21.mmBuildingName,
						com.tools20022.repository.msg.PostalAddress21.mmPostBox, com.tools20022.repository.msg.PostalAddress21.mmSideInBuilding, com.tools20022.repository.msg.PostalAddress21.mmFloor,
						com.tools20022.repository.msg.PostalAddress21.mmSuiteIdentification, com.tools20022.repository.msg.PostalAddress21.mmPostCode, com.tools20022.repository.msg.PostalAddress21.mmDistrictName,
						com.tools20022.repository.msg.PostalAddress21.mmVillage, com.tools20022.repository.msg.PostalAddress21.mmTownName, com.tools20022.repository.msg.PostalAddress21.mmState,
						com.tools20022.repository.msg.PostalAddress21.mmCountry);
				trace_lazy = () -> PostalAddress.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMailingIndicatorRule.forPostalAddress21);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PostalAddress21";
				definition = "Information that locates and identifies a specific address, as defined by postal services.";
				previousVersion_lazy = () -> PostalAddress3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AddressType2Choice> getAddressType() {
		return addressType == null ? Optional.empty() : Optional.of(addressType);
	}

	public PostalAddress21 setAddressType(AddressType2Choice addressType) {
		this.addressType = addressType;
		return this;
	}

	public Optional<YesNoIndicator> getMailingIndicator() {
		return mailingIndicator == null ? Optional.empty() : Optional.of(mailingIndicator);
	}

	public PostalAddress21 setMailingIndicator(YesNoIndicator mailingIndicator) {
		this.mailingIndicator = mailingIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getRegistrationAddressIndicator() {
		return registrationAddressIndicator == null ? Optional.empty() : Optional.of(registrationAddressIndicator);
	}

	public PostalAddress21 setRegistrationAddressIndicator(YesNoIndicator registrationAddressIndicator) {
		this.registrationAddressIndicator = registrationAddressIndicator;
		return this;
	}

	public Optional<Max70Text> getCareOf() {
		return careOf == null ? Optional.empty() : Optional.of(careOf);
	}

	public PostalAddress21 setCareOf(Max70Text careOf) {
		this.careOf = careOf;
		return this;
	}

	public List<Max70Text> getAddressLine() {
		return addressLine == null ? addressLine = new ArrayList<>() : addressLine;
	}

	public PostalAddress21 setAddressLine(List<Max70Text> addressLine) {
		this.addressLine = Objects.requireNonNull(addressLine);
		return this;
	}

	public Optional<Max70Text> getStreetName() {
		return streetName == null ? Optional.empty() : Optional.of(streetName);
	}

	public PostalAddress21 setStreetName(Max70Text streetName) {
		this.streetName = streetName;
		return this;
	}

	public Optional<Max16Text> getBuildingNumber() {
		return buildingNumber == null ? Optional.empty() : Optional.of(buildingNumber);
	}

	public PostalAddress21 setBuildingNumber(Max16Text buildingNumber) {
		this.buildingNumber = buildingNumber;
		return this;
	}

	public Optional<Max35Text> getBuildingName() {
		return buildingName == null ? Optional.empty() : Optional.of(buildingName);
	}

	public PostalAddress21 setBuildingName(Max35Text buildingName) {
		this.buildingName = buildingName;
		return this;
	}

	public Optional<Max10Text> getPostBox() {
		return postBox == null ? Optional.empty() : Optional.of(postBox);
	}

	public PostalAddress21 setPostBox(Max10Text postBox) {
		this.postBox = postBox;
		return this;
	}

	public Optional<Max35Text> getSideInBuilding() {
		return sideInBuilding == null ? Optional.empty() : Optional.of(sideInBuilding);
	}

	public PostalAddress21 setSideInBuilding(Max35Text sideInBuilding) {
		this.sideInBuilding = sideInBuilding;
		return this;
	}

	public Optional<Max70Text> getFloor() {
		return floor == null ? Optional.empty() : Optional.of(floor);
	}

	public PostalAddress21 setFloor(Max70Text floor) {
		this.floor = floor;
		return this;
	}

	public Optional<Max10Text> getSuiteIdentification() {
		return suiteIdentification == null ? Optional.empty() : Optional.of(suiteIdentification);
	}

	public PostalAddress21 setSuiteIdentification(Max10Text suiteIdentification) {
		this.suiteIdentification = suiteIdentification;
		return this;
	}

	public Optional<Max16Text> getPostCode() {
		return postCode == null ? Optional.empty() : Optional.of(postCode);
	}

	public PostalAddress21 setPostCode(Max16Text postCode) {
		this.postCode = postCode;
		return this;
	}

	public Optional<Max35Text> getDistrictName() {
		return districtName == null ? Optional.empty() : Optional.of(districtName);
	}

	public PostalAddress21 setDistrictName(Max35Text districtName) {
		this.districtName = districtName;
		return this;
	}

	public Optional<Max70Text> getVillage() {
		return village == null ? Optional.empty() : Optional.of(village);
	}

	public PostalAddress21 setVillage(Max70Text village) {
		this.village = village;
		return this;
	}

	public Optional<Max35Text> getTownName() {
		return townName == null ? Optional.empty() : Optional.of(townName);
	}

	public PostalAddress21 setTownName(Max35Text townName) {
		this.townName = townName;
		return this;
	}

	public Optional<Max70Text> getState() {
		return state == null ? Optional.empty() : Optional.of(state);
	}

	public PostalAddress21 setState(Max70Text state) {
		this.state = state;
		return this;
	}

	public CountryCode getCountry() {
		return country;
	}

	public PostalAddress21 setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}
}