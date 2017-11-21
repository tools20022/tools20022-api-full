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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.Modification1Code;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details an individuation of the classification type of the financial
 * instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2#mmIdentifier
 * SecuritiesInstrumentClassification2.mmIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2#mmModification
 * SecuritiesInstrumentClassification2.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2#mmValidityPeriod
 * SecuritiesInstrumentClassification2.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2#mmLastUpdated
 * SecuritiesInstrumentClassification2.mmLastUpdated}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01#mmInstrumentClassification
 * FinancialInstrumentReportingInstrumentClassificationReportV01.
 * mmInstrumentClassification}</li>
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
 * "SecuritiesInstrumentClassification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details an individuation of the classification type of the financial instrument."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesInstrumentClassification2", propOrder = {"identifier", "modification", "validityPeriod", "lastUpdated"})
public class SecuritiesInstrumentClassification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CFIOct2015Identifier identifier;
	/**
	 * Identifier of the financial instrument classification type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIOct2015Identifier
	 * CFIOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2
	 * SecuritiesInstrumentClassification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Idr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the financial instrument classification type code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesInstrumentClassification2.mmObject();
			isDerived = false;
			xmlTag = "Idr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identifier";
			definition = "Identifier of the financial instrument classification type code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}
	};
	protected Modification1Code modification;
	/**
	 * Modification status for the record compared to the previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Modification1Code
	 * Modification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2
	 * SecuritiesInstrumentClassification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification status for the record compared to the previous report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesInstrumentClassification2.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Modification status for the record compared to the previous report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Modification1Code.mmObject();
		}
	};
	protected Period4Choice validityPeriod;
	/**
	 * Details the validity of the specific record.<br>
	 * <br>
	 * Usage:<br>
	 * Within MiFIR, the FromDate is populated while the instrument is valid.
	 * From Date To Date is only populated when the record is being invalidated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period4Choice
	 * Period4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2
	 * SecuritiesInstrumentClassification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details the validity of the specific record.\r\n\r\nUsage:\r\nWithin MiFIR, the FromDate is populated while the instrument is valid.  From Date To Date is only populated when the record is being invalidated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidityPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesInstrumentClassification2.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Details the validity of the specific record.\r\n\r\nUsage:\r\nWithin MiFIR, the FromDate is populated while the instrument is valid.  From Date To Date is only populated when the record is being invalidated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}
	};
	protected ISODate lastUpdated;
	/**
	 * Date when this record was last modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2
	 * SecuritiesInstrumentClassification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastUpdtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastUpdated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when this record was last modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastUpdated = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesInstrumentClassification2.mmObject();
			isDerived = false;
			xmlTag = "LastUpdtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastUpdated";
			definition = "Date when this record was last modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesInstrumentClassification2.mmIdentifier, SecuritiesInstrumentClassification2.mmModification, SecuritiesInstrumentClassification2.mmValidityPeriod,
						SecuritiesInstrumentClassification2.mmLastUpdated);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingInstrumentClassificationReportV01.mmInstrumentClassification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesInstrumentClassification2";
				definition = "Details an individuation of the classification type of the financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Idr", required = true)
	public CFIOct2015Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(CFIOct2015Identifier identifier) {
		this.identifier = identifier;
	}

	@XmlElement(name = "Mod")
	public Modification1Code getModification() {
		return modification;
	}

	public void setModification(Modification1Code modification) {
		this.modification = modification;
	}

	@XmlElement(name = "VldtyPrd", required = true)
	public Period4Choice getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(Period4Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	@XmlElement(name = "LastUpdtd")
	public ISODate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(ISODate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}