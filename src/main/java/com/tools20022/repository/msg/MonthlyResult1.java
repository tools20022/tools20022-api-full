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
import com.tools20022.repository.area.auth.CCPBackTestingResultReportV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.NonNegativeNumber;
import com.tools20022.repository.datatype.PositiveNumber;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification165;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Results of backtesting analysis used to test the performance of a risk model.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MonthlyResult1#mmNumberOfObservations
 * MonthlyResult1.mmNumberOfObservations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MonthlyResult1#mmNumberOfExceptions
 * MonthlyResult1.mmNumberOfExceptions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MonthlyResult1#mmCoverage
 * MonthlyResult1.mmCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MonthlyResult1#mmLargestException
 * MonthlyResult1.mmLargestException}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MonthlyResult1#mmAverageException
 * MonthlyResult1.mmAverageException}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MonthlyResult1#mmLargestExceptionIdentification
 * MonthlyResult1.mmLargestExceptionIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPBackTestingResultReportV01#mmMonthlyResult
 * CCPBackTestingResultReportV01.mmMonthlyResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MonthlyResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Results of backtesting analysis used to test the performance of a risk model."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MonthlyResult1", propOrder = {"numberOfObservations", "numberOfExceptions", "coverage", "largestException", "averageException", "largestExceptionIdentification"})
public class MonthlyResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfObsrvtns", required = true)
	protected PositiveNumber numberOfObservations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PositiveNumber
	 * PositiveNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MonthlyResult1 MonthlyResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfObsrvtns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfObservations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of accounts subject to backtesting in the month.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MonthlyResult1, PositiveNumber> mmNumberOfObservations = new MMMessageAttribute<MonthlyResult1, PositiveNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MonthlyResult1.mmObject();
			isDerived = false;
			xmlTag = "NbOfObsrvtns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfObservations";
			definition = "Total number of accounts subject to backtesting in the month.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PositiveNumber.mmObject();
		}

		@Override
		public PositiveNumber getValue(MonthlyResult1 obj) {
			return obj.getNumberOfObservations();
		}

		@Override
		public void setValue(MonthlyResult1 obj, PositiveNumber value) {
			obj.setNumberOfObservations(value);
		}
	};
	@XmlElement(name = "NbOfXcptns", required = true)
	protected NonNegativeNumber numberOfExceptions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NonNegativeNumber
	 * NonNegativeNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MonthlyResult1 MonthlyResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfXcptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfExceptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of times that margin coverage held against any account fell below the marked‐to‐market exposure of that member account, based on the backtesting results.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MonthlyResult1, NonNegativeNumber> mmNumberOfExceptions = new MMMessageAttribute<MonthlyResult1, NonNegativeNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MonthlyResult1.mmObject();
			isDerived = false;
			xmlTag = "NbOfXcptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfExceptions";
			definition = "Number of times that margin coverage held against any account fell below the marked‐to‐market exposure of that member account, based on the backtesting results.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NonNegativeNumber.mmObject();
		}

		@Override
		public NonNegativeNumber getValue(MonthlyResult1 obj) {
			return obj.getNumberOfExceptions();
		}

		@Override
		public void setValue(MonthlyResult1 obj, NonNegativeNumber value) {
			obj.setNumberOfExceptions(value);
		}
	};
	@XmlElement(name = "Cvrg", required = true)
	protected BaseOneRate coverage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MonthlyResult1 MonthlyResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cvrg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Achieved coverage level."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MonthlyResult1, BaseOneRate> mmCoverage = new MMMessageAttribute<MonthlyResult1, BaseOneRate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MonthlyResult1.mmObject();
			isDerived = false;
			xmlTag = "Cvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coverage";
			definition = "Achieved coverage level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(MonthlyResult1 obj) {
			return obj.getCoverage();
		}

		@Override
		public void setValue(MonthlyResult1 obj, BaseOneRate value) {
			obj.setCoverage(value);
		}
	};
	@XmlElement(name = "LrgstXcptn", required = true)
	protected ActiveCurrencyAndAmount largestException;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MonthlyResult1 MonthlyResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LrgstXcptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LargestException"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Largest marked-to-market exposure on any account that exceeds the margin coverage held against that account. The difference between the size of the exposure and the margin held.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MonthlyResult1, ActiveCurrencyAndAmount> mmLargestException = new MMMessageAttribute<MonthlyResult1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MonthlyResult1.mmObject();
			isDerived = false;
			xmlTag = "LrgstXcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LargestException";
			definition = "Largest marked-to-market exposure on any account that exceeds the margin coverage held against that account. The difference between the size of the exposure and the margin held.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(MonthlyResult1 obj) {
			return obj.getLargestException();
		}

		@Override
		public void setValue(MonthlyResult1 obj, ActiveCurrencyAndAmount value) {
			obj.setLargestException(value);
		}
	};
	@XmlElement(name = "AvrgXcptn", required = true)
	protected ActiveCurrencyAndAmount averageException;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MonthlyResult1 MonthlyResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgXcptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageException"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average marked‐to‐market exposure on accounts that exceeds the margin coverage held against those accounts.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MonthlyResult1, ActiveCurrencyAndAmount> mmAverageException = new MMMessageAttribute<MonthlyResult1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MonthlyResult1.mmObject();
			isDerived = false;
			xmlTag = "AvrgXcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageException";
			definition = "Average marked‐to‐market exposure on accounts that exceeds the margin coverage held against those accounts.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(MonthlyResult1 obj) {
			return obj.getAverageException();
		}

		@Override
		public void setValue(MonthlyResult1 obj, ActiveCurrencyAndAmount value) {
			obj.setAverageException(value);
		}
	};
	@XmlElement(name = "LrgstXcptnId")
	protected GenericIdentification165 largestExceptionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification165
	 * GenericIdentification165}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MonthlyResult1 MonthlyResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LrgstXcptnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LargestExceptionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique internal identifier for the backtested account experiencing the largest exception.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MonthlyResult1, Optional<GenericIdentification165>> mmLargestExceptionIdentification = new MMMessageAssociationEnd<MonthlyResult1, Optional<GenericIdentification165>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MonthlyResult1.mmObject();
			isDerived = false;
			xmlTag = "LrgstXcptnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LargestExceptionIdentification";
			definition = "Unique internal identifier for the backtested account experiencing the largest exception.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification165.mmObject();
		}

		@Override
		public Optional<GenericIdentification165> getValue(MonthlyResult1 obj) {
			return obj.getLargestExceptionIdentification();
		}

		@Override
		public void setValue(MonthlyResult1 obj, Optional<GenericIdentification165> value) {
			obj.setLargestExceptionIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MonthlyResult1.mmNumberOfObservations, com.tools20022.repository.msg.MonthlyResult1.mmNumberOfExceptions,
						com.tools20022.repository.msg.MonthlyResult1.mmCoverage, com.tools20022.repository.msg.MonthlyResult1.mmLargestException, com.tools20022.repository.msg.MonthlyResult1.mmAverageException,
						com.tools20022.repository.msg.MonthlyResult1.mmLargestExceptionIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPBackTestingResultReportV01.mmMonthlyResult);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MonthlyResult1";
				definition = "Results of backtesting analysis used to test the performance of a risk model.";
			}
		});
		return mmObject_lazy.get();
	}

	public PositiveNumber getNumberOfObservations() {
		return numberOfObservations;
	}

	public MonthlyResult1 setNumberOfObservations(PositiveNumber numberOfObservations) {
		this.numberOfObservations = Objects.requireNonNull(numberOfObservations);
		return this;
	}

	public NonNegativeNumber getNumberOfExceptions() {
		return numberOfExceptions;
	}

	public MonthlyResult1 setNumberOfExceptions(NonNegativeNumber numberOfExceptions) {
		this.numberOfExceptions = Objects.requireNonNull(numberOfExceptions);
		return this;
	}

	public BaseOneRate getCoverage() {
		return coverage;
	}

	public MonthlyResult1 setCoverage(BaseOneRate coverage) {
		this.coverage = Objects.requireNonNull(coverage);
		return this;
	}

	public ActiveCurrencyAndAmount getLargestException() {
		return largestException;
	}

	public MonthlyResult1 setLargestException(ActiveCurrencyAndAmount largestException) {
		this.largestException = Objects.requireNonNull(largestException);
		return this;
	}

	public ActiveCurrencyAndAmount getAverageException() {
		return averageException;
	}

	public MonthlyResult1 setAverageException(ActiveCurrencyAndAmount averageException) {
		this.averageException = Objects.requireNonNull(averageException);
		return this;
	}

	public Optional<GenericIdentification165> getLargestExceptionIdentification() {
		return largestExceptionIdentification == null ? Optional.empty() : Optional.of(largestExceptionIdentification);
	}

	public MonthlyResult1 setLargestExceptionIdentification(GenericIdentification165 largestExceptionIdentification) {
		this.largestExceptionIdentification = largestExceptionIdentification;
		return this;
	}
}