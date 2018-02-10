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
import com.tools20022.repository.area.auth.CCPInvestmentsReportV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Deposit1;
import com.tools20022.repository.msg.OtherInvestment1;
import com.tools20022.repository.msg.RepurchaseAgreement2;
import com.tools20022.repository.msg.SecurityIdentificationAndAmount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the financial instrument purchased by a central counterparty using
 * clearing member assets.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Investment1Choice#mmUnsecuredCashDeposit
 * Investment1Choice.mmUnsecuredCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Investment1Choice#mmCentralBankDeposit
 * Investment1Choice.mmCentralBankDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Investment1Choice#mmRepurchaseAgreement
 * Investment1Choice.mmRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Investment1Choice#mmOtherInvestments
 * Investment1Choice.mmOtherInvestments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Investment1Choice#mmOutrightInvestment
 * Investment1Choice.mmOutrightInvestment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPInvestmentsReportV01#mmInvestment
 * CCPInvestmentsReportV01.mmInvestment}</li>
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
 * "Investment1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the financial instrument purchased by a central counterparty using clearing member assets."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Investment1Choice", propOrder = {"unsecuredCashDeposit", "centralBankDeposit", "repurchaseAgreement", "otherInvestments", "outrightInvestment"})
public class Investment1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UscrdCshDpst", required = true)
	protected Deposit1 unsecuredCashDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Deposit1 Deposit1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Investment1Choice
	 * Investment1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UscrdCshDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsecuredCashDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the investment was made in an unsecured deposit at a commercial deposit taking institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnsecuredCashDeposit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Investment1Choice.mmObject();
			isDerived = false;
			xmlTag = "UscrdCshDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredCashDeposit";
			definition = "Indicates that the investment was made in an unsecured deposit at a commercial deposit taking institution.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Deposit1.mmObject();
		}
	};
	@XmlElement(name = "CntrlBkDpst", required = true)
	protected Deposit1 centralBankDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Deposit1 Deposit1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Investment1Choice
	 * Investment1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrlBkDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the bank deposit is placed at a central bank."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCentralBankDeposit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Investment1Choice.mmObject();
			isDerived = false;
			xmlTag = "CntrlBkDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankDeposit";
			definition = "Indicates that the bank deposit is placed at a central bank.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Deposit1.mmObject();
		}
	};
	@XmlElement(name = "RpAgrmt", required = true)
	protected RepurchaseAgreement2 repurchaseAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
	 * RepurchaseAgreement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Investment1Choice
	 * Investment1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the investment was made in a repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchaseAgreement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Investment1Choice.mmObject();
			isDerived = false;
			xmlTag = "RpAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Indicates that the investment was made in a repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepurchaseAgreement2.mmObject();
		}
	};
	@XmlElement(name = "OthrInvstmts", required = true)
	protected OtherInvestment1 otherInvestments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherInvestment1
	 * OtherInvestment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Investment1Choice
	 * Investment1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrInvstmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherInvestments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the investment is not covered by other available investment options."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherInvestments = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Investment1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrInvstmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherInvestments";
			definition = "Indicates that the investment is not covered by other available investment options.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OtherInvestment1.mmObject();
		}
	};
	@XmlElement(name = "OutrghtInvstmt", required = true)
	protected SecurityIdentificationAndAmount1 outrightInvestment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentificationAndAmount1
	 * SecurityIdentificationAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Investment1Choice
	 * Investment1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutrghtInvstmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutrightInvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the investment was an outright purchase of a financial instrument or security as an investment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOutrightInvestment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Investment1Choice.mmObject();
			isDerived = false;
			xmlTag = "OutrghtInvstmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutrightInvestment";
			definition = "Indicates that the investment was an outright purchase of a financial instrument or security as an investment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentificationAndAmount1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Investment1Choice.mmUnsecuredCashDeposit, com.tools20022.repository.choice.Investment1Choice.mmCentralBankDeposit,
						com.tools20022.repository.choice.Investment1Choice.mmRepurchaseAgreement, com.tools20022.repository.choice.Investment1Choice.mmOtherInvestments,
						com.tools20022.repository.choice.Investment1Choice.mmOutrightInvestment);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPInvestmentsReportV01.mmInvestment);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Investment1Choice";
				definition = "Specifies the financial instrument purchased by a central counterparty using clearing member assets.";
			}
		});
		return mmObject_lazy.get();
	}

	public Deposit1 getUnsecuredCashDeposit() {
		return unsecuredCashDeposit;
	}

	public Investment1Choice setUnsecuredCashDeposit(Deposit1 unsecuredCashDeposit) {
		this.unsecuredCashDeposit = Objects.requireNonNull(unsecuredCashDeposit);
		return this;
	}

	public Deposit1 getCentralBankDeposit() {
		return centralBankDeposit;
	}

	public Investment1Choice setCentralBankDeposit(Deposit1 centralBankDeposit) {
		this.centralBankDeposit = Objects.requireNonNull(centralBankDeposit);
		return this;
	}

	public RepurchaseAgreement2 getRepurchaseAgreement() {
		return repurchaseAgreement;
	}

	public Investment1Choice setRepurchaseAgreement(RepurchaseAgreement2 repurchaseAgreement) {
		this.repurchaseAgreement = Objects.requireNonNull(repurchaseAgreement);
		return this;
	}

	public OtherInvestment1 getOtherInvestments() {
		return otherInvestments;
	}

	public Investment1Choice setOtherInvestments(OtherInvestment1 otherInvestments) {
		this.otherInvestments = Objects.requireNonNull(otherInvestments);
		return this;
	}

	public SecurityIdentificationAndAmount1 getOutrightInvestment() {
		return outrightInvestment;
	}

	public Investment1Choice setOutrightInvestment(SecurityIdentificationAndAmount1 outrightInvestment) {
		this.outrightInvestment = Objects.requireNonNull(outrightInvestment);
		return this;
	}
}