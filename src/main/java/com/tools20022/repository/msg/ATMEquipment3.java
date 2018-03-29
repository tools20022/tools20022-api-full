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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType14;
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
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment3#mmManufacturer
 * ATMEquipment3.mmManufacturer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment3#mmModel
 * ATMEquipment3.mmModel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment3#mmVersion
 * ATMEquipment3.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment3#mmSerialNumber
 * ATMEquipment3.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmSignedSerialNumber
 * ATMEquipment3.mmSignedSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmFirmwareProvider
 * ATMEquipment3.mmFirmwareProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmFirmwareIdentification
 * ATMEquipment3.mmFirmwareIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment3#mmFirmwareVersion
 * ATMEquipment3.mmFirmwareVersion}</li>
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
 * "ATMEquipment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Hardware security module information, so called EPP for Encrypted PIN Pad."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMEquipment2
 * ATMEquipment2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEquipment3", propOrder = {"manufacturer", "model", "version", "serialNumber", "signedSerialNumber", "firmwareProvider", "firmwareIdentification", "firmwareVersion"})
public class ATMEquipment3 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Manfctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manufacturer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM Manufacturer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmManufacturer
	 * ATMEquipment2.mmManufacturer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment3, Optional<Max35Text>> mmManufacturer = new MMMessageAttribute<ATMEquipment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "Manfctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturer";
			definition = "ATM Manufacturer.";
			previousVersion_lazy = () -> ATMEquipment2.mmManufacturer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment3 obj) {
			return obj.getManufacturer();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Model"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Model of ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmModel
	 * ATMEquipment2.mmModel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment3, Optional<Max35Text>> mmModel = new MMMessageAttribute<ATMEquipment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "Mdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Model";
			definition = "Model of ATM.";
			previousVersion_lazy = () -> ATMEquipment2.mmModel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment3 obj) {
			return obj.getModel();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the device model."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmVersion
	 * ATMEquipment2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment3, Optional<Max35Text>> mmVersion = new MMMessageAttribute<ATMEquipment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the device model.";
			previousVersion_lazy = () -> ATMEquipment2.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment3 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmSerialNumber
	 * ATMEquipment2.mmSerialNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment3, Optional<Max35Text>> mmSerialNumber = new MMMessageAttribute<ATMEquipment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of the ATM.";
			previousVersion_lazy = () -> ATMEquipment2.mmSerialNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment3 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<Max35Text> value) {
			obj.setSerialNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "SgndSrlNb")
	protected ContentInformationType14 signedSerialNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14
	 * ContentInformationType14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgndSrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedSerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature of the serial number of the device. The signature may contain the serial number with the signature."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEquipment3, Optional<ContentInformationType14>> mmSignedSerialNumber = new MMMessageAssociationEnd<ATMEquipment3, Optional<ContentInformationType14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "SgndSrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedSerialNumber";
			definition = "Signature of the serial number of the device. The signature may contain the serial number with the signature.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType14.mmObject();
		}

		@Override
		public Optional<ContentInformationType14> getValue(ATMEquipment3 obj) {
			return obj.getSignedSerialNumber();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<ContentInformationType14> value) {
			obj.setSignedSerialNumber(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmwrPrvdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmwareProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provider of the firmware."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareProvider
	 * ATMEquipment2.mmFirmwareProvider}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment3, Optional<Max35Text>> mmFirmwareProvider = new MMMessageAttribute<ATMEquipment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "FrmwrPrvdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmwareProvider";
			definition = "Provider of the firmware.";
			previousVersion_lazy = () -> ATMEquipment2.mmFirmwareProvider;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment3 obj) {
			return obj.getFirmwareProvider();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmwrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmwareIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the firmware."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareIdentification
	 * ATMEquipment2.mmFirmwareIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment3, Optional<Max35Text>> mmFirmwareIdentification = new MMMessageAttribute<ATMEquipment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "FrmwrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmwareIdentification";
			definition = "Identification of the firmware.";
			previousVersion_lazy = () -> ATMEquipment2.mmFirmwareIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment3 obj) {
			return obj.getFirmwareIdentification();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment3 ATMEquipment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmwrVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmwareVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the firmware."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareVersion
	 * ATMEquipment2.mmFirmwareVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment3, Optional<Max35Text>> mmFirmwareVersion = new MMMessageAttribute<ATMEquipment3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "FrmwrVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmwareVersion";
			definition = "Version of the firmware.";
			previousVersion_lazy = () -> ATMEquipment2.mmFirmwareVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment3 obj) {
			return obj.getFirmwareVersion();
		}

		@Override
		public void setValue(ATMEquipment3 obj, Optional<Max35Text> value) {
			obj.setFirmwareVersion(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEquipment3.mmManufacturer, com.tools20022.repository.msg.ATMEquipment3.mmModel, com.tools20022.repository.msg.ATMEquipment3.mmVersion,
						com.tools20022.repository.msg.ATMEquipment3.mmSerialNumber, com.tools20022.repository.msg.ATMEquipment3.mmSignedSerialNumber, com.tools20022.repository.msg.ATMEquipment3.mmFirmwareProvider,
						com.tools20022.repository.msg.ATMEquipment3.mmFirmwareIdentification, com.tools20022.repository.msg.ATMEquipment3.mmFirmwareVersion);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEquipment3";
				definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
				previousVersion_lazy = () -> ATMEquipment2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getManufacturer() {
		return manufacturer == null ? Optional.empty() : Optional.of(manufacturer);
	}

	public ATMEquipment3 setManufacturer(Max35Text manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	public Optional<Max35Text> getModel() {
		return model == null ? Optional.empty() : Optional.of(model);
	}

	public ATMEquipment3 setModel(Max35Text model) {
		this.model = model;
		return this;
	}

	public Optional<Max35Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public ATMEquipment3 setVersion(Max35Text version) {
		this.version = version;
		return this;
	}

	public Optional<Max35Text> getSerialNumber() {
		return serialNumber == null ? Optional.empty() : Optional.of(serialNumber);
	}

	public ATMEquipment3 setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	public Optional<ContentInformationType14> getSignedSerialNumber() {
		return signedSerialNumber == null ? Optional.empty() : Optional.of(signedSerialNumber);
	}

	public ATMEquipment3 setSignedSerialNumber(ContentInformationType14 signedSerialNumber) {
		this.signedSerialNumber = signedSerialNumber;
		return this;
	}

	public Optional<Max35Text> getFirmwareProvider() {
		return firmwareProvider == null ? Optional.empty() : Optional.of(firmwareProvider);
	}

	public ATMEquipment3 setFirmwareProvider(Max35Text firmwareProvider) {
		this.firmwareProvider = firmwareProvider;
		return this;
	}

	public Optional<Max35Text> getFirmwareIdentification() {
		return firmwareIdentification == null ? Optional.empty() : Optional.of(firmwareIdentification);
	}

	public ATMEquipment3 setFirmwareIdentification(Max35Text firmwareIdentification) {
		this.firmwareIdentification = firmwareIdentification;
		return this;
	}

	public Optional<Max35Text> getFirmwareVersion() {
		return firmwareVersion == null ? Optional.empty() : Optional.of(firmwareVersion);
	}

	public ATMEquipment3 setFirmwareVersion(Max35Text firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		return this;
	}
}