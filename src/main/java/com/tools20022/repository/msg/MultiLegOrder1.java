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
import com.tools20022.repository.codeset.MultilegReportType1Code;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the multileg order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultiLegOrder1#mmReportTypeRequest
 * MultiLegOrder1.mmReportTypeRequest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultiLegOrder1#mmOrderDetails
 * MultiLegOrder1.mmOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultiLegOrder1#mmLegGroupDetails
 * MultiLegOrder1.mmLegGroupDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
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
 * "MultiLegOrder1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the multileg order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MultiLegOrder1", propOrder = {"reportTypeRequest", "orderDetails", "legGroupDetails"})
public class MultiLegOrder1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptTpReq")
	protected MultilegReportType1Code reportTypeRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MultilegReportType1Code
	 * MultilegReportType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultiLegOrder1 MultiLegOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTpReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTypeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the method of execution reporting requested by issuer of the order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportTypeRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MultiLegOrder1.mmObject();
			isDerived = false;
			xmlTag = "RptTpReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTypeRequest";
			definition = "Indicates the method of execution reporting requested by issuer of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MultilegReportType1Code.mmObject();
		}
	};
	@XmlElement(name = "OrdrDtls", required = true)
	protected Order3 orderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Order3 Order3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultiLegOrder1 MultiLegOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides order details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MultiLegOrder1.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetails";
			definition = "Provides order details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Order3.mmObject();
		}
	};
	@XmlElement(name = "LegGrpDtls")
	protected List<com.tools20022.repository.msg.InstrumentLeg3> legGroupDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InstrumentLeg3
	 * InstrumentLeg3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
	 * Asset.mmLegAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultiLegOrder1 MultiLegOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegGrpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegGroupDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about each intrument leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegGroupDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmLegAdditionalInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultiLegOrder1.mmObject();
			isDerived = false;
			xmlTag = "LegGrpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegGroupDetails";
			definition = "Provides details about each intrument leg.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstrumentLeg3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MultiLegOrder1.mmReportTypeRequest, com.tools20022.repository.msg.MultiLegOrder1.mmOrderDetails,
						com.tools20022.repository.msg.MultiLegOrder1.mmLegGroupDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MultiLegOrder1";
				definition = "Provides details about the multileg order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MultilegReportType1Code> getReportTypeRequest() {
		return reportTypeRequest == null ? Optional.empty() : Optional.of(reportTypeRequest);
	}

	public MultiLegOrder1 setReportTypeRequest(MultilegReportType1Code reportTypeRequest) {
		this.reportTypeRequest = reportTypeRequest;
		return this;
	}

	public Order3 getOrderDetails() {
		return orderDetails;
	}

	public MultiLegOrder1 setOrderDetails(com.tools20022.repository.msg.Order3 orderDetails) {
		this.orderDetails = Objects.requireNonNull(orderDetails);
		return this;
	}

	public List<InstrumentLeg3> getLegGroupDetails() {
		return legGroupDetails == null ? legGroupDetails = new ArrayList<>() : legGroupDetails;
	}

	public MultiLegOrder1 setLegGroupDetails(List<com.tools20022.repository.msg.InstrumentLeg3> legGroupDetails) {
		this.legGroupDetails = Objects.requireNonNull(legGroupDetails);
		return this;
	}
}