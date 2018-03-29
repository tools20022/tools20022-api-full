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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01;
import com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01;
import com.tools20022.repository.codeset.StandingInstructionGrossNet1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.AgentCorporateActionStandingInstruction;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount17;
import com.tools20022.repository.msg.SecuritiesAccount6;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the standing instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#NetOrGrossOrCashDistributionDetailsOrSecuritiesDistributionDetailsRule
 * CorporateActionStandingInstruction1.
 * NetOrGrossOrCashDistributionDetailsOrSecuritiesDistributionDetailsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmNetOrGross
 * CorporateActionStandingInstruction1.mmNetOrGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmCashDistributionDetails
 * CorporateActionStandingInstruction1.mmCashDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmSecuritiesDistributionDetails
 * CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmAdditionalInformation
 * CorporateActionStandingInstruction1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
 * AgentCorporateActionStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmStandingInstructionDetails
 * AgentCAStandingInstructionRequestV01.mmStandingInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmStandingInstructionDetails
 * AgentCAStandingInstructionCancellationRequestV01.mmStandingInstructionDetails
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionStandingInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the standing instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionStandingInstruction1", propOrder = {"netOrGross", "cashDistributionDetails", "securitiesDistributionDetails", "additionalInformation"})
public class CorporateActionStandingInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NetOrGrss", required = true)
	protected StandingInstructionGrossNet1Code netOrGross;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionGrossNet1Code
	 * StandingInstructionGrossNet1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmGrossOrNetIndicator
	 * AgentCorporateActionStandingInstruction.mmGrossOrNetIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1
	 * CorporateActionStandingInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetOrGrss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetOrGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the account Holders want their income to be paid net or gross of income tax (default is gross)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionStandingInstruction1, StandingInstructionGrossNet1Code> mmNetOrGross = new MMMessageAttribute<CorporateActionStandingInstruction1, StandingInstructionGrossNet1Code>() {
		{
			businessElementTrace_lazy = () -> AgentCorporateActionStandingInstruction.mmGrossOrNetIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmObject();
			isDerived = false;
			xmlTag = "NetOrGrss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOrGross";
			definition = "Identifies whether the account Holders want their income to be paid net or gross of income tax (default is gross).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingInstructionGrossNet1Code.mmObject();
		}

		@Override
		public StandingInstructionGrossNet1Code getValue(CorporateActionStandingInstruction1 obj) {
			return obj.getNetOrGross();
		}

		@Override
		public void setValue(CorporateActionStandingInstruction1 obj, StandingInstructionGrossNet1Code value) {
			obj.setNetOrGross(value);
		}
	};
	@XmlElement(name = "CshDstrbtnDtls", required = true)
	protected CashAccount17 cashDistributionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount17
	 * CashAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1
	 * CorporateActionStandingInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshDstrbtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the cash distribution standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionStandingInstruction1, CashAccount17> mmCashDistributionDetails = new MMMessageAssociationEnd<CorporateActionStandingInstruction1, CashAccount17>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmObject();
			isDerived = false;
			xmlTag = "CshDstrbtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionDetails";
			definition = "Provides information about the cash distribution standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount17.mmObject();
		}

		@Override
		public CashAccount17 getValue(CorporateActionStandingInstruction1 obj) {
			return obj.getCashDistributionDetails();
		}

		@Override
		public void setValue(CorporateActionStandingInstruction1 obj, CashAccount17 value) {
			obj.setCashDistributionDetails(value);
		}
	};
	@XmlElement(name = "SctiesDstrbtnDtls", required = true)
	protected SecuritiesAccount6 securitiesDistributionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount6
	 * SecuritiesAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1
	 * CorporateActionStandingInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesDstrbtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDistributionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the securities distribution standing instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionStandingInstruction1, SecuritiesAccount6> mmSecuritiesDistributionDetails = new MMMessageAssociationEnd<CorporateActionStandingInstruction1, SecuritiesAccount6>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmObject();
			isDerived = false;
			xmlTag = "SctiesDstrbtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesDistributionDetails";
			definition = "Provides information about the securities distribution standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount6.mmObject();
		}

		@Override
		public SecuritiesAccount6 getValue(CorporateActionStandingInstruction1 obj) {
			return obj.getSecuritiesDistributionDetails();
		}

		@Override
		public void setValue(CorporateActionStandingInstruction1 obj, SecuritiesAccount6 value) {
			obj.setSecuritiesDistributionDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max350Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1
	 * CorporateActionStandingInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionStandingInstruction1, Optional<Max350Text>> mmAdditionalInformation = new MMMessageAttribute<CorporateActionStandingInstruction1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the standing instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionStandingInstruction1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionStandingInstruction1 obj, Optional<Max350Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	/**
	 * Either NetOrGross, CashDistributionDetails or
	 * SecuritiesDistributionDetails must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1
	 * CorporateActionStandingInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmNetOrGross
	 * CorporateActionStandingInstruction1.mmNetOrGross}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmCashDistributionDetails
	 * CorporateActionStandingInstruction1.mmCashDistributionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmSecuritiesDistributionDetails
	 * CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "NetOrGrossOrCashDistributionDetailsOrSecuritiesDistributionDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either NetOrGross, CashDistributionDetails or SecuritiesDistributionDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor NetOrGrossOrCashDistributionDetailsOrSecuritiesDistributionDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOrGrossOrCashDistributionDetailsOrSecuritiesDistributionDetailsRule";
			definition = "Either NetOrGross, CashDistributionDetails or SecuritiesDistributionDetails must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmNetOrGross, com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmCashDistributionDetails,
					com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmNetOrGross, com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmCashDistributionDetails,
						com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails, com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAStandingInstructionRequestV01.mmStandingInstructionDetails, AgentCAStandingInstructionCancellationRequestV01.mmStandingInstructionDetails);
				trace_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionStandingInstruction1";
				definition = "Provides information about the standing instruction.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionStandingInstruction1.NetOrGrossOrCashDistributionDetailsOrSecuritiesDistributionDetailsRule);
			}
		});
		return mmObject_lazy.get();
	}

	public StandingInstructionGrossNet1Code getNetOrGross() {
		return netOrGross;
	}

	public CorporateActionStandingInstruction1 setNetOrGross(StandingInstructionGrossNet1Code netOrGross) {
		this.netOrGross = Objects.requireNonNull(netOrGross);
		return this;
	}

	public CashAccount17 getCashDistributionDetails() {
		return cashDistributionDetails;
	}

	public CorporateActionStandingInstruction1 setCashDistributionDetails(CashAccount17 cashDistributionDetails) {
		this.cashDistributionDetails = Objects.requireNonNull(cashDistributionDetails);
		return this;
	}

	public SecuritiesAccount6 getSecuritiesDistributionDetails() {
		return securitiesDistributionDetails;
	}

	public CorporateActionStandingInstruction1 setSecuritiesDistributionDetails(SecuritiesAccount6 securitiesDistributionDetails) {
		this.securitiesDistributionDetails = Objects.requireNonNull(securitiesDistributionDetails);
		return this;
	}

	public Optional<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionStandingInstruction1 setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}