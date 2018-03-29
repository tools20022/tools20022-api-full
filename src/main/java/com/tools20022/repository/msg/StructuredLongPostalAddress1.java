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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PostalAddress;
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
 * Address of a party expressed in a formal structure, usually according to the
 * country's postal services specifications.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmBuildingName
 * StructuredLongPostalAddress1.mmBuildingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmStreetName
 * StructuredLongPostalAddress1.mmStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmStreetBuildingIdentification
 * StructuredLongPostalAddress1.mmStreetBuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmFloor
 * StructuredLongPostalAddress1.mmFloor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmTownName
 * StructuredLongPostalAddress1.mmTownName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmDistrictName
 * StructuredLongPostalAddress1.mmDistrictName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmRegionIdentification
 * StructuredLongPostalAddress1.mmRegionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmState
 * StructuredLongPostalAddress1.mmState}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmCountyIdentification
 * StructuredLongPostalAddress1.mmCountyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmCountry
 * StructuredLongPostalAddress1.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmPostCodeIdentification
 * StructuredLongPostalAddress1.mmPostCodeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmPostOfficeBox
 * StructuredLongPostalAddress1.mmPostOfficeBox}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintStreetNameAndOrPostOfficeBoxRule#forStructuredLongPostalAddress1
 * ConstraintStreetNameAndOrPostOfficeBoxRule.forStructuredLongPostalAddress1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StructuredLongPostalAddress1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Address of a party expressed in a formal structure, usually according to the country's postal services specifications."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StructuredLongPostalAddress1", propOrder = {"buildingName", "streetName", "streetBuildingIdentification", "floor", "townName", "districtName", "regionIdentification", "state", "countyIdentification", "country",
		"postCodeIdentification", "postOfficeBox"})
public class StructuredLongPostalAddress1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
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
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>> mmBuildingName = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmBuildingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "BldgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getBuildingName();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max35Text> value) {
			obj.setBuildingName(value.orElse(null));
		}
	};
	@XmlElement(name = "StrtNm")
	protected Max35Text streetName;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetName
	 * PostalAddress.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
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
	 * definition} = "Name of a street or thoroughfare."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>> mmStreetName = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmStreetName;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "StrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getStreetName();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max35Text> value) {
			obj.setStreetName(value.orElse(null));
		}
	};
	@XmlElement(name = "StrtBldgId")
	protected Max35Text streetBuildingIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetBuildingIdentification
	 * PostalAddress.mmStreetBuildingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtBldgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetBuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>> mmStreetBuildingIdentification = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmStreetBuildingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "StrtBldgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetBuildingIdentification";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getStreetBuildingIdentification();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max35Text> value) {
			obj.setStreetBuildingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Flr")
	protected Max16Text floor;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmFloor
	 * PostalAddress.mmFloor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
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
	 * definition} = "Floor or storey within a building."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max16Text>> mmFloor = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max16Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmFloor;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "Flr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Floor";
			definition = "Floor or storey within a building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getFloor();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max16Text> value) {
			obj.setFloor(value.orElse(null));
		}
	};
	@XmlElement(name = "TwnNm", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
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
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Max35Text> mmTownName = new MMMessageAttribute<StructuredLongPostalAddress1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmTownName;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "TwnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StructuredLongPostalAddress1 obj) {
			return obj.getTownName();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Max35Text value) {
			obj.setTownName(value);
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
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
	 * definition} = "Name of a district, ie, a part of a town or region."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>> mmDistrictName = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmDistrictName;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "DstrctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, ie, a part of a town or region.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getDistrictName();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max35Text> value) {
			obj.setDistrictName(value.orElse(null));
		}
	};
	@XmlElement(name = "RgnId")
	protected Max35Text regionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmRegionIdentification
	 * PostalAddress.mmRegionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an administrative division of a country, state, or territory."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>> mmRegionIdentification = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmRegionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "RgnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionIdentification";
			definition = "Identification of an administrative division of a country, state, or territory.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getRegionIdentification();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max35Text> value) {
			obj.setRegionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Stat")
	protected Max35Text state;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmState
	 * PostalAddress.mmState}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
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
	 * definition} =
	 * "Organised political community or area forming a part of a federation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>> mmState = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmState;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "Stat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "State";
			definition = "Organised political community or area forming a part of a federation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getState();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max35Text> value) {
			obj.setState(value.orElse(null));
		}
	};
	@XmlElement(name = "CtyId")
	protected Max35Text countyIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountyIdentification
	 * PostalAddress.mmCountyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a county."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>> mmCountyIdentification = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountyIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "CtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountyIdentification";
			definition = "Identifier of a county.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getCountyIdentification();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max35Text> value) {
			obj.setCountyIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
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
	 * definition} = "Nation with its own government."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, CountryCode> mmCountry = new MMMessageAttribute<StructuredLongPostalAddress1, CountryCode>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Nation with its own government.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(StructuredLongPostalAddress1 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, CountryCode value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "PstCdId", required = true)
	protected Max16Text postCodeIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstCdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCodeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Max16Text> mmPostCodeIdentification = new MMMessageAttribute<StructuredLongPostalAddress1, Max16Text>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmPostCodeIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "PstCdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostCodeIdentification";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(StructuredLongPostalAddress1 obj) {
			return obj.getPostCodeIdentification();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Max16Text value) {
			obj.setPostCodeIdentification(value);
		}
	};
	@XmlElement(name = "POB")
	protected Max16Text postOfficeBox;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostOfficeBox
	 * PostalAddress.mmPostOfficeBox}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
	 * StructuredLongPostalAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostOfficeBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max16Text>> mmPostOfficeBox = new MMMessageAttribute<StructuredLongPostalAddress1, Optional<Max16Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmPostOfficeBox;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredLongPostalAddress1.mmObject();
			isDerived = false;
			xmlTag = "POB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostOfficeBox";
			definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(StructuredLongPostalAddress1 obj) {
			return obj.getPostOfficeBox();
		}

		@Override
		public void setValue(StructuredLongPostalAddress1 obj, Optional<Max16Text> value) {
			obj.setPostOfficeBox(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.mmBuildingName, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmStreetName,
						com.tools20022.repository.msg.StructuredLongPostalAddress1.mmStreetBuildingIdentification, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmFloor,
						com.tools20022.repository.msg.StructuredLongPostalAddress1.mmTownName, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmDistrictName,
						com.tools20022.repository.msg.StructuredLongPostalAddress1.mmRegionIdentification, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmState,
						com.tools20022.repository.msg.StructuredLongPostalAddress1.mmCountyIdentification, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmCountry,
						com.tools20022.repository.msg.StructuredLongPostalAddress1.mmPostCodeIdentification, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmPostOfficeBox);
				trace_lazy = () -> PostalAddress.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStreetNameAndOrPostOfficeBoxRule.forStructuredLongPostalAddress1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StructuredLongPostalAddress1";
				definition = "Address of a party expressed in a formal structure, usually according to the country's postal services specifications.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getBuildingName() {
		return buildingName == null ? Optional.empty() : Optional.of(buildingName);
	}

	public StructuredLongPostalAddress1 setBuildingName(Max35Text buildingName) {
		this.buildingName = buildingName;
		return this;
	}

	public Optional<Max35Text> getStreetName() {
		return streetName == null ? Optional.empty() : Optional.of(streetName);
	}

	public StructuredLongPostalAddress1 setStreetName(Max35Text streetName) {
		this.streetName = streetName;
		return this;
	}

	public Optional<Max35Text> getStreetBuildingIdentification() {
		return streetBuildingIdentification == null ? Optional.empty() : Optional.of(streetBuildingIdentification);
	}

	public StructuredLongPostalAddress1 setStreetBuildingIdentification(Max35Text streetBuildingIdentification) {
		this.streetBuildingIdentification = streetBuildingIdentification;
		return this;
	}

	public Optional<Max16Text> getFloor() {
		return floor == null ? Optional.empty() : Optional.of(floor);
	}

	public StructuredLongPostalAddress1 setFloor(Max16Text floor) {
		this.floor = floor;
		return this;
	}

	public Max35Text getTownName() {
		return townName;
	}

	public StructuredLongPostalAddress1 setTownName(Max35Text townName) {
		this.townName = Objects.requireNonNull(townName);
		return this;
	}

	public Optional<Max35Text> getDistrictName() {
		return districtName == null ? Optional.empty() : Optional.of(districtName);
	}

	public StructuredLongPostalAddress1 setDistrictName(Max35Text districtName) {
		this.districtName = districtName;
		return this;
	}

	public Optional<Max35Text> getRegionIdentification() {
		return regionIdentification == null ? Optional.empty() : Optional.of(regionIdentification);
	}

	public StructuredLongPostalAddress1 setRegionIdentification(Max35Text regionIdentification) {
		this.regionIdentification = regionIdentification;
		return this;
	}

	public Optional<Max35Text> getState() {
		return state == null ? Optional.empty() : Optional.of(state);
	}

	public StructuredLongPostalAddress1 setState(Max35Text state) {
		this.state = state;
		return this;
	}

	public Optional<Max35Text> getCountyIdentification() {
		return countyIdentification == null ? Optional.empty() : Optional.of(countyIdentification);
	}

	public StructuredLongPostalAddress1 setCountyIdentification(Max35Text countyIdentification) {
		this.countyIdentification = countyIdentification;
		return this;
	}

	public CountryCode getCountry() {
		return country;
	}

	public StructuredLongPostalAddress1 setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public Max16Text getPostCodeIdentification() {
		return postCodeIdentification;
	}

	public StructuredLongPostalAddress1 setPostCodeIdentification(Max16Text postCodeIdentification) {
		this.postCodeIdentification = Objects.requireNonNull(postCodeIdentification);
		return this;
	}

	public Optional<Max16Text> getPostOfficeBox() {
		return postOfficeBox == null ? Optional.empty() : Optional.of(postOfficeBox);
	}

	public StructuredLongPostalAddress1 setPostOfficeBox(Max16Text postOfficeBox) {
		this.postOfficeBox = postOfficeBox;
		return this;
	}
}