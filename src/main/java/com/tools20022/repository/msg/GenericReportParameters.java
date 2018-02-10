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
import com.tools20022.repository.choice.AccountIdentificationFormatChoice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters for which a user defined report is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericReportParameters#mmAccountIdentification
 * GenericReportParameters.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericReportParameters#mmFinancialInstrumentDetails
 * GenericReportParameters.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericReportParameters#mmReportDescription
 * GenericReportParameters.mmReportDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericReportParameters#mmDate
 * GenericReportParameters.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericReportParameters#mmUserDefinedParameter
 * GenericReportParameters.mmUserDefinedParameter}</li>
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
 * "GenericReportParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters for which a user defined report is requested."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GenericReportParameters", propOrder = {"accountIdentification", "financialInstrumentDetails", "reportDescription", "date", "userDefinedParameter"})
public class GenericReportParameters {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected List<AccountIdentificationFormatChoice> accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericReportParameters.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected List<com.tools20022.repository.msg.FinancialInstrument17> financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument17
	 * FinancialInstrument17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument for which the user-defined report is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericReportParameters.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument for which the user-defined report is requested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument17.mmObject();
		}
	};
	@XmlElement(name = "RptDesc", required = true)
	protected Max70Text reportDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of report requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericReportParameters.mmObject();
			isDerived = false;
			xmlTag = "RptDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDescription";
			definition = "Type of report requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "Dt")
	protected ISODate date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date for which the report is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericReportParameters.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date for which the report is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "UsrDfndParam")
	protected List<Max70Text> userDefinedParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrDfndParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefinedParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters that cannot be specifed in the structured fields provided."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUserDefinedParameter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericReportParameters.mmObject();
			isDerived = false;
			xmlTag = "UsrDfndParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedParameter";
			definition = "Parameters that cannot be specifed in the structured fields provided.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericReportParameters.mmAccountIdentification, com.tools20022.repository.msg.GenericReportParameters.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.GenericReportParameters.mmReportDescription, com.tools20022.repository.msg.GenericReportParameters.mmDate, com.tools20022.repository.msg.GenericReportParameters.mmUserDefinedParameter);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GenericReportParameters";
				definition = "Parameters for which a user defined report is requested.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentificationFormatChoice> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public GenericReportParameters setAccountIdentification(List<AccountIdentificationFormatChoice> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public List<FinancialInstrument17> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? financialInstrumentDetails = new ArrayList<>() : financialInstrumentDetails;
	}

	public GenericReportParameters setFinancialInstrumentDetails(List<com.tools20022.repository.msg.FinancialInstrument17> financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Max70Text getReportDescription() {
		return reportDescription;
	}

	public GenericReportParameters setReportDescription(Max70Text reportDescription) {
		this.reportDescription = Objects.requireNonNull(reportDescription);
		return this;
	}

	public Optional<ISODate> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public GenericReportParameters setDate(ISODate date) {
		this.date = date;
		return this;
	}

	public List<Max70Text> getUserDefinedParameter() {
		return userDefinedParameter == null ? userDefinedParameter = new ArrayList<>() : userDefinedParameter;
	}

	public GenericReportParameters setUserDefinedParameter(List<Max70Text> userDefinedParameter) {
		this.userDefinedParameter = Objects.requireNonNull(userDefinedParameter);
		return this;
	}
}