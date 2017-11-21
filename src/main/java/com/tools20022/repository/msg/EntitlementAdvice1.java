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
import com.tools20022.repository.area.seev.AgentCADistributionBreakdownAdviceV01;
import com.tools20022.repository.choice.CorporateActionOption1FormatChoice;
import com.tools20022.repository.choice.DateFormat4Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.entity.CorporateActionDeadline;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the CA entitlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmOptionType
 * EntitlementAdvice1.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmOptionNumber
 * EntitlementAdvice1.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmRecordDate
 * EntitlementAdvice1.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmPaymentDate
 * EntitlementAdvice1.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmAccountAndDistributionDetails
 * EntitlementAdvice1.mmAccountAndDistributionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADistributionBreakdownAdviceV01#mmCorporateActionDistributionDetails
 * AgentCADistributionBreakdownAdviceV01.mmCorporateActionDistributionDetails}</li>
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
 * "EntitlementAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the CA entitlement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "EntitlementAdvice1", propOrder = {"optionType", "optionNumber", "recordDate", "paymentDate", "accountAndDistributionDetails"})
public class EntitlementAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionOption1FormatChoice optionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
	 * CorporateActionOption1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1
	 * EntitlementAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> EntitlementAdvice1.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}
	};
	protected Exact3NumericText optionNumber;
	/**
	 * Number identifying the available corporate action options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1
	 * EntitlementAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> EntitlementAdvice1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected DateFormat4Choice recordDate;
	/**
	 * Date on which the holders of securities are/will be recorded for the
	 * income being paid or for entitlement to the rights or offer/privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1
	 * EntitlementAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the holders of securities are/will be recorded for the income being paid or for entitlement to the rights or offer/privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecordDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> EntitlementAdvice1.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date on which the holders of securities are/will be recorded for the income being paid or for entitlement to the rights or offer/privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice paymentDate;
	/**
	 * Date on which securities/cash will be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1
	 * EntitlementAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which securities/cash will be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> EntitlementAdvice1.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date on which securities/cash will be paid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Entitlement1> accountAndDistributionDetails;
	/**
	 * Provides information about the entitlement and the entitled account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Entitlement1
	 * Entitlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1
	 * EntitlementAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctAndDstrbtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountAndDistributionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the entitlement and the entitled account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountAndDistributionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEntitlement.mmObject();
			componentContext_lazy = () -> EntitlementAdvice1.mmObject();
			isDerived = false;
			xmlTag = "AcctAndDstrbtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountAndDistributionDetails";
			definition = "Provides information about the entitlement and the entitled account.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Entitlement1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EntitlementAdvice1.mmOptionType, EntitlementAdvice1.mmOptionNumber, EntitlementAdvice1.mmRecordDate, EntitlementAdvice1.mmPaymentDate,
						EntitlementAdvice1.mmAccountAndDistributionDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCADistributionBreakdownAdviceV01.mmCorporateActionDistributionDetails);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntitlementAdvice1";
				definition = "Provides information about the CA entitlement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OptnTp", required = true)
	public CorporateActionOption1FormatChoice getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOption1FormatChoice optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "OptnNb", required = true)
	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
	}

	@XmlElement(name = "RcrdDt")
	public DateFormat4Choice getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(DateFormat4Choice recordDate) {
		this.recordDate = recordDate;
	}

	@XmlElement(name = "PmtDt")
	public DateFormat4Choice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateFormat4Choice paymentDate) {
		this.paymentDate = paymentDate;
	}

	@XmlElement(name = "AcctAndDstrbtnDtls", required = true)
	public List<Entitlement1> getAccountAndDistributionDetails() {
		return accountAndDistributionDetails;
	}

	public void setAccountAndDistributionDetails(List<com.tools20022.repository.msg.Entitlement1> accountAndDistributionDetails) {
		this.accountAndDistributionDetails = accountAndDistributionDetails;
	}
}