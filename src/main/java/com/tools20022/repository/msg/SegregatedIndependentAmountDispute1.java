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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DisputeResolutionType1Choice;
import com.tools20022.repository.entity.DisputeManagement;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides for the segregated independent amount, the dispute details like the
 * dispute amount or the dispute date and the resolution type details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountDispute1#mmDisputeDetails
 * SegregatedIndependentAmountDispute1.mmDisputeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountDispute1#mmDisputeResolutionType1Choice
 * SegregatedIndependentAmountDispute1.mmDisputeResolutionType1Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DisputeManagement
 * DisputeManagement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2017</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SegregatedIndependentAmountDispute1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for the segregated independent amount, the dispute details like the dispute amount or the dispute date and the resolution type details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SegregatedIndependentAmountDispute1", propOrder = {"disputeDetails", "disputeResolutionType1Choice"})
public class SegregatedIndependentAmountDispute1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Dispute1 disputeDetails;
	/**
	 * Details of the disputed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Dispute1 Dispute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountDispute1
	 * SegregatedIndependentAmountDispute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsptDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the disputed instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDisputeDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SegregatedIndependentAmountDispute1.mmObject();
			isDerived = false;
			xmlTag = "DsptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeDetails";
			definition = "Details of the disputed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Dispute1.mmObject();
		}
	};
	protected List<DisputeResolutionType1Choice> disputeResolutionType1Choice;
	/**
	 * Specifies the type of dispute that is to be resolved regarding the
	 * disputed collateral amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DisputeResolutionType1Choice
	 * DisputeResolutionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountDispute1
	 * SegregatedIndependentAmountDispute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsptRsltnTp1Chc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeResolutionType1Choice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDisputeResolutionType1Choice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SegregatedIndependentAmountDispute1.mmObject();
			isDerived = false;
			xmlTag = "DsptRsltnTp1Chc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeResolutionType1Choice";
			definition = "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DisputeResolutionType1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SegregatedIndependentAmountDispute1.mmDisputeDetails, SegregatedIndependentAmountDispute1.mmDisputeResolutionType1Choice);
				trace_lazy = () -> DisputeManagement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2017");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SegregatedIndependentAmountDispute1";
				definition = "Provides for the segregated independent amount, the dispute details like the dispute amount or the dispute date and the resolution type details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DsptDtls", required = true)
	public Dispute1 getDisputeDetails() {
		return disputeDetails;
	}

	public void setDisputeDetails(com.tools20022.repository.msg.Dispute1 disputeDetails) {
		this.disputeDetails = disputeDetails;
	}

	@XmlElement(name = "DsptRsltnTp1Chc")
	public List<DisputeResolutionType1Choice> getDisputeResolutionType1Choice() {
		return disputeResolutionType1Choice;
	}

	public void setDisputeResolutionType1Choice(List<DisputeResolutionType1Choice> disputeResolutionType1Choice) {
		this.disputeResolutionType1Choice = disputeResolutionType1Choice;
	}
}