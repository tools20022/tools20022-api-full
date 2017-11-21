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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Investor;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Conditions applicable when the investor is covered by the "de minimis"
 * exemption.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1#mmNewIssuePermission
 * DeMinimusApplicable1.mmNewIssuePermission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1#mmPercentage
 * DeMinimusApplicable1.mmPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Investor Investor}</li>
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
 * "DeMinimusApplicable1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conditions applicable when the investor is covered by the \"de minimis\" exemption."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DeMinimusApplicable1", propOrder = {"newIssuePermission", "percentage"})
public class DeMinimusApplicable1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator newIssuePermission;
	/**
	 * Indicates whether the investor permits its beneficial owners that are
	 * restricted persons, if any, to participate in profits and losses
	 * allocated to the investor that are attribute to new issue securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Investor#mmNewIssuePermission
	 * Investor.mmNewIssuePermission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1
	 * DeMinimusApplicable1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewIssePrmssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssuePermission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor permits its beneficial owners that are restricted persons, if any, to participate in profits and losses allocated to the investor that are attribute to new issue securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewIssuePermission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Investor.mmNewIssuePermission;
			componentContext_lazy = () -> DeMinimusApplicable1.mmObject();
			isDerived = false;
			xmlTag = "NewIssePrmssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssuePermission";
			definition = "Indicates whether the investor permits its beneficial owners that are restricted persons, if any, to participate in profits and losses allocated to the investor that are attribute to new issue securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PercentageRate percentage;
	/**
	 * Percentage of the new issue profits and losses that it receives to
	 * beneficial owners that are restricted persons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1
	 * DeMinimusApplicable1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the new issue profits and losses that it receives to beneficial owners that are restricted persons."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DeMinimusApplicable1.mmObject();
			isDerived = false;
			xmlTag = "Pctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Percentage of the new issue profits and losses that it receives to beneficial owners that are restricted persons.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DeMinimusApplicable1.mmNewIssuePermission, DeMinimusApplicable1.mmPercentage);
				trace_lazy = () -> Investor.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeMinimusApplicable1";
				definition = "Conditions applicable when the investor is covered by the \"de minimis\" exemption.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NewIssePrmssn", required = true)
	public YesNoIndicator getNewIssuePermission() {
		return newIssuePermission;
	}

	public void setNewIssuePermission(YesNoIndicator newIssuePermission) {
		this.newIssuePermission = newIssuePermission;
	}

	@XmlElement(name = "Pctg")
	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}
}