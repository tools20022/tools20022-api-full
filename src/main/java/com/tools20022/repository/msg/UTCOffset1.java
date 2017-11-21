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
import com.tools20022.repository.area.tsmt.ActivityReportSetUpRequestV02;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.UTCOffset;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the parameters to calculate the local reporting time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UTCOffset1#mmSign
 * UTCOffset1.mmSign}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UTCOffset1#mmNumberOfHours
 * UTCOffset1.mmNumberOfHours}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UTCOffset UTCOffset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportSetUpRequestV02#mmUTCOffset
 * ActivityReportSetUpRequestV02.mmUTCOffset}</li>
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
 * "UTCOffset1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters to calculate the local reporting time."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UTCOffset1", propOrder = {"sign", "numberOfHours"})
public class UTCOffset1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PlusOrMinusIndicator sign;
	/**
	 * Indicates whether the offset is before or after 00:00 hour UTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UTCOffset#mmSign
	 * UTCOffset.mmSign}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UTCOffset1
	 * UTCOffset1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset is before or after 00:00 hour UTC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSign = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UTCOffset.mmSign;
			componentContext_lazy = () -> UTCOffset1.mmObject();
			isDerived = false;
			xmlTag = "Sgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sign";
			definition = "Indicates whether the offset is before or after 00:00 hour UTC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	protected ISOTime numberOfHours;
	/**
	 * Offset of the reporting time, in hours, before or after 00:00 hour UTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UTCOffset#mmNumberOfHours
	 * UTCOffset.mmNumberOfHours}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UTCOffset1
	 * UTCOffset1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfHrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offset of the reporting time, in hours,  before or after 00:00 hour UTC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfHours = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UTCOffset.mmNumberOfHours;
			componentContext_lazy = () -> UTCOffset1.mmObject();
			isDerived = false;
			xmlTag = "NbOfHrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfHours";
			definition = "Offset of the reporting time, in hours,  before or after 00:00 hour UTC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UTCOffset1.mmSign, UTCOffset1.mmNumberOfHours);
				messageBuildingBlock_lazy = () -> Arrays.asList(ActivityReportSetUpRequestV02.mmUTCOffset);
				trace_lazy = () -> UTCOffset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UTCOffset1";
				definition = "Specifies the parameters to calculate the local reporting time.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Sgn", required = true)
	public PlusOrMinusIndicator getSign() {
		return sign;
	}

	public void setSign(PlusOrMinusIndicator sign) {
		this.sign = sign;
	}

	@XmlElement(name = "NbOfHrs", required = true)
	public ISOTime getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(ISOTime numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
}