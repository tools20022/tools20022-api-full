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
import com.tools20022.repository.msg.ClockSynchronisation2;
import com.tools20022.repository.msg.LocalDateTime1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5#mmActionType
 * PaymentTerminalParameters5.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5#mmVendorIdentification
 * PaymentTerminalParameters5.mmVendorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5#mmVersion
 * PaymentTerminalParameters5.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5#mmClockSynchronisation
 * PaymentTerminalParameters5.mmClockSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5#mmTimeZoneLine
 * PaymentTerminalParameters5.mmTimeZoneLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5#mmLocalDateTime
 * PaymentTerminalParameters5.mmLocalDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5#mmOtherParameters
 * PaymentTerminalParameters5.mmOtherParameters}</li>
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
 * "PaymentTerminalParameters5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Manufacturer configuration parameters of the point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
 * PaymentTerminalParameters4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTerminalParameters5", propOrder = {"actionType", "vendorIdentification", "version", "clockSynchronisation", "timeZoneLine", "localDateTime", "otherParameters"})
public class PaymentTerminalParameters5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction3Code actionType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmActionType
	 * PaymentTerminalParameters4.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters5, TerminalManagementAction3Code> mmActionType = new MMMessageAttribute<PaymentTerminalParameters5, TerminalManagementAction3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			previousVersion_lazy = () -> PaymentTerminalParameters4.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}

		@Override
		public TerminalManagementAction3Code getValue(PaymentTerminalParameters5 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(PaymentTerminalParameters5 obj, TerminalManagementAction3Code value) {
			obj.setActionType(value);
		}
	};
	@XmlElement(name = "VndrId")
	protected Max35Text vendorIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmVendorIdentification
	 * PaymentTerminalParameters4.mmVendorIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters5, Optional<Max35Text>> mmVendorIdentification = new MMMessageAttribute<PaymentTerminalParameters5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
			isDerived = false;
			xmlTag = "VndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorIdentification";
			definition = "Identification of the vendor for the MTM, if the POI manages various subsets of terminal parameters.";
			previousVersion_lazy = () -> PaymentTerminalParameters4.mmVendorIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentTerminalParameters5 obj) {
			return obj.getVendorIdentification();
		}

		@Override
		public void setValue(PaymentTerminalParameters5 obj, Optional<Max35Text> value) {
			obj.setVendorIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Vrsn")
	protected Max256Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmVersion
	 * PaymentTerminalParameters4.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters5, Optional<Max256Text>> mmVersion = new MMMessageAttribute<PaymentTerminalParameters5, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the terminal parameters.";
			previousVersion_lazy = () -> PaymentTerminalParameters4.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(PaymentTerminalParameters5 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(PaymentTerminalParameters5 obj, Optional<Max256Text> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "ClckSynctn")
	protected ClockSynchronisation2 clockSynchronisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClockSynchronisation2
	 * ClockSynchronisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmClockSynchronisation
	 * PaymentTerminalParameters4.mmClockSynchronisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTerminalParameters5, Optional<ClockSynchronisation2>> mmClockSynchronisation = new MMMessageAssociationEnd<PaymentTerminalParameters5, Optional<ClockSynchronisation2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
			isDerived = false;
			xmlTag = "ClckSynctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClockSynchronisation";
			definition = "Parameters to synchronise the real time clock of the POI (Point Of Interaction).";
			previousVersion_lazy = () -> PaymentTerminalParameters4.mmClockSynchronisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClockSynchronisation2.mmObject();
		}

		@Override
		public Optional<ClockSynchronisation2> getValue(PaymentTerminalParameters5 obj) {
			return obj.getClockSynchronisation();
		}

		@Override
		public void setValue(PaymentTerminalParameters5 obj, Optional<ClockSynchronisation2> value) {
			obj.setClockSynchronisation(value.orElse(null));
		}
	};
	@XmlElement(name = "TmZoneLine")
	protected List<Max70Text> timeZoneLine;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmTimeZoneLine
	 * PaymentTerminalParameters4.mmTimeZoneLine}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters5, List<Max70Text>> mmTimeZoneLine = new MMMessageAttribute<PaymentTerminalParameters5, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
			isDerived = false;
			xmlTag = "TmZoneLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZoneLine";
			definition = "Time zone line to update in the time zone data base subset stored in the POI (Point Of Interaction). The format of the line is conform to the IANA (Internet Assigned Number Authority) time zone data base.";
			previousVersion_lazy = () -> PaymentTerminalParameters4.mmTimeZoneLine;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(PaymentTerminalParameters5 obj) {
			return obj.getTimeZoneLine();
		}

		@Override
		public void setValue(PaymentTerminalParameters5 obj, List<Max70Text> value) {
			obj.setTimeZoneLine(value);
		}
	};
	@XmlElement(name = "LclDtTm")
	protected List<LocalDateTime1> localDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LocalDateTime1
	 * LocalDateTime1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmLocalDateTime
	 * PaymentTerminalParameters4.mmLocalDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTerminalParameters5, List<LocalDateTime1>> mmLocalDateTime = new MMMessageAssociationEnd<PaymentTerminalParameters5, List<LocalDateTime1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
			isDerived = false;
			xmlTag = "LclDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalDateTime";
			definition = "Local time offset to UTC (Coordinated Universal Time).";
			previousVersion_lazy = () -> PaymentTerminalParameters4.mmLocalDateTime;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalDateTime1.mmObject();
		}

		@Override
		public List<LocalDateTime1> getValue(PaymentTerminalParameters5 obj) {
			return obj.getLocalDateTime();
		}

		@Override
		public void setValue(PaymentTerminalParameters5 obj, List<LocalDateTime1> value) {
			obj.setLocalDateTime(value);
		}
	};
	@XmlElement(name = "OthrParams")
	protected Max10000Binary otherParameters;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmOtherParameters
	 * PaymentTerminalParameters4.mmOtherParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters5, Optional<Max10000Binary>> mmOtherParameters = new MMMessageAttribute<PaymentTerminalParameters5, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
			isDerived = false;
			xmlTag = "OthrParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParameters";
			definition = "Others manufacturer configuration parameters of the point of interaction.";
			previousVersion_lazy = () -> PaymentTerminalParameters4.mmOtherParameters;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(PaymentTerminalParameters5 obj) {
			return obj.getOtherParameters();
		}

		@Override
		public void setValue(PaymentTerminalParameters5 obj, Optional<Max10000Binary> value) {
			obj.setOtherParameters(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerminalParameters5.mmActionType, com.tools20022.repository.msg.PaymentTerminalParameters5.mmVendorIdentification,
						com.tools20022.repository.msg.PaymentTerminalParameters5.mmVersion, com.tools20022.repository.msg.PaymentTerminalParameters5.mmClockSynchronisation,
						com.tools20022.repository.msg.PaymentTerminalParameters5.mmTimeZoneLine, com.tools20022.repository.msg.PaymentTerminalParameters5.mmLocalDateTime,
						com.tools20022.repository.msg.PaymentTerminalParameters5.mmOtherParameters);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerminalParameters5";
				definition = "Manufacturer configuration parameters of the point of interaction (POI).";
				previousVersion_lazy = () -> PaymentTerminalParameters4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public PaymentTerminalParameters5 setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Optional<Max35Text> getVendorIdentification() {
		return vendorIdentification == null ? Optional.empty() : Optional.of(vendorIdentification);
	}

	public PaymentTerminalParameters5 setVendorIdentification(Max35Text vendorIdentification) {
		this.vendorIdentification = vendorIdentification;
		return this;
	}

	public Optional<Max256Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public PaymentTerminalParameters5 setVersion(Max256Text version) {
		this.version = version;
		return this;
	}

	public Optional<ClockSynchronisation2> getClockSynchronisation() {
		return clockSynchronisation == null ? Optional.empty() : Optional.of(clockSynchronisation);
	}

	public PaymentTerminalParameters5 setClockSynchronisation(ClockSynchronisation2 clockSynchronisation) {
		this.clockSynchronisation = clockSynchronisation;
		return this;
	}

	public List<Max70Text> getTimeZoneLine() {
		return timeZoneLine == null ? timeZoneLine = new ArrayList<>() : timeZoneLine;
	}

	public PaymentTerminalParameters5 setTimeZoneLine(List<Max70Text> timeZoneLine) {
		this.timeZoneLine = Objects.requireNonNull(timeZoneLine);
		return this;
	}

	public List<LocalDateTime1> getLocalDateTime() {
		return localDateTime == null ? localDateTime = new ArrayList<>() : localDateTime;
	}

	public PaymentTerminalParameters5 setLocalDateTime(List<LocalDateTime1> localDateTime) {
		this.localDateTime = Objects.requireNonNull(localDateTime);
		return this;
	}

	public Optional<Max10000Binary> getOtherParameters() {
		return otherParameters == null ? Optional.empty() : Optional.of(otherParameters);
	}

	public PaymentTerminalParameters5 setOtherParameters(Max10000Binary otherParameters) {
		this.otherParameters = otherParameters;
		return this;
	}
}