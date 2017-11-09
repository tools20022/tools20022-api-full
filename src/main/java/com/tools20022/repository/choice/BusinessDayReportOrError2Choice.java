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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BusinessDay2;
import com.tools20022.repository.msg.ErrorHandling3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Choice between business day information details or a business error when the
 * requested data cannot be retrieved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError2Choice#mmBusinessDayInformation
 * BusinessDayReportOrError2Choice.mmBusinessDayInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError2Choice#mmBusinessError
 * BusinessDayReportOrError2Choice.mmBusinessError}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayReportOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between business day information details or a business error when the requested data cannot be retrieved."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError6Choice
 * BusinessDayReportOrError6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError4Choice
 * BusinessDayReportOrError4Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class BusinessDayReportOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected BusinessDay2 businessDayInformation;
	/**
	 * Requested system details for a specific business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BusinessDay2
	 * BusinessDay2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError2Choice
	 * BusinessDayReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDayInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested system details for a specific business day."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError6Choice#mmBusinessDayInformation
	 * BusinessDayReportOrError6Choice.mmBusinessDayInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError4Choice#mmBusinessDayInformation
	 * BusinessDayReportOrError4Choice.mmBusinessDayInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessDayInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessDayReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizDayInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDayInformation";
			definition = "Requested system details for a specific business day.";
			nextVersions_lazy = () -> Arrays.asList(BusinessDayReportOrError6Choice.mmBusinessDayInformation, BusinessDayReportOrError4Choice.mmBusinessDayInformation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BusinessDay2.mmObject();
		}
	};
	protected List<ErrorHandling3> businessError;
	/**
	 * Reason the requested business information is not given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError2Choice
	 * BusinessDayReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError6Choice#mmBusinessError
	 * BusinessDayReportOrError6Choice.mmBusinessError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError4Choice#mmBusinessError
	 * BusinessDayReportOrError4Choice.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessDayReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given. ";
			nextVersions_lazy = () -> Arrays.asList(BusinessDayReportOrError6Choice.mmBusinessError, BusinessDayReportOrError4Choice.mmBusinessError);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BusinessDayReportOrError2Choice.mmBusinessDayInformation, BusinessDayReportOrError2Choice.mmBusinessError);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessDayReportOrError2Choice";
				definition = "Choice between business day information details or a business error when the requested data cannot be retrieved.";
				nextVersions_lazy = () -> Arrays.asList(BusinessDayReportOrError6Choice.mmObject(), BusinessDayReportOrError4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessDay2 getBusinessDayInformation() {
		return businessDayInformation;
	}

	public void setBusinessDayInformation(BusinessDay2 businessDayInformation) {
		this.businessDayInformation = businessDayInformation;
	}

	public List<ErrorHandling3> getBusinessError() {
		return businessError;
	}

	public void setBusinessError(List<ErrorHandling3> businessError) {
		this.businessError = businessError;
	}
}