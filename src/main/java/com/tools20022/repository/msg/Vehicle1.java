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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class Vehicle1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35NumericText vehicleNumber;
	/**
	 * Number assigned to the vehicle for identification.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected Max35NumericText trailerNumber;
	/**
	 * Number assigned to the vehicle trailer for identification.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected Max35Text vehicleTag;
	/**
	 * Registration tag of the vehicle.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected CardDataReading5Code vehicleTagEntryMode;
	/**
	 * Entry mode of the registration tag.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected Max35NumericText unitNumber;
	/**
	 * Identification of the vehicle in the fleet.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected TrueFalseIndicator replacementCar;
	/**
	 * True if the car is a replacement car.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected DecimalNumber odometer;
	/**
	 * Odometer reading value indicating the distance travelled by the vehicle.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected DecimalNumber hubometer;
	/**
	 * Hubometer reading value indicating the distance travelled by the trailer.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected Max35Text trailerHours;
	/**
	 * Number of hours the trailer has been in operation.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected Max35Text referHours;
	/**
	 * Number of hours the refer unit has been in operation.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected Max35Text maintenanceIdentification;
	/**
	 * Identification assigned to the vehicle related to maintenance.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected PlainCardData17 driverOrVehicleCard;
	/**
	 * Second card presented for the payment transaction.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
	protected List<com.tools20022.repository.msg.Vehicle2> additionalVehicleData;
	/**
	 * Additional information related to the vehicle.
	 * <p>
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
			componentContext_lazy = () -> Vehicle1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(Vehicle1.mmVehicleNumber, Vehicle1.mmTrailerNumber, Vehicle1.mmVehicleTag, Vehicle1.mmVehicleTagEntryMode, Vehicle1.mmUnitNumber, Vehicle1.mmReplacementCar, Vehicle1.mmOdometer,
						Vehicle1.mmHubometer, Vehicle1.mmTrailerHours, Vehicle1.mmReferHours, Vehicle1.mmMaintenanceIdentification, Vehicle1.mmDriverOrVehicleCard, Vehicle1.mmAdditionalVehicleData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Vehicle1";
				definition = "Information related to a vehicle used during a transaction.";
				nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vehicle2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35NumericText getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(Max35NumericText vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Max35NumericText getTrailerNumber() {
		return trailerNumber;
	}

	public void setTrailerNumber(Max35NumericText trailerNumber) {
		this.trailerNumber = trailerNumber;
	}

	public Max35Text getVehicleTag() {
		return vehicleTag;
	}

	public void setVehicleTag(Max35Text vehicleTag) {
		this.vehicleTag = vehicleTag;
	}

	public CardDataReading5Code getVehicleTagEntryMode() {
		return vehicleTagEntryMode;
	}

	public void setVehicleTagEntryMode(CardDataReading5Code vehicleTagEntryMode) {
		this.vehicleTagEntryMode = vehicleTagEntryMode;
	}

	public Max35NumericText getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(Max35NumericText unitNumber) {
		this.unitNumber = unitNumber;
	}

	public TrueFalseIndicator getReplacementCar() {
		return replacementCar;
	}

	public void setReplacementCar(TrueFalseIndicator replacementCar) {
		this.replacementCar = replacementCar;
	}

	public DecimalNumber getOdometer() {
		return odometer;
	}

	public void setOdometer(DecimalNumber odometer) {
		this.odometer = odometer;
	}

	public DecimalNumber getHubometer() {
		return hubometer;
	}

	public void setHubometer(DecimalNumber hubometer) {
		this.hubometer = hubometer;
	}

	public Max35Text getTrailerHours() {
		return trailerHours;
	}

	public void setTrailerHours(Max35Text trailerHours) {
		this.trailerHours = trailerHours;
	}

	public Max35Text getReferHours() {
		return referHours;
	}

	public void setReferHours(Max35Text referHours) {
		this.referHours = referHours;
	}

	public Max35Text getMaintenanceIdentification() {
		return maintenanceIdentification;
	}

	public void setMaintenanceIdentification(Max35Text maintenanceIdentification) {
		this.maintenanceIdentification = maintenanceIdentification;
	}

	public PlainCardData17 getDriverOrVehicleCard() {
		return driverOrVehicleCard;
	}

	public void setDriverOrVehicleCard(com.tools20022.repository.msg.PlainCardData17 driverOrVehicleCard) {
		this.driverOrVehicleCard = driverOrVehicleCard;
	}

	public List<Vehicle2> getAdditionalVehicleData() {
		return additionalVehicleData;
	}

	public void setAdditionalVehicleData(List<com.tools20022.repository.msg.Vehicle2> additionalVehicleData) {
		this.additionalVehicleData = additionalVehicleData;
	}
}