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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class ATMEquipment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text manufacturer;
	/**
	 * ATM Manufacturer.
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
	public static final MMMessageAttribute mmManufacturer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
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
	};
	protected Max35Text model;
	/**
	 * Model of ATM.
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
	public static final MMMessageAttribute mmModel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
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
	};
	protected Max35Text version;
	/**
	 * Version of the device model.
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
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
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
	};
	protected Max35Text serialNumber;
	/**
	 * Serial number of the ATM.
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
	public static final MMMessageAttribute mmSerialNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
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
	};
	protected ContentInformationType14 signedSerialNumber;
	/**
	 * Signature of the serial number of the device. The signature may contain
	 * the serial number with the signature.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSignedSerialNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
			isDerived = false;
			xmlTag = "SgndSrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedSerialNumber";
			definition = "Signature of the serial number of the device. The signature may contain the serial number with the signature.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType14.mmObject();
		}
	};
	protected Max35Text firmwareProvider;
	/**
	 * Provider of the firmware.
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
	public static final MMMessageAttribute mmFirmwareProvider = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
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
	};
	protected Max35Text firmwareIdentification;
	/**
	 * Identification of the firmware.
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
	public static final MMMessageAttribute mmFirmwareIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
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
	};
	protected Max35Text firmwareVersion;
	/**
	 * Version of the firmware.
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
	public static final MMMessageAttribute mmFirmwareVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEquipment3.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMEquipment3.mmManufacturer, ATMEquipment3.mmModel, ATMEquipment3.mmVersion, ATMEquipment3.mmSerialNumber, ATMEquipment3.mmSignedSerialNumber, ATMEquipment3.mmFirmwareProvider,
						ATMEquipment3.mmFirmwareIdentification, ATMEquipment3.mmFirmwareVersion);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEquipment3";
				definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
				previousVersion_lazy = () -> ATMEquipment2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Max35Text manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Max35Text getModel() {
		return model;
	}

	public void setModel(Max35Text model) {
		this.model = model;
	}

	public Max35Text getVersion() {
		return version;
	}

	public void setVersion(Max35Text version) {
		this.version = version;
	}

	public Max35Text getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
	}

	public ContentInformationType14 getSignedSerialNumber() {
		return signedSerialNumber;
	}

	public void setSignedSerialNumber(com.tools20022.repository.msg.ContentInformationType14 signedSerialNumber) {
		this.signedSerialNumber = signedSerialNumber;
	}

	public Max35Text getFirmwareProvider() {
		return firmwareProvider;
	}

	public void setFirmwareProvider(Max35Text firmwareProvider) {
		this.firmwareProvider = firmwareProvider;
	}

	public Max35Text getFirmwareIdentification() {
		return firmwareIdentification;
	}

	public void setFirmwareIdentification(Max35Text firmwareIdentification) {
		this.firmwareIdentification = firmwareIdentification;
	}

	public Max35Text getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(Max35Text firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}
}