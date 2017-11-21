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
import com.tools20022.repository.area.secl.BuyInNotificationV03;
import com.tools20022.repository.choice.DateFormat15Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.BuyIn;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies elements related to the notification (or warn) sent by the central
 * counterparty to the clearing member in the context of the buy in process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn4#mmWarningIndicator
 * BuyIn4.mmWarningIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn4#mmExpectedBuyInDate
 * BuyIn4.mmExpectedBuyInDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn4#mmCancellationLimitDate
 * BuyIn4.mmCancellationLimitDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn4#mmBuyInReversionDate
 * BuyIn4.mmBuyInReversionDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03#mmNotificationDetails
 * BuyInNotificationV03.mmNotificationDetails}</li>
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
 * "BuyIn4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies elements related to the notification (or warn) sent by the central counterparty to the clearing member in the context of the buy in process."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.BuyIn1 BuyIn1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BuyIn4", propOrder = {"warningIndicator", "expectedBuyInDate", "cancellationLimitDate", "buyInReversionDate"})
public class BuyIn4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator warningIndicator;
	/**
	 * Indicates whether the message is a warning only or a notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn4
	 * BuyIn4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WrngInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarningIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the message is a warning only or a notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BuyIn1#mmWarningIndicator
	 * BuyIn1.mmWarningIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWarningIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BuyIn4.mmObject();
			isDerived = false;
			xmlTag = "WrngInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarningIndicator";
			definition = "Indicates whether the message is a warning only or a notification.";
			previousVersion_lazy = () -> BuyIn1.mmWarningIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected DateFormat15Choice expectedBuyInDate;
	/**
	 * Provides the date at which the buy-in will occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat15Choice
	 * DateFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmBuyinDate
	 * BuyIn.mmBuyinDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn4
	 * BuyIn4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdBuyInDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedBuyInDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date at which the buy-in will occur."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BuyIn1#mmExpectedBuyInDate
	 * BuyIn1.mmExpectedBuyInDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedBuyInDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmBuyinDate;
			componentContext_lazy = () -> BuyIn4.mmObject();
			isDerived = false;
			xmlTag = "XpctdBuyInDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedBuyInDate";
			definition = "Provides the date at which the buy-in will occur.";
			previousVersion_lazy = () -> BuyIn1.mmExpectedBuyInDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateFormat15Choice.mmObject();
		}
	};
	protected ISODate cancellationLimitDate;
	/**
	 * Identifies the latest date by which the buy-in operation can be
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn4
	 * BuyIn4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlLmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationLimitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the latest date by which the buy-in operation can be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationLimitDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BuyIn4.mmObject();
			isDerived = false;
			xmlTag = "CxlLmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationLimitDate";
			definition = "Identifies the latest date by which the buy-in operation can be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate buyInReversionDate;
	/**
	 * Identifies the date by which the buy-in operation is reversed by the CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn4
	 * BuyIn4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyInRvrsnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInReversionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the date by which the buy-in operation is reversed by the CCP."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuyInReversionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BuyIn4.mmObject();
			isDerived = false;
			xmlTag = "BuyInRvrsnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInReversionDate";
			definition = "Identifies the date by which the buy-in operation is reversed by the CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BuyIn4.mmWarningIndicator, BuyIn4.mmExpectedBuyInDate, BuyIn4.mmCancellationLimitDate, BuyIn4.mmBuyInReversionDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(BuyInNotificationV03.mmNotificationDetails);
				trace_lazy = () -> BuyIn.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyIn4";
				definition = "Specifies elements related to the notification (or warn) sent by the central counterparty to the clearing member in the context of the buy in process.";
				previousVersion_lazy = () -> BuyIn1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "WrngInd")
	public YesNoIndicator getWarningIndicator() {
		return warningIndicator;
	}

	public void setWarningIndicator(YesNoIndicator warningIndicator) {
		this.warningIndicator = warningIndicator;
	}

	@XmlElement(name = "XpctdBuyInDt", required = true)
	public DateFormat15Choice getExpectedBuyInDate() {
		return expectedBuyInDate;
	}

	public void setExpectedBuyInDate(DateFormat15Choice expectedBuyInDate) {
		this.expectedBuyInDate = expectedBuyInDate;
	}

	@XmlElement(name = "CxlLmtDt")
	public ISODate getCancellationLimitDate() {
		return cancellationLimitDate;
	}

	public void setCancellationLimitDate(ISODate cancellationLimitDate) {
		this.cancellationLimitDate = cancellationLimitDate;
	}

	@XmlElement(name = "BuyInRvrsnDt")
	public ISODate getBuyInReversionDate() {
		return buyInReversionDate;
	}

	public void setBuyInReversionDate(ISODate buyInReversionDate) {
		this.buyInReversionDate = buyInReversionDate;
	}
}