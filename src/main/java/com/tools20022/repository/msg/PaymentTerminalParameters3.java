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
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Manufacturer configuration parameters of the point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmActionType
 * PaymentTerminalParameters3.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmVendorIdentification
 * PaymentTerminalParameters3.mmVendorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmVersion
 * PaymentTerminalParameters3.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmClockSynchronisation
 * PaymentTerminalParameters3.mmClockSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmTimeZoneLine
 * PaymentTerminalParameters3.mmTimeZoneLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmLocalDateTime
 * PaymentTerminalParameters3.mmLocalDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmOtherParameters
 * PaymentTerminalParameters3.mmOtherParameters}</li>
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
 * "PaymentTerminalParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Manufacturer configuration parameters of the point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
 * PaymentTerminalParameters4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
 * PaymentTerminalParameters2}</li>
 * </ul>
 */
public class PaymentTerminalParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction3Code actionType;
	/**
	 * Type of action for the configuration parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
	 * PaymentTerminalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmActionType
	 * PaymentTerminalParameters4.mmActionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters3.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmActionType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	protected Max35Text vendorIdentification;
	/**
	 * Identification of the vendor for the MTM, if the POI manages various
	 * subsets of terminal parameters.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
	 * PaymentTerminalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the vendor for the MTM, if the POI manages various subsets of terminal parameters."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmVendorIdentification
	 * PaymentTerminalParameters4.mmVendorIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmVendorIdentification
	 * PaymentTerminalParameters2.mmVendorIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVendorIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters3.mmObject();
			isDerived = false;
			xmlTag = "VndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorIdentification";
			definition = "Identification of the vendor for the MTM, if the POI manages various subsets of terminal parameters.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmVendorIdentification);
			previousVersion_lazy = () -> PaymentTerminalParameters2.mmVendorIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max256Text version;
	/**
	 * Version of the terminal parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
	 * PaymentTerminalParameters3}</li>
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
	 * definition} = "Version of the terminal parameters."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmVersion
	 * PaymentTerminalParameters4.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmVersion
	 * PaymentTerminalParameters2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the terminal parameters.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmVersion);
			previousVersion_lazy = () -> PaymentTerminalParameters2.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected ClockSynchronisation1 clockSynchronisation;
	/**
	 * Parameters to synchronise the real time clock of the POI (Point Of
	 * Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClockSynchronisation1
	 * ClockSynchronisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
	 * PaymentTerminalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClckSynctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClockSynchronisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters to synchronise the real time clock of the POI (Point Of Interaction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmClockSynchronisation
	 * PaymentTerminalParameters4.mmClockSynchronisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmClockSynchronisation
	 * PaymentTerminalParameters2.mmClockSynchronisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClockSynchronisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters3.mmObject();
			isDerived = false;
			xmlTag = "ClckSynctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClockSynchronisation";
			definition = "Parameters to synchronise the real time clock of the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmClockSynchronisation);
			previousVersion_lazy = () -> PaymentTerminalParameters2.mmClockSynchronisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ClockSynchronisation1.mmObject();
		}
	};
	protected List<Max70Text> timeZoneLine;
	/**
	 * Time zone line to update in the time zone data base subset stored in the
	 * POI (Point Of Interaction). The format of the line is conform to the IANA
	 * (Internet Assigned Number Authority) time zone data base.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
	 * PaymentTerminalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmZoneLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeZoneLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time zone line to update in the time zone data base subset stored in the POI (Point Of Interaction). The format of the line is conform to the IANA (Internet Assigned Number Authority) time zone data base."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmTimeZoneLine
	 * PaymentTerminalParameters4.mmTimeZoneLine}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmTimeZoneLine
	 * PaymentTerminalParameters2.mmTimeZoneLine}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTimeZoneLine = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters3.mmObject();
			isDerived = false;
			xmlTag = "TmZoneLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZoneLine";
			definition = "Time zone line to update in the time zone data base subset stored in the POI (Point Of Interaction). The format of the line is conform to the IANA (Internet Assigned Number Authority) time zone data base.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmTimeZoneLine);
			previousVersion_lazy = () -> PaymentTerminalParameters2.mmTimeZoneLine;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LocalDateTime1> localDateTime;
	/**
	 * Local time offset to UTC (Coordinated Universal Time).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LocalDateTime1
	 * LocalDateTime1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
	 * PaymentTerminalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local time offset to UTC (Coordinated Universal Time)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmLocalDateTime
	 * PaymentTerminalParameters4.mmLocalDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmLocalDateTime
	 * PaymentTerminalParameters2.mmLocalDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalDateTime = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters3.mmObject();
			isDerived = false;
			xmlTag = "LclDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalDateTime";
			definition = "Local time offset to UTC (Coordinated Universal Time).";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmLocalDateTime);
			previousVersion_lazy = () -> PaymentTerminalParameters2.mmLocalDateTime;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LocalDateTime1.mmObject();
		}
	};
	protected Max10000Binary otherParameters;
	/**
	 * Others manufacturer configuration parameters of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
	 * PaymentTerminalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Others manufacturer configuration parameters of the point of interaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmOtherParameters
	 * PaymentTerminalParameters4.mmOtherParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmOtherParameters
	 * PaymentTerminalParameters2.mmOtherParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters3.mmObject();
			isDerived = false;
			xmlTag = "OthrParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParameters";
			definition = "Others manufacturer configuration parameters of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmOtherParameters);
			previousVersion_lazy = () -> PaymentTerminalParameters2.mmOtherParameters;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmActionType, PaymentTerminalParameters3.mmVendorIdentification, PaymentTerminalParameters3.mmVersion, PaymentTerminalParameters3.mmClockSynchronisation,
						PaymentTerminalParameters3.mmTimeZoneLine, PaymentTerminalParameters3.mmLocalDateTime, PaymentTerminalParameters3.mmOtherParameters);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerminalParameters3";
				definition = "Manufacturer configuration parameters of the point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmObject());
				previousVersion_lazy = () -> PaymentTerminalParameters2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public void setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = actionType;
	}

	public Max35Text getVendorIdentification() {
		return vendorIdentification;
	}

	public void setVendorIdentification(Max35Text vendorIdentification) {
		this.vendorIdentification = vendorIdentification;
	}

	public Max256Text getVersion() {
		return version;
	}

	public void setVersion(Max256Text version) {
		this.version = version;
	}

	public ClockSynchronisation1 getClockSynchronisation() {
		return clockSynchronisation;
	}

	public void setClockSynchronisation(com.tools20022.repository.msg.ClockSynchronisation1 clockSynchronisation) {
		this.clockSynchronisation = clockSynchronisation;
	}

	public List<Max70Text> getTimeZoneLine() {
		return timeZoneLine;
	}

	public void setTimeZoneLine(List<Max70Text> timeZoneLine) {
		this.timeZoneLine = timeZoneLine;
	}

	public List<LocalDateTime1> getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(List<com.tools20022.repository.msg.LocalDateTime1> localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Max10000Binary getOtherParameters() {
		return otherParameters;
	}

	public void setOtherParameters(Max10000Binary otherParameters) {
		this.otherParameters = otherParameters;
	}
}