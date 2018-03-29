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
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ClockSynchronisation1;
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
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmVendorIdentification
 * PaymentTerminalParameters2.mmVendorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmVersion
 * PaymentTerminalParameters2.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmClockSynchronisation
 * PaymentTerminalParameters2.mmClockSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmTimeZoneLine
 * PaymentTerminalParameters2.mmTimeZoneLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmLocalDateTime
 * PaymentTerminalParameters2.mmLocalDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmOtherParameters
 * PaymentTerminalParameters2.mmOtherParameters}</li>
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
 * "PaymentTerminalParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Manufacturer configuration parameters of the point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3
 * PaymentTerminalParameters3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1
 * PaymentTerminalParameters1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTerminalParameters2", propOrder = {"vendorIdentification", "version", "clockSynchronisation", "timeZoneLine", "localDateTime", "otherParameters"})
public class PaymentTerminalParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
	 * PaymentTerminalParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmVendorIdentification
	 * PaymentTerminalParameters3.mmVendorIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters2, Optional<Max35Text>> mmVendorIdentification = new MMMessageAttribute<PaymentTerminalParameters2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters2.mmObject();
			isDerived = false;
			xmlTag = "VndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorIdentification";
			definition = "Identification of the vendor for the MTM, if the POI manages various subsets of terminal parameters.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmVendorIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentTerminalParameters2 obj) {
			return obj.getVendorIdentification();
		}

		@Override
		public void setValue(PaymentTerminalParameters2 obj, Optional<Max35Text> value) {
			obj.setVendorIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Vrsn", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
	 * PaymentTerminalParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmVersion
	 * PaymentTerminalParameters3.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters2, Max256Text> mmVersion = new MMMessageAttribute<PaymentTerminalParameters2, Max256Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the terminal parameters.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmVersion);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(PaymentTerminalParameters2 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(PaymentTerminalParameters2 obj, Max256Text value) {
			obj.setVersion(value);
		}
	};
	@XmlElement(name = "ClckSynctn")
	protected ClockSynchronisation1 clockSynchronisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClockSynchronisation1
	 * ClockSynchronisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
	 * PaymentTerminalParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmClockSynchronisation
	 * PaymentTerminalParameters3.mmClockSynchronisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1#mmClockSynchronisation
	 * PaymentTerminalParameters1.mmClockSynchronisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTerminalParameters2, Optional<ClockSynchronisation1>> mmClockSynchronisation = new MMMessageAssociationEnd<PaymentTerminalParameters2, Optional<ClockSynchronisation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters2.mmObject();
			isDerived = false;
			xmlTag = "ClckSynctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClockSynchronisation";
			definition = "Parameters to synchronise the real time clock of the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmClockSynchronisation);
			previousVersion_lazy = () -> PaymentTerminalParameters1.mmClockSynchronisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClockSynchronisation1.mmObject();
		}

		@Override
		public Optional<ClockSynchronisation1> getValue(PaymentTerminalParameters2 obj) {
			return obj.getClockSynchronisation();
		}

		@Override
		public void setValue(PaymentTerminalParameters2 obj, Optional<ClockSynchronisation1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
	 * PaymentTerminalParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmTimeZoneLine
	 * PaymentTerminalParameters3.mmTimeZoneLine}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1#mmTimeZoneLine
	 * PaymentTerminalParameters1.mmTimeZoneLine}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters2, List<Max70Text>> mmTimeZoneLine = new MMMessageAttribute<PaymentTerminalParameters2, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters2.mmObject();
			isDerived = false;
			xmlTag = "TmZoneLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZoneLine";
			definition = "Time zone line to update in the time zone data base subset stored in the POI (Point Of Interaction). The format of the line is conform to the IANA (Internet Assigned Number Authority) time zone data base.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmTimeZoneLine);
			previousVersion_lazy = () -> PaymentTerminalParameters1.mmTimeZoneLine;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(PaymentTerminalParameters2 obj) {
			return obj.getTimeZoneLine();
		}

		@Override
		public void setValue(PaymentTerminalParameters2 obj, List<Max70Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
	 * PaymentTerminalParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmLocalDateTime
	 * PaymentTerminalParameters3.mmLocalDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTerminalParameters2, List<LocalDateTime1>> mmLocalDateTime = new MMMessageAssociationEnd<PaymentTerminalParameters2, List<LocalDateTime1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters2.mmObject();
			isDerived = false;
			xmlTag = "LclDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalDateTime";
			definition = "Local time offset to UTC (Coordinated Universal Time).";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmLocalDateTime);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalDateTime1.mmObject();
		}

		@Override
		public List<LocalDateTime1> getValue(PaymentTerminalParameters2 obj) {
			return obj.getLocalDateTime();
		}

		@Override
		public void setValue(PaymentTerminalParameters2 obj, List<LocalDateTime1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
	 * PaymentTerminalParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters3#mmOtherParameters
	 * PaymentTerminalParameters3.mmOtherParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1#mmOtherParameters
	 * PaymentTerminalParameters1.mmOtherParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTerminalParameters2, Optional<Max10000Binary>> mmOtherParameters = new MMMessageAttribute<PaymentTerminalParameters2, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters2.mmObject();
			isDerived = false;
			xmlTag = "OthrParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParameters";
			definition = "Others manufacturer configuration parameters of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmOtherParameters);
			previousVersion_lazy = () -> PaymentTerminalParameters1.mmOtherParameters;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(PaymentTerminalParameters2 obj) {
			return obj.getOtherParameters();
		}

		@Override
		public void setValue(PaymentTerminalParameters2 obj, Optional<Max10000Binary> value) {
			obj.setOtherParameters(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerminalParameters2.mmVendorIdentification, com.tools20022.repository.msg.PaymentTerminalParameters2.mmVersion,
						com.tools20022.repository.msg.PaymentTerminalParameters2.mmClockSynchronisation, com.tools20022.repository.msg.PaymentTerminalParameters2.mmTimeZoneLine,
						com.tools20022.repository.msg.PaymentTerminalParameters2.mmLocalDateTime, com.tools20022.repository.msg.PaymentTerminalParameters2.mmOtherParameters);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerminalParameters2";
				definition = "Manufacturer configuration parameters of the point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters3.mmObject());
				previousVersion_lazy = () -> PaymentTerminalParameters1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getVendorIdentification() {
		return vendorIdentification == null ? Optional.empty() : Optional.of(vendorIdentification);
	}

	public PaymentTerminalParameters2 setVendorIdentification(Max35Text vendorIdentification) {
		this.vendorIdentification = vendorIdentification;
		return this;
	}

	public Max256Text getVersion() {
		return version;
	}

	public PaymentTerminalParameters2 setVersion(Max256Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public Optional<ClockSynchronisation1> getClockSynchronisation() {
		return clockSynchronisation == null ? Optional.empty() : Optional.of(clockSynchronisation);
	}

	public PaymentTerminalParameters2 setClockSynchronisation(ClockSynchronisation1 clockSynchronisation) {
		this.clockSynchronisation = clockSynchronisation;
		return this;
	}

	public List<Max70Text> getTimeZoneLine() {
		return timeZoneLine == null ? timeZoneLine = new ArrayList<>() : timeZoneLine;
	}

	public PaymentTerminalParameters2 setTimeZoneLine(List<Max70Text> timeZoneLine) {
		this.timeZoneLine = Objects.requireNonNull(timeZoneLine);
		return this;
	}

	public List<LocalDateTime1> getLocalDateTime() {
		return localDateTime == null ? localDateTime = new ArrayList<>() : localDateTime;
	}

	public PaymentTerminalParameters2 setLocalDateTime(List<LocalDateTime1> localDateTime) {
		this.localDateTime = Objects.requireNonNull(localDateTime);
		return this;
	}

	public Optional<Max10000Binary> getOtherParameters() {
		return otherParameters == null ? Optional.empty() : Optional.of(otherParameters);
	}

	public PaymentTerminalParameters2 setOtherParameters(Max10000Binary otherParameters) {
		this.otherParameters = otherParameters;
		return this;
	}
}