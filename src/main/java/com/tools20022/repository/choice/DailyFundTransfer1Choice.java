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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransferEvent1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between time and event fund transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DailyFundTransfer1Choice#mmTransferTime
 * DailyFundTransfer1Choice.mmTransferTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DailyFundTransfer1Choice#mmTransferEvent
 * DailyFundTransfer1Choice.mmTransferEvent}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DailyFundTransfer1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between time and event fund transfer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DailyFundTransfer1Choice", propOrder = {"transferTime", "transferEvent"})
public class DailyFundTransfer1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrfTm", required = true)
	protected ISOTime transferTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DailyFundTransfer1Choice
	 * DailyFundTransfer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time daily balances are transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DailyFundTransfer1Choice, ISOTime> mmTransferTime = new MMMessageAttribute<DailyFundTransfer1Choice, ISOTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DailyFundTransfer1Choice.mmObject();
			isDerived = false;
			xmlTag = "TrfTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTime";
			definition = "Time daily balances are transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public ISOTime getValue(DailyFundTransfer1Choice obj) {
			return obj.getTransferTime();
		}

		@Override
		public void setValue(DailyFundTransfer1Choice obj, ISOTime value) {
			obj.setTransferTime(value);
		}
	};
	@XmlElement(name = "TrfEvt", required = true)
	protected TransferEvent1 transferEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransferEvent1
	 * TransferEvent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DailyFundTransfer1Choice
	 * DailyFundTransfer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfEvt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about code and number of transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DailyFundTransfer1Choice, TransferEvent1> mmTransferEvent = new MMMessageAssociationEnd<DailyFundTransfer1Choice, TransferEvent1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DailyFundTransfer1Choice.mmObject();
			isDerived = false;
			xmlTag = "TrfEvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferEvent";
			definition = "Information about code and number of transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferEvent1.mmObject();
		}

		@Override
		public TransferEvent1 getValue(DailyFundTransfer1Choice obj) {
			return obj.getTransferEvent();
		}

		@Override
		public void setValue(DailyFundTransfer1Choice obj, TransferEvent1 value) {
			obj.setTransferEvent(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DailyFundTransfer1Choice.mmTransferTime, com.tools20022.repository.choice.DailyFundTransfer1Choice.mmTransferEvent);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DailyFundTransfer1Choice";
				definition = "Choice between time and event fund transfer.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISOTime getTransferTime() {
		return transferTime;
	}

	public DailyFundTransfer1Choice setTransferTime(ISOTime transferTime) {
		this.transferTime = Objects.requireNonNull(transferTime);
		return this;
	}

	public TransferEvent1 getTransferEvent() {
		return transferEvent;
	}

	public DailyFundTransfer1Choice setTransferEvent(TransferEvent1 transferEvent) {
		this.transferEvent = Objects.requireNonNull(transferEvent);
		return this;
	}
}