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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Hardware security module information, so called EPP for Encrypted PIN Pad.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment2#mmManufacturer
 * ATMEquipment2.mmManufacturer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment2#mmModel
 * ATMEquipment2.mmModel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment2#mmVersion
 * ATMEquipment2.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment2#mmSerialNumber
 * ATMEquipment2.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareProvider
 * ATMEquipment2.mmFirmwareProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareIdentification
 * ATMEquipment2.mmFirmwareIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareVersion
 * ATMEquipment2.mmFirmwareVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMEquipment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Hardware security module information, so called EPP for Encrypted PIN Pad."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMEquipment1
 * ATMEquipment1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEquipment2", propOrder = {"manufacturer", "model", "version", "serialNumber", "firmwareProvider", "firmwareIdentification", "firmwareVersion"})
public class ATMEquipment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Manfctr")
	protected Max35Text manufacturer;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Manfctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manufacturer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM Manufacturer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmManufacturer
	 * ATMEquipment3.mmManufacturer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmManufacturer
	 * ATMEquipment1.mmManufacturer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment2, Optional<Max35Text>> mmManufacturer = new MMMessageAttribute<ATMEquipment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
			isDerived = false;
			xmlTag = "Manfctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturer";
			definition = "ATM Manufacturer.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmManufacturer);
			previousVersion_lazy = () -> ATMEquipment1.mmManufacturer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment2 obj) {
			return obj.getManufacturer();
		}

		@Override
		public void setValue(ATMEquipment2 obj, Optional<Max35Text> value) {
			obj.setManufacturer(value.orElse(null));
		}
	};
	@XmlElement(name = "Mdl")
	protected Max35Text model;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Model"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Model of ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment3#mmModel
	 * ATMEquipment3.mmModel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmModel
	 * ATMEquipment1.mmModel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment2, Optional<Max35Text>> mmModel = new MMMessageAttribute<ATMEquipment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
			isDerived = false;
			xmlTag = "Mdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Model";
			definition = "Model of ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmModel);
			previousVersion_lazy = () -> ATMEquipment1.mmModel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment2 obj) {
			return obj.getModel();
		}

		@Override
		public void setValue(ATMEquipment2 obj, Optional<Max35Text> value) {
			obj.setModel(value.orElse(null));
		}
	};
	@XmlElement(name = "Vrsn")
	protected Max35Text version;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the device model."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment3#mmVersion
	 * ATMEquipment3.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment2, Optional<Max35Text>> mmVersion = new MMMessageAttribute<ATMEquipment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the device model.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment2 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(ATMEquipment2 obj, Optional<Max35Text> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "SrlNb")
	protected Max35Text serialNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmSerialNumber
	 * ATMEquipment3.mmSerialNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmSerialNumber
	 * ATMEquipment1.mmSerialNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment2, Optional<Max35Text>> mmSerialNumber = new MMMessageAttribute<ATMEquipment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmSerialNumber);
			previousVersion_lazy = () -> ATMEquipment1.mmSerialNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment2 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(ATMEquipment2 obj, Optional<Max35Text> value) {
			obj.setSerialNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "FrmwrPrvdr")
	protected Max35Text firmwareProvider;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmwrPrvdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmwareProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provider of the firmware."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmFirmwareProvider
	 * ATMEquipment3.mmFirmwareProvider}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmApplicationProvider
	 * ATMEquipment1.mmApplicationProvider}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment2, Optional<Max35Text>> mmFirmwareProvider = new MMMessageAttribute<ATMEquipment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
			isDerived = false;
			xmlTag = "FrmwrPrvdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmwareProvider";
			definition = "Provider of the firmware.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmFirmwareProvider);
			previousVersion_lazy = () -> ATMEquipment1.mmApplicationProvider;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment2 obj) {
			return obj.getFirmwareProvider();
		}

		@Override
		public void setValue(ATMEquipment2 obj, Optional<Max35Text> value) {
			obj.setFirmwareProvider(value.orElse(null));
		}
	};
	@XmlElement(name = "FrmwrId")
	protected Max35Text firmwareIdentification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmwrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmwareIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the firmware."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmFirmwareIdentification
	 * ATMEquipment3.mmFirmwareIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmApplicationVersion
	 * ATMEquipment1.mmApplicationVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment2, Optional<Max35Text>> mmFirmwareIdentification = new MMMessageAttribute<ATMEquipment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
			isDerived = false;
			xmlTag = "FrmwrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmwareIdentification";
			definition = "Identification of the firmware.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmFirmwareIdentification);
			previousVersion_lazy = () -> ATMEquipment1.mmApplicationVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment2 obj) {
			return obj.getFirmwareIdentification();
		}

		@Override
		public void setValue(ATMEquipment2 obj, Optional<Max35Text> value) {
			obj.setFirmwareIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FrmwrVrsn")
	protected Max35Text firmwareVersion;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmwrVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmwareVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the firmware."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmFirmwareVersion
	 * ATMEquipment3.mmFirmwareVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmApprovalNumber
	 * ATMEquipment1.mmApprovalNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment2, Optional<Max35Text>> mmFirmwareVersion = new MMMessageAttribute<ATMEquipment2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
			isDerived = false;
			xmlTag = "FrmwrVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmwareVersion";
			definition = "Version of the firmware.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmFirmwareVersion);
			previousVersion_lazy = () -> ATMEquipment1.mmApprovalNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment2 obj) {
			return obj.getFirmwareVersion();
		}

		@Override
		public void setValue(ATMEquipment2 obj, Optional<Max35Text> value) {
			obj.setFirmwareVersion(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEquipment2.mmManufacturer, com.tools20022.repository.msg.ATMEquipment2.mmModel, com.tools20022.repository.msg.ATMEquipment2.mmVersion,
						com.tools20022.repository.msg.ATMEquipment2.mmSerialNumber, com.tools20022.repository.msg.ATMEquipment2.mmFirmwareProvider, com.tools20022.repository.msg.ATMEquipment2.mmFirmwareIdentification,
						com.tools20022.repository.msg.ATMEquipment2.mmFirmwareVersion);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEquipment2";
				definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
				nextVersions_lazy = () -> Arrays.asList(ATMEquipment3.mmObject());
				previousVersion_lazy = () -> ATMEquipment1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getManufacturer() {
		return manufacturer == null ? Optional.empty() : Optional.of(manufacturer);
	}

	public ATMEquipment2 setManufacturer(Max35Text manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	public Optional<Max35Text> getModel() {
		return model == null ? Optional.empty() : Optional.of(model);
	}

	public ATMEquipment2 setModel(Max35Text model) {
		this.model = model;
		return this;
	}

	public Optional<Max35Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public ATMEquipment2 setVersion(Max35Text version) {
		this.version = version;
		return this;
	}

	public Optional<Max35Text> getSerialNumber() {
		return serialNumber == null ? Optional.empty() : Optional.of(serialNumber);
	}

	public ATMEquipment2 setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	public Optional<Max35Text> getFirmwareProvider() {
		return firmwareProvider == null ? Optional.empty() : Optional.of(firmwareProvider);
	}

	public ATMEquipment2 setFirmwareProvider(Max35Text firmwareProvider) {
		this.firmwareProvider = firmwareProvider;
		return this;
	}

	public Optional<Max35Text> getFirmwareIdentification() {
		return firmwareIdentification == null ? Optional.empty() : Optional.of(firmwareIdentification);
	}

	public ATMEquipment2 setFirmwareIdentification(Max35Text firmwareIdentification) {
		this.firmwareIdentification = firmwareIdentification;
		return this;
	}

	public Optional<Max35Text> getFirmwareVersion() {
		return firmwareVersion == null ? Optional.empty() : Optional.of(firmwareVersion);
	}

	public ATMEquipment2 setFirmwareVersion(Max35Text firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		return this;
	}
}