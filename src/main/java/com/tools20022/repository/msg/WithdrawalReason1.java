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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeWithdrawalNotificationV03;
import com.tools20022.repository.codeset.WithdrawalReason1Code;
import com.tools20022.repository.datatype.Max4Text;
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
 * Specifies the withdrawal reason code and optionally a withdrawal reason sub
 * code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WithdrawalReason1#mmWithdrawalReasonCode
 * WithdrawalReason1.mmWithdrawalReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.WithdrawalReason1#mmWithdrawalReasonSubCode
 * WithdrawalReason1.mmWithdrawalReasonSubCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeWithdrawalNotificationV03#mmWithdrawalReason
 * ForeignExchangeTradeWithdrawalNotificationV03.mmWithdrawalReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WithdrawalReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the withdrawal reason code and optionally a withdrawal reason sub code."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "WithdrawalReason1", propOrder = {"withdrawalReasonCode", "withdrawalReasonSubCode"})
public class WithdrawalReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "WdrwlRsnCd", required = true)
	protected WithdrawalReason1Code withdrawalReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WithdrawalReason1Code
	 * WithdrawalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WithdrawalReason1
	 * WithdrawalReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlRsnCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal reason expressed as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WithdrawalReason1, WithdrawalReason1Code> mmWithdrawalReasonCode = new MMMessageAttribute<WithdrawalReason1, WithdrawalReason1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WithdrawalReason1.mmObject();
			isDerived = false;
			xmlTag = "WdrwlRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalReasonCode";
			definition = "Withdrawal reason expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WithdrawalReason1Code.mmObject();
		}

		@Override
		public WithdrawalReason1Code getValue(WithdrawalReason1 obj) {
			return obj.getWithdrawalReasonCode();
		}

		@Override
		public void setValue(WithdrawalReason1 obj, WithdrawalReason1Code value) {
			obj.setWithdrawalReasonCode(value);
		}
	};
	@XmlElement(name = "WdrwlRsnSubCd")
	protected Max4Text withdrawalReasonSubCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.WithdrawalReason1
	 * WithdrawalReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlRsnSubCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReasonSubCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further withdrawal reason information expressed as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<WithdrawalReason1, Optional<Max4Text>> mmWithdrawalReasonSubCode = new MMMessageAttribute<WithdrawalReason1, Optional<Max4Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.WithdrawalReason1.mmObject();
			isDerived = false;
			xmlTag = "WdrwlRsnSubCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalReasonSubCode";
			definition = "Further withdrawal reason information expressed as a code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Optional<Max4Text> getValue(WithdrawalReason1 obj) {
			return obj.getWithdrawalReasonSubCode();
		}

		@Override
		public void setValue(WithdrawalReason1 obj, Optional<Max4Text> value) {
			obj.setWithdrawalReasonSubCode(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.WithdrawalReason1.mmWithdrawalReasonCode, com.tools20022.repository.msg.WithdrawalReason1.mmWithdrawalReasonSubCode);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeWithdrawalNotificationV03.mmWithdrawalReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WithdrawalReason1";
				definition = "Specifies the withdrawal reason code and optionally a withdrawal reason sub code.";
			}
		});
		return mmObject_lazy.get();
	}

	public WithdrawalReason1Code getWithdrawalReasonCode() {
		return withdrawalReasonCode;
	}

	public WithdrawalReason1 setWithdrawalReasonCode(WithdrawalReason1Code withdrawalReasonCode) {
		this.withdrawalReasonCode = Objects.requireNonNull(withdrawalReasonCode);
		return this;
	}

	public Optional<Max4Text> getWithdrawalReasonSubCode() {
		return withdrawalReasonSubCode == null ? Optional.empty() : Optional.of(withdrawalReasonSubCode);
	}

	public WithdrawalReason1 setWithdrawalReasonSubCode(Max4Text withdrawalReasonSubCode) {
		this.withdrawalReasonSubCode = withdrawalReasonSubCode;
		return this;
	}
}