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
import com.tools20022.repository.codeset.MeetingCancellationReason1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.MeetingStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the reason for cancelling a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason#mmCode
 * MeetingCancellationReason.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason#mmCancellationReason
 * MeetingCancellationReason.mmCancellationReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatusReason
 * MeetingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for cancelling a meeting."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingCancellationReason", propOrder = {"code", "cancellationReason"})
public class MeetingCancellationReason {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected MeetingCancellationReason1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason1Code
	 * MeetingCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingCancellationReason
	 * MeetingStatusReason.mmMeetingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason
	 * MeetingCancellationReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for cancelling a meeting in coded form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingCancellationReason, MeetingCancellationReason1Code> mmCode = new MMMessageAttribute<MeetingCancellationReason, MeetingCancellationReason1Code>() {
		{
			businessElementTrace_lazy = () -> MeetingStatusReason.mmMeetingCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingCancellationReason.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the reason for cancelling a meeting in coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingCancellationReason1Code.mmObject();
		}

		@Override
		public MeetingCancellationReason1Code getValue(MeetingCancellationReason obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(MeetingCancellationReason obj, MeetingCancellationReason1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "CxlRsn")
	protected Max140Text cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason
	 * MeetingCancellationReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for cancelling a meeting in free format form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingCancellationReason, Optional<Max140Text>> mmCancellationReason = new MMMessageAttribute<MeetingCancellationReason, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingCancellationReason.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason for cancelling a meeting in free format form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(MeetingCancellationReason obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(MeetingCancellationReason obj, Optional<Max140Text> value) {
			obj.setCancellationReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingCancellationReason.mmCode, com.tools20022.repository.msg.MeetingCancellationReason.mmCancellationReason);
				trace_lazy = () -> MeetingStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingCancellationReason";
				definition = "Specifies the reason for cancelling a meeting.";
			}
		});
		return mmObject_lazy.get();
	}

	public MeetingCancellationReason1Code getCode() {
		return code;
	}

	public MeetingCancellationReason setCode(MeetingCancellationReason1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Optional<Max140Text> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public MeetingCancellationReason setCancellationReason(Max140Text cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}
}