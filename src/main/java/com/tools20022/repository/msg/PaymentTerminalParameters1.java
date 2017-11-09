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
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1#mmClockSynchronisation
 * PaymentTerminalParameters1.mmClockSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1#mmTimeZoneLine
 * PaymentTerminalParameters1.mmTimeZoneLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1#mmOtherParameters
 * PaymentTerminalParameters1.mmOtherParameters}</li>
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
 * "PaymentTerminalParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Manufacturer configuration parameters of the point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2
 * PaymentTerminalParameters2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PaymentTerminalParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1
	 * PaymentTerminalParameters1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmClockSynchronisation
	 * PaymentTerminalParameters2.mmClockSynchronisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClockSynchronisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters1.mmObject();
			isDerived = false;
			xmlTag = "ClckSynctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClockSynchronisation";
			definition = "Parameters to synchronise the real time clock of the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters2.mmClockSynchronisation);
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1
	 * PaymentTerminalParameters1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmTimeZoneLine
	 * PaymentTerminalParameters2.mmTimeZoneLine}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTimeZoneLine = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters1.mmObject();
			isDerived = false;
			xmlTag = "TmZoneLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZoneLine";
			definition = "Time zone line to update in the time zone data base subset stored in the POI (Point Of Interaction). The format of the line is conform to the IANA (Internet Assigned Number Authority) time zone data base.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters2.mmTimeZoneLine);
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1
	 * PaymentTerminalParameters1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters2#mmOtherParameters
	 * PaymentTerminalParameters2.mmOtherParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters1.mmObject();
			isDerived = false;
			xmlTag = "OthrParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParameters";
			definition = "Others manufacturer configuration parameters of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters2.mmOtherParameters);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTerminalParameters1.mmClockSynchronisation, PaymentTerminalParameters1.mmTimeZoneLine, PaymentTerminalParameters1.mmOtherParameters);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerminalParameters1";
				definition = "Manufacturer configuration parameters of the point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(PaymentTerminalParameters2.mmObject());
			}
		});
		return mmObject_lazy.get();
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

	public Max10000Binary getOtherParameters() {
		return otherParameters;
	}

	public void setOtherParameters(Max10000Binary otherParameters) {
		this.otherParameters = otherParameters;
	}
}