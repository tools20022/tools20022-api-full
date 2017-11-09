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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Local time offset to UTC (Coordinated Universal Time).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LocalDateTime1#mmFromDateTime
 * LocalDateTime1.mmFromDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LocalDateTime1#mmToDateTime
 * LocalDateTime1.mmToDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LocalDateTime1#mmUTCOffset
 * LocalDateTime1.mmUTCOffset}</li>
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
 * "LocalDateTime1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Local time offset to UTC (Coordinated Universal Time)."</li>
 * </ul>
 */
public class LocalDateTime1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime fromDateTime;
	/**
	 * Date time of the beginning of the period (inclusive).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalDateTime1 LocalDateTime1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time of the beginning of the period (inclusive)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFromDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LocalDateTime1.mmObject();
			isDerived = false;
			xmlTag = "FrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateTime";
			definition = "Date time of the beginning of the period (inclusive).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime toDateTime;
	/**
	 * Date time of the end of the period (exclusive).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalDateTime1 LocalDateTime1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time of the end of the period (exclusive)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmToDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LocalDateTime1.mmObject();
			isDerived = false;
			xmlTag = "ToDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToDateTime";
			definition = "Date time of the end of the period (exclusive).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Number uTCOffset;
	/**
	 * UTC offset in minutes, of the local time during the period. For instance,
	 * 120 for Central European Time, -720 for Central Standard Time (North
	 * America).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalDateTime1 LocalDateTime1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UTCOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UTCOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UTC offset in minutes, of the local time during the period. For instance, 120 for Central European Time, -720 for Central Standard Time (North America)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUTCOffset = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LocalDateTime1.mmObject();
			isDerived = false;
			xmlTag = "UTCOffset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UTCOffset";
			definition = "UTC offset in minutes, of the local time during the period. For instance, 120 for Central European Time, -720 for Central Standard Time (North America).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LocalDateTime1.mmFromDateTime, LocalDateTime1.mmToDateTime, LocalDateTime1.mmUTCOffset);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocalDateTime1";
				definition = "Local time offset to UTC (Coordinated Universal Time).";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFromDateTime() {
		return fromDateTime;
	}

	public void setFromDateTime(ISODateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public ISODateTime getToDateTime() {
		return toDateTime;
	}

	public void setToDateTime(ISODateTime toDateTime) {
		this.toDateTime = toDateTime;
	}

	public Number getUTCOffset() {
		return uTCOffset;
	}

	public void setUTCOffset(Number uTCOffset) {
		this.uTCOffset = uTCOffset;
	}
}