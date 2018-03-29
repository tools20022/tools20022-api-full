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
import com.tools20022.repository.area.colr.InterestPaymentResponseV03;
import com.tools20022.repository.area.colr.InterestPaymentResponseV04;
import com.tools20022.repository.choice.RejectionReason21FormatChoice;
import com.tools20022.repository.codeset.Status4Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralStatus;
import com.tools20022.repository.entity.Status;
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
 * Provides details about the reponse to the interest payment request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmResponseType
 * InterestResponse1.mmResponseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmRejectionReason
 * InterestResponse1.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmRejectionReasonInformation
 * InterestResponse1.mmRejectionReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmInterestPaymentRequestIdentification
 * InterestResponse1.mmInterestPaymentRequestIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmInterestResponse
 * InterestPaymentResponseV03.mmInterestResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmInterestResponse
 * InterestPaymentResponseV04.mmInterestResponse}</li>
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
 * "InterestResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the reponse to the interest payment request."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestResponse1", propOrder = {"responseType", "rejectionReason", "rejectionReasonInformation", "interestPaymentRequestIdentification"})
public class InterestResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RspnTp", required = true)
	protected Status4Code responseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status4Code
	 * Status4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1
	 * InterestResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the type of the response, either accepted or rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestResponse1, Status4Code> mmResponseType = new MMMessageAttribute<InterestResponse1, Status4Code>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestResponse1.mmObject();
			isDerived = false;
			xmlTag = "RspnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Provides the type of the response, either accepted or rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status4Code.mmObject();
		}

		@Override
		public Status4Code getValue(InterestResponse1 obj) {
			return obj.getResponseType();
		}

		@Override
		public void setValue(InterestResponse1 obj, Status4Code value) {
			obj.setResponseType(value);
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReason21FormatChoice rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21FormatChoice
	 * RejectionReason21FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmInterestRejectionReason
	 * CollateralStatus.mmInterestRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1
	 * InterestResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a reason for rejection identified using a code or a proprietary format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestResponse1, Optional<RejectionReason21FormatChoice>> mmRejectionReason = new MMMessageAttribute<InterestResponse1, Optional<RejectionReason21FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmInterestRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestResponse1.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Provides a reason for rejection identified using a code or a proprietary format.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RejectionReason21FormatChoice.mmObject();
		}

		@Override
		public Optional<RejectionReason21FormatChoice> getValue(InterestResponse1 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(InterestResponse1 obj, Optional<RejectionReason21FormatChoice> value) {
			obj.setRejectionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnRsnInf")
	protected Max140Text rejectionReasonInformation;
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
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1
	 * InterestResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information on the rejection reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestResponse1, Optional<Max140Text>> mmRejectionReasonInformation = new MMMessageAttribute<InterestResponse1, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestResponse1.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReasonInformation";
			definition = "Provides additional information on the rejection reason.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(InterestResponse1 obj) {
			return obj.getRejectionReasonInformation();
		}

		@Override
		public void setValue(InterestResponse1 obj, Optional<Max140Text> value) {
			obj.setRejectionReasonInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstPmtReqId", required = true)
	protected Max35Text interestPaymentRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1
	 * InterestResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the reference to the interest payment request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestResponse1, Max35Text> mmInterestPaymentRequestIdentification = new MMMessageAttribute<InterestResponse1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestResponse1.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRequestIdentification";
			definition = "Provides the reference to the interest payment request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InterestResponse1 obj) {
			return obj.getInterestPaymentRequestIdentification();
		}

		@Override
		public void setValue(InterestResponse1 obj, Max35Text value) {
			obj.setInterestPaymentRequestIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestResponse1.mmResponseType, com.tools20022.repository.msg.InterestResponse1.mmRejectionReason,
						com.tools20022.repository.msg.InterestResponse1.mmRejectionReasonInformation, com.tools20022.repository.msg.InterestResponse1.mmInterestPaymentRequestIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(InterestPaymentResponseV03.mmInterestResponse, InterestPaymentResponseV04.mmInterestResponse);
				trace_lazy = () -> CollateralStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestResponse1";
				definition = "Provides details about the reponse to the interest payment request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Status4Code getResponseType() {
		return responseType;
	}

	public InterestResponse1 setResponseType(Status4Code responseType) {
		this.responseType = Objects.requireNonNull(responseType);
		return this;
	}

	public Optional<RejectionReason21FormatChoice> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public InterestResponse1 setRejectionReason(RejectionReason21FormatChoice rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public Optional<Max140Text> getRejectionReasonInformation() {
		return rejectionReasonInformation == null ? Optional.empty() : Optional.of(rejectionReasonInformation);
	}

	public InterestResponse1 setRejectionReasonInformation(Max140Text rejectionReasonInformation) {
		this.rejectionReasonInformation = rejectionReasonInformation;
		return this;
	}

	public Max35Text getInterestPaymentRequestIdentification() {
		return interestPaymentRequestIdentification;
	}

	public InterestResponse1 setInterestPaymentRequestIdentification(Max35Text interestPaymentRequestIdentification) {
		this.interestPaymentRequestIdentification = Objects.requireNonNull(interestPaymentRequestIdentification);
		return this;
	}
}