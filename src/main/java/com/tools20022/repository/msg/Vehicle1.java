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
import com.tools20022.repository.codeset.CardDataReading5Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to a vehicle used during a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmVehicleNumber
 * Vehicle1.mmVehicleNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmTrailerNumber
 * Vehicle1.mmTrailerNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmVehicleTag
 * Vehicle1.mmVehicleTag}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmVehicleTagEntryMode
 * Vehicle1.mmVehicleTagEntryMode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmUnitNumber
 * Vehicle1.mmUnitNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmReplacementCar
 * Vehicle1.mmReplacementCar}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmOdometer
 * Vehicle1.mmOdometer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmHubometer
 * Vehicle1.mmHubometer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmTrailerHours
 * Vehicle1.mmTrailerHours}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmReferHours
 * Vehicle1.mmReferHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Vehicle1#mmMaintenanceIdentification
 * Vehicle1.mmMaintenanceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle1#mmDriverOrVehicleCard
 * Vehicle1.mmDriverOrVehicleCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Vehicle1#mmAdditionalVehicleData
 * Vehicle1.mmAdditionalVehicleData}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Vehicle1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to a vehicle used during a transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Vehicle2 Vehicle2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Vehicle1", propOrder = {"vehicleNumber", "trailerNumber", "vehicleTag", "vehicleTagEntryMode", "unitNumber", "replacementCar", "odometer", "hubometer", "trailerHours", "referHours", "maintenanceIdentification",
		"driverOrVehicleCard", "additionalVehicleData"})
public class Vehicle1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VhclNb")
	protected Max35NumericText vehicleNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VhclNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VehicleNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned to the vehicle for identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVehicleNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "VhclNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VehicleNumber";
			definition = "Number assigned to the vehicle for identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	@XmlElement(name = "TrlrNb")
	protected Max35NumericText trailerNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrlrNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrailerNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to the vehicle trailer for identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrailerNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "TrlrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrailerNumber";
			definition = "Number assigned to the vehicle trailer for identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	@XmlElement(name = "VhclTag")
	protected Max35Text vehicleTag;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VhclTag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VehicleTag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration tag of the vehicle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVehicleTag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "VhclTag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VehicleTag";
			definition = "Registration tag of the vehicle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "VhclTagNtryMd")
	protected CardDataReading5Code vehicleTagEntryMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VhclTagNtryMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VehicleTagEntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry mode of the registration tag."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vehicle2#mmEntryMode
	 * Vehicle2.mmEntryMode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVehicleTagEntryMode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "VhclTagNtryMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VehicleTagEntryMode";
			definition = "Entry mode of the registration tag.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vehicle2.mmEntryMode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	@XmlElement(name = "UnitNb")
	protected Max35NumericText unitNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the vehicle in the fleet."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "UnitNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitNumber";
			definition = "Identification of the vehicle in the fleet.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	@XmlElement(name = "RplcmntCar")
	protected TrueFalseIndicator replacementCar;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RplcmntCar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementCar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True if the car is a replacement car."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReplacementCar = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "RplcmntCar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementCar";
			definition = "True if the car is a replacement car.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "Odmtr")
	protected DecimalNumber odometer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Odmtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Odometer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Odometer reading value indicating the distance travelled by the vehicle."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOdometer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "Odmtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Odometer";
			definition = "Odometer reading value indicating the distance travelled by the vehicle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "Hbmtr")
	protected DecimalNumber hubometer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hbmtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hubometer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hubometer reading value indicating the distance travelled by the trailer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHubometer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "Hbmtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hubometer";
			definition = "Hubometer reading value indicating the distance travelled by the trailer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "TrlrHrs")
	protected Max35Text trailerHours;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrlrHrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrailerHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of hours the trailer has been in operation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrailerHours = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "TrlrHrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrailerHours";
			definition = "Number of hours the trailer has been in operation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RefrHrs")
	protected Max35Text referHours;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefrHrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of hours the refer unit has been in operation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferHours = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "RefrHrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferHours";
			definition = "Number of hours the refer unit has been in operation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "MntncId")
	protected Max35Text maintenanceIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to the vehicle related to maintenance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaintenanceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "MntncId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceIdentification";
			definition = "Identification assigned to the vehicle related to maintenance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "DrvrOrVhclCard")
	protected PlainCardData17 driverOrVehicleCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData17
	 * PlainCardData17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrvrOrVhclCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverOrVehicleCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second card presented for the payment transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDriverOrVehicleCard = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "DrvrOrVhclCard";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverOrVehicleCard";
			definition = "Second card presented for the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlainCardData17.mmObject();
		}
	};
	@XmlElement(name = "AddtlVhclData")
	protected List<com.tools20022.repository.msg.Vehicle2> additionalVehicleData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Vehicle2 Vehicle2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vehicle1
	 * Vehicle1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlVhclData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalVehicleData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the vehicle."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vehicle2#mmData
	 * Vehicle2.mmData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalVehicleData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Vehicle1.mmObject();
			isDerived = false;
			xmlTag = "AddtlVhclData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalVehicleData";
			definition = "Additional information related to the vehicle.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vehicle2.mmData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Vehicle2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vehicle1.mmVehicleNumber, com.tools20022.repository.msg.Vehicle1.mmTrailerNumber, com.tools20022.repository.msg.Vehicle1.mmVehicleTag,
						com.tools20022.repository.msg.Vehicle1.mmVehicleTagEntryMode, com.tools20022.repository.msg.Vehicle1.mmUnitNumber, com.tools20022.repository.msg.Vehicle1.mmReplacementCar,
						com.tools20022.repository.msg.Vehicle1.mmOdometer, com.tools20022.repository.msg.Vehicle1.mmHubometer, com.tools20022.repository.msg.Vehicle1.mmTrailerHours, com.tools20022.repository.msg.Vehicle1.mmReferHours,
						com.tools20022.repository.msg.Vehicle1.mmMaintenanceIdentification, com.tools20022.repository.msg.Vehicle1.mmDriverOrVehicleCard, com.tools20022.repository.msg.Vehicle1.mmAdditionalVehicleData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Vehicle1";
				definition = "Information related to a vehicle used during a transaction.";
				nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vehicle2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35NumericText> getVehicleNumber() {
		return vehicleNumber == null ? Optional.empty() : Optional.of(vehicleNumber);
	}

	public Vehicle1 setVehicleNumber(Max35NumericText vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		return this;
	}

	public Optional<Max35NumericText> getTrailerNumber() {
		return trailerNumber == null ? Optional.empty() : Optional.of(trailerNumber);
	}

	public Vehicle1 setTrailerNumber(Max35NumericText trailerNumber) {
		this.trailerNumber = trailerNumber;
		return this;
	}

	public Optional<Max35Text> getVehicleTag() {
		return vehicleTag == null ? Optional.empty() : Optional.of(vehicleTag);
	}

	public Vehicle1 setVehicleTag(Max35Text vehicleTag) {
		this.vehicleTag = vehicleTag;
		return this;
	}

	public Optional<CardDataReading5Code> getVehicleTagEntryMode() {
		return vehicleTagEntryMode == null ? Optional.empty() : Optional.of(vehicleTagEntryMode);
	}

	public Vehicle1 setVehicleTagEntryMode(CardDataReading5Code vehicleTagEntryMode) {
		this.vehicleTagEntryMode = vehicleTagEntryMode;
		return this;
	}

	public Optional<Max35NumericText> getUnitNumber() {
		return unitNumber == null ? Optional.empty() : Optional.of(unitNumber);
	}

	public Vehicle1 setUnitNumber(Max35NumericText unitNumber) {
		this.unitNumber = unitNumber;
		return this;
	}

	public Optional<TrueFalseIndicator> getReplacementCar() {
		return replacementCar == null ? Optional.empty() : Optional.of(replacementCar);
	}

	public Vehicle1 setReplacementCar(TrueFalseIndicator replacementCar) {
		this.replacementCar = replacementCar;
		return this;
	}

	public Optional<DecimalNumber> getOdometer() {
		return odometer == null ? Optional.empty() : Optional.of(odometer);
	}

	public Vehicle1 setOdometer(DecimalNumber odometer) {
		this.odometer = odometer;
		return this;
	}

	public Optional<DecimalNumber> getHubometer() {
		return hubometer == null ? Optional.empty() : Optional.of(hubometer);
	}

	public Vehicle1 setHubometer(DecimalNumber hubometer) {
		this.hubometer = hubometer;
		return this;
	}

	public Optional<Max35Text> getTrailerHours() {
		return trailerHours == null ? Optional.empty() : Optional.of(trailerHours);
	}

	public Vehicle1 setTrailerHours(Max35Text trailerHours) {
		this.trailerHours = trailerHours;
		return this;
	}

	public Optional<Max35Text> getReferHours() {
		return referHours == null ? Optional.empty() : Optional.of(referHours);
	}

	public Vehicle1 setReferHours(Max35Text referHours) {
		this.referHours = referHours;
		return this;
	}

	public Optional<Max35Text> getMaintenanceIdentification() {
		return maintenanceIdentification == null ? Optional.empty() : Optional.of(maintenanceIdentification);
	}

	public Vehicle1 setMaintenanceIdentification(Max35Text maintenanceIdentification) {
		this.maintenanceIdentification = maintenanceIdentification;
		return this;
	}

	public Optional<PlainCardData17> getDriverOrVehicleCard() {
		return driverOrVehicleCard == null ? Optional.empty() : Optional.of(driverOrVehicleCard);
	}

	public Vehicle1 setDriverOrVehicleCard(com.tools20022.repository.msg.PlainCardData17 driverOrVehicleCard) {
		this.driverOrVehicleCard = driverOrVehicleCard;
		return this;
	}

	public List<Vehicle2> getAdditionalVehicleData() {
		return additionalVehicleData == null ? additionalVehicleData = new ArrayList<>() : additionalVehicleData;
	}

	public Vehicle1 setAdditionalVehicleData(List<com.tools20022.repository.msg.Vehicle2> additionalVehicleData) {
		this.additionalVehicleData = Objects.requireNonNull(additionalVehicleData);
		return this;
	}
}