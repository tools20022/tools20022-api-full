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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection6;
import com.tools20022.repository.msg.GenericIdentification165;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Outcome of the application of a hypothetical scenario on the valuation of a
 * portfolio of financial instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1#mmPortfolioIdentification
 * PortfolioStressTestResult1.mmPortfolioIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1#mmStressLoss
 * PortfolioStressTestResult1.mmStressLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1#mmCover1Flag
 * PortfolioStressTestResult1.mmCover1Flag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1#mmCover2Flag
 * PortfolioStressTestResult1.mmCover2Flag}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PortfolioStressTestResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Outcome of the application of a hypothetical scenario on the valuation of a portfolio of financial instruments."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PortfolioStressTestResult1", propOrder = {"portfolioIdentification", "stressLoss", "cover1Flag", "cover2Flag"})
public class PortfolioStressTestResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrtflId", required = true)
	protected GenericIdentification165 portfolioIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1
	 * PortfolioStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtflId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the portfolio."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PortfolioStressTestResult1, GenericIdentification165> mmPortfolioIdentification = new MMMessageAssociationEnd<PortfolioStressTestResult1, GenericIdentification165>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PortfolioStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "PrtflId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioIdentification";
			definition = "Identification of the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification165.mmObject();
		}

		@Override
		public GenericIdentification165 getValue(PortfolioStressTestResult1 obj) {
			return obj.getPortfolioIdentification();
		}

		@Override
		public void setValue(PortfolioStressTestResult1 obj, GenericIdentification165 value) {
			obj.setPortfolioIdentification(value);
		}
	};
	@XmlElement(name = "StrssLoss", required = true)
	protected AmountAndDirection6 stressLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1
	 * PortfolioStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrssLoss"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StressLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculated stress loss over the initial margin requirement, as used in the calculation of stress testing losses to size the default fund. Indicates whether the portfolio experienced a stress loss greater than initial margin."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PortfolioStressTestResult1, AmountAndDirection6> mmStressLoss = new MMMessageAssociationEnd<PortfolioStressTestResult1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PortfolioStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "StrssLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StressLoss";
			definition = "Calculated stress loss over the initial margin requirement, as used in the calculation of stress testing losses to size the default fund. Indicates whether the portfolio experienced a stress loss greater than initial margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(PortfolioStressTestResult1 obj) {
			return obj.getStressLoss();
		}

		@Override
		public void setValue(PortfolioStressTestResult1 obj, AmountAndDirection6 value) {
			obj.setStressLoss(value);
		}
	};
	@XmlElement(name = "Cover1Flg", required = true)
	protected YesNoIndicator cover1Flag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1
	 * PortfolioStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cover1Flg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cover1Flag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the stress loss over initial margin under this scenario for the clearing member of which the corresponding account is an account, is the largest stress over initial margin used to size the default fund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PortfolioStressTestResult1, YesNoIndicator> mmCover1Flag = new MMMessageAttribute<PortfolioStressTestResult1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PortfolioStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "Cover1Flg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cover1Flag";
			definition = "Indicates whether the stress loss over initial margin under this scenario for the clearing member of which the corresponding account is an account, is the largest stress over initial margin used to size the default fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PortfolioStressTestResult1 obj) {
			return obj.getCover1Flag();
		}

		@Override
		public void setValue(PortfolioStressTestResult1 obj, YesNoIndicator value) {
			obj.setCover1Flag(value);
		}
	};
	@XmlElement(name = "Cover2Flg", required = true)
	protected YesNoIndicator cover2Flag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1
	 * PortfolioStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cover2Flg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cover2Flag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the stress loss over initial margin under this scenario for the clearing member of which the corresponding account is an account, is the second largest stress over initial margin used to size the default fund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PortfolioStressTestResult1, YesNoIndicator> mmCover2Flag = new MMMessageAttribute<PortfolioStressTestResult1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PortfolioStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "Cover2Flg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cover2Flag";
			definition = "Indicates whether the stress loss over initial margin under this scenario for the clearing member of which the corresponding account is an account, is the second largest stress over initial margin used to size the default fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PortfolioStressTestResult1 obj) {
			return obj.getCover2Flag();
		}

		@Override
		public void setValue(PortfolioStressTestResult1 obj, YesNoIndicator value) {
			obj.setCover2Flag(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PortfolioStressTestResult1.mmPortfolioIdentification, com.tools20022.repository.msg.PortfolioStressTestResult1.mmStressLoss,
						com.tools20022.repository.msg.PortfolioStressTestResult1.mmCover1Flag, com.tools20022.repository.msg.PortfolioStressTestResult1.mmCover2Flag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PortfolioStressTestResult1";
				definition = "Outcome of the application of a hypothetical scenario on the valuation of a portfolio of financial instruments.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification165 getPortfolioIdentification() {
		return portfolioIdentification;
	}

	public PortfolioStressTestResult1 setPortfolioIdentification(GenericIdentification165 portfolioIdentification) {
		this.portfolioIdentification = Objects.requireNonNull(portfolioIdentification);
		return this;
	}

	public AmountAndDirection6 getStressLoss() {
		return stressLoss;
	}

	public PortfolioStressTestResult1 setStressLoss(AmountAndDirection6 stressLoss) {
		this.stressLoss = Objects.requireNonNull(stressLoss);
		return this;
	}

	public YesNoIndicator getCover1Flag() {
		return cover1Flag;
	}

	public PortfolioStressTestResult1 setCover1Flag(YesNoIndicator cover1Flag) {
		this.cover1Flag = Objects.requireNonNull(cover1Flag);
		return this;
	}

	public YesNoIndicator getCover2Flag() {
		return cover2Flag;
	}

	public PortfolioStressTestResult1 setCover2Flag(YesNoIndicator cover2Flag) {
		this.cover2Flag = Objects.requireNonNull(cover2Flag);
		return this;
	}
}