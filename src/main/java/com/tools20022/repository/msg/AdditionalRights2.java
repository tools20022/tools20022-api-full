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
import com.tools20022.repository.choice.AdditionalRightCode1Choice;
import com.tools20022.repository.choice.AdditionalRightThreshold1Choice;
import com.tools20022.repository.choice.DateFormat29Choice;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.AdditionalRight;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the general meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRight
 * AdditionalRights2.mmAdditionalRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightInformationURLAddress
 * AdditionalRights2.mmAdditionalRightInformationURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightDeadline
 * AdditionalRights2.mmAdditionalRightDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightMarketDeadline
 * AdditionalRights2.mmAdditionalRightMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightThreshold
 * AdditionalRights2.mmAdditionalRightThreshold}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AdditionalRight
 * AdditionalRight}</li>
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
 * "AdditionalRights2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalRights1
 * AdditionalRights1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AdditionalRights2", propOrder = {"additionalRight", "additionalRightInformationURLAddress", "additionalRightDeadline", "additionalRightMarketDeadline", "additionalRightThreshold"})
public class AdditionalRights2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AdditionalRightCode1Choice additionalRight;
	/**
	 * Specific rights granted to the shareholders that can be exercised at
	 * shareholders meetings, for example, the right to ask questions, the right
	 * to add items to the agenda or table draft resolutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalRightCode1Choice
	 * AdditionalRightCode1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmType
	 * AdditionalRight.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific rights granted to the shareholders that can be exercised at shareholders meetings, for example, the right to ask questions, the right to add items to the agenda or table draft resolutions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRight
	 * AdditionalRights1.mmAdditionalRight}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRight = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AdditionalRight.mmType;
			componentContext_lazy = () -> AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRight";
			definition = "Specific rights granted to the shareholders that can be exercised at shareholders meetings, for example, the right to ask questions, the right to add items to the agenda or table draft resolutions.";
			previousVersion_lazy = () -> AdditionalRights1.mmAdditionalRight;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalRightCode1Choice.mmObject();
		}
	};
	protected Max256Text additionalRightInformationURLAddress;
	/**
	 * Address to use over the www (HTTP) service where additional information
	 * on specific rights granted to the shareholders can be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtInfURLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightInformationURLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address to use over the www (HTTP) service where additional information on specific rights granted to the shareholders can be found."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRightInformationURLAddress
	 * AdditionalRights1.mmAdditionalRightInformationURLAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRightInformationURLAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtInfURLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightInformationURLAddress";
			definition = "Address to use over the www (HTTP) service where additional information on specific rights granted to the shareholders can be found.";
			previousVersion_lazy = () -> AdditionalRights1.mmAdditionalRightInformationURLAddress;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected DateFormat29Choice additionalRightDeadline;
	/**
	 * Additional right granted to determine the date and time by which security
	 * holders can propose amendments or new resolutions. This deadline is set
	 * by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
	 * Meeting.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by an intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRightDeadline
	 * AdditionalRights1.mmAdditionalRightDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRightDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmDeadline;
			componentContext_lazy = () -> AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightDeadline";
			definition = "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by an intermediary.";
			previousVersion_lazy = () -> AdditionalRights1.mmAdditionalRightDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	protected DateFormat29Choice additionalRightMarketDeadline;
	/**
	 * Additional right granted to determine the date and time by which security
	 * holders can propose amendments or new resolutions. This deadline is set
	 * by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRightMarketDeadline
	 * AdditionalRights1.mmAdditionalRightMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRightMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightMarketDeadline";
			definition = "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by the issuer.";
			previousVersion_lazy = () -> AdditionalRights1.mmAdditionalRightMarketDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	protected AdditionalRightThreshold1Choice additionalRightThreshold;
	/**
	 * Additional right granted to specify the minimum stake in share capital or
	 * cash value or number of security holders required to table resolutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalRightThreshold1Choice
	 * AdditionalRightThreshold1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmAdditionalRightThreshold
	 * AdditionalRight.mmAdditionalRightThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRightThreshold
	 * AdditionalRights1.mmAdditionalRightThreshold}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRightThreshold = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AdditionalRight.mmAdditionalRightThreshold;
			componentContext_lazy = () -> AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightThreshold";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			previousVersion_lazy = () -> AdditionalRights1.mmAdditionalRightThreshold;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalRightThreshold1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalRights2.mmAdditionalRight, AdditionalRights2.mmAdditionalRightInformationURLAddress, AdditionalRights2.mmAdditionalRightDeadline,
						AdditionalRights2.mmAdditionalRightMarketDeadline, AdditionalRights2.mmAdditionalRightThreshold);
				trace_lazy = () -> AdditionalRight.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalRights2";
				definition = "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
				previousVersion_lazy = () -> AdditionalRights1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AddtlRght", required = true)
	public AdditionalRightCode1Choice getAdditionalRight() {
		return additionalRight;
	}

	public void setAdditionalRight(AdditionalRightCode1Choice additionalRight) {
		this.additionalRight = additionalRight;
	}

	@XmlElement(name = "AddtlRghtInfURLAdr")
	public Max256Text getAdditionalRightInformationURLAddress() {
		return additionalRightInformationURLAddress;
	}

	public void setAdditionalRightInformationURLAddress(Max256Text additionalRightInformationURLAddress) {
		this.additionalRightInformationURLAddress = additionalRightInformationURLAddress;
	}

	@XmlElement(name = "AddtlRghtDdln")
	public DateFormat29Choice getAdditionalRightDeadline() {
		return additionalRightDeadline;
	}

	public void setAdditionalRightDeadline(DateFormat29Choice additionalRightDeadline) {
		this.additionalRightDeadline = additionalRightDeadline;
	}

	@XmlElement(name = "AddtlRghtMktDdln")
	public DateFormat29Choice getAdditionalRightMarketDeadline() {
		return additionalRightMarketDeadline;
	}

	public void setAdditionalRightMarketDeadline(DateFormat29Choice additionalRightMarketDeadline) {
		this.additionalRightMarketDeadline = additionalRightMarketDeadline;
	}

	@XmlElement(name = "AddtlRghtThrshld")
	public AdditionalRightThreshold1Choice getAdditionalRightThreshold() {
		return additionalRightThreshold;
	}

	public void setAdditionalRightThreshold(AdditionalRightThreshold1Choice additionalRightThreshold) {
		this.additionalRightThreshold = additionalRightThreshold;
	}
}