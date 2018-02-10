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
import com.tools20022.repository.area.seev.MeetingResultDisseminationV02;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.MeetingParticipation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the level of participation to a shareholders meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Participation2#mmTotalNumberOfVotingRights
 * Participation2.mmTotalNumberOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Participation2#mmPercentageOfVotingRights
 * Participation2.mmPercentageOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Participation2#mmTotalNumberOfSecuritiesOutstanding
 * Participation2.mmTotalNumberOfSecuritiesOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Participation2#mmCalculationDate
 * Participation2.mmCalculationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingParticipation
 * MeetingParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmParticipation
 * MeetingResultDisseminationV02.mmParticipation}</li>
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
 * "Participation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the level of participation to a shareholders meeting."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Participation2", propOrder = {"totalNumberOfVotingRights", "percentageOfVotingRights", "totalNumberOfSecuritiesOutstanding", "calculationDate"})
public class Participation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlNbOfVtngRghts")
	protected Number totalNumberOfVotingRights;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfVotingRights
	 * MeetingParticipation.mmTotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Participation2 Participation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfVtngRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of rights admitted to the vote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfVotingRights = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfVotingRights;
			componentContext_lazy = () -> com.tools20022.repository.msg.Participation2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfVtngRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "PctgOfVtngRghts")
	protected PercentageRate percentageOfVotingRights;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Participation2 Participation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfVtngRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of rights participating to the vote versus total voting rights."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageOfVotingRights = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Participation2.mmObject();
			isDerived = false;
			xmlTag = "PctgOfVtngRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfVotingRights";
			definition = "Percentage of rights participating to the vote versus total voting rights.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "TtlNbOfSctiesOutsdng")
	protected CurrencyAndAmount totalNumberOfSecuritiesOutstanding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfSecuritiesOutstanding
	 * MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Participation2 Participation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfSctiesOutsdng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSecuritiesOutstanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities admitted to the vote, expressed as an amount and a currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfSecuritiesOutstanding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding;
			componentContext_lazy = () -> com.tools20022.repository.msg.Participation2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfSctiesOutsdng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ClctnDt")
	protected ISODate calculationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmCalculationDate
	 * MeetingParticipation.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Participation2 Participation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of calculation of the total number of oustanding securities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmCalculationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Participation2.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Date of calculation of the total number of oustanding securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Participation2.mmTotalNumberOfVotingRights, com.tools20022.repository.msg.Participation2.mmPercentageOfVotingRights,
						com.tools20022.repository.msg.Participation2.mmTotalNumberOfSecuritiesOutstanding, com.tools20022.repository.msg.Participation2.mmCalculationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingResultDisseminationV02.mmParticipation);
				trace_lazy = () -> MeetingParticipation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Participation2";
				definition = "Specifies the level of participation to a shareholders meeting.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getTotalNumberOfVotingRights() {
		return totalNumberOfVotingRights == null ? Optional.empty() : Optional.of(totalNumberOfVotingRights);
	}

	public Participation2 setTotalNumberOfVotingRights(Number totalNumberOfVotingRights) {
		this.totalNumberOfVotingRights = totalNumberOfVotingRights;
		return this;
	}

	public Optional<PercentageRate> getPercentageOfVotingRights() {
		return percentageOfVotingRights == null ? Optional.empty() : Optional.of(percentageOfVotingRights);
	}

	public Participation2 setPercentageOfVotingRights(PercentageRate percentageOfVotingRights) {
		this.percentageOfVotingRights = percentageOfVotingRights;
		return this;
	}

	public Optional<CurrencyAndAmount> getTotalNumberOfSecuritiesOutstanding() {
		return totalNumberOfSecuritiesOutstanding == null ? Optional.empty() : Optional.of(totalNumberOfSecuritiesOutstanding);
	}

	public Participation2 setTotalNumberOfSecuritiesOutstanding(CurrencyAndAmount totalNumberOfSecuritiesOutstanding) {
		this.totalNumberOfSecuritiesOutstanding = totalNumberOfSecuritiesOutstanding;
		return this;
	}

	public Optional<ISODate> getCalculationDate() {
		return calculationDate == null ? Optional.empty() : Optional.of(calculationDate);
	}

	public Participation2 setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
		return this;
	}
}