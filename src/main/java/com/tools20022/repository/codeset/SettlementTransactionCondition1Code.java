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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SettlementTransactionCondition1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Partial settlement is allowed but must satisfy a minimum quantity of
 * securities (quantity defined in static data).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#Exercised
 * SettlementTransactionCondition1Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#FungibilityCode
 * SettlementTransactionCondition1Code.FungibilityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#FreeClean
 * SettlementTransactionCondition1Code.FreeClean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#KnockedOut
 * SettlementTransactionCondition1Code.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#PhysicallySettled
 * SettlementTransactionCondition1Code.PhysicallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#ShortSaleIndicator
 * SettlementTransactionCondition1Code.ShortSaleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#SpecialDelivery
 * SettlementTransactionCondition1Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#Split
 * SettlementTransactionCondition1Code.Split}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#SplitCurrency
 * SettlementTransactionCondition1Code.SplitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#Unexposed
 * SettlementTransactionCondition1Code.Unexposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#Dirty
 * SettlementTransactionCondition1Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#Drawn
 * SettlementTransactionCondition1Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#Clean
 * SettlementTransactionCondition1Code.Clean}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::STCO</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionCondition1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Partial settlement is allowed but must satisfy a minimum quantity of securities (quantity defined in static data)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//EXER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that are exercised."
	 * </li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code Exercised = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//EXER"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Exercised";
			definition = "Settlement transaction relates to options, futures or derivatives that are exercised.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Fungible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FungibilityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fungible."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code FungibilityCode = new SettlementTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "FungibilityCode";
			definition = "Fungible.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "FUNG";
		}
	};
	/**
	 * Delivery will be made free of payment but a clean payment order will be
	 * sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//FRCL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeClean"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery will be made free of payment but a clean payment order will be sent."
	 * </li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code FreeClean = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//FRCL"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "FreeClean";
			definition = "Delivery will be made free of payment but a clean payment order will be sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "FRCL";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are expired worthless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KNOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//KNOC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that are expired worthless."
	 * </li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code KnockedOut = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//KNOC"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "KnockedOut";
			definition = "Settlement transaction relates to options, futures or derivatives that are expired worthless.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "KNOC";
		}
	};
	/**
	 * Securities are to be physically settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//PHYS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities are to be physically settled."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code PhysicallySettled = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//PHYS"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "PhysicallySettled";
			definition = "Securities are to be physically settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Account is used for short sale orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//SHOR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSaleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used for short sale orders."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code ShortSaleIndicator = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//SHOR"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ShortSaleIndicator";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "SHOR";
		}
	};
	/**
	 * Settlement transactions to be settled with special delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//SPDL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transactions to be settled with special delivery."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code SpecialDelivery = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//SPDL"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SpecialDelivery";
			definition = "Settlement transactions to be settled with special delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Money and financial instruments settle in different locations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//SPST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money and financial instruments settle in different locations."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code Split = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//SPST"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Split";
			definition = "Money and financial instruments settle in different locations.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "SPST";
		}
	};
	/**
	 * Settlement is in two different currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//SPCS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is in two different currencies."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code SplitCurrency = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//SPCS"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SplitCurrency";
			definition = "Settlement is in two different currencies.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "SPCS";
		}
	};
	/**
	 * Delivery cannot be performed until money is received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//UNEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery cannot be performed until money is received."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code Unexposed = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//UNEX"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Unexposed";
			definition = "Delivery cannot be performed until money is received.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "UNEX";
		}
	};
	/**
	 * Taxable financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//DIRT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxable financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code Dirty = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//DIRT"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Dirty";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Settlement transactions relates to drawn securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//DRAW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transactions relates to drawn securities."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code Drawn = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//DRAW"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Tax-exempt financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code
	 * SettlementTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//CLEN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax-exempt financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition1Code Clean = new SettlementTransactionCondition1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//CLEN"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Clean";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmObject();
			codeName = "CLEA";
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition1Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO"));
				example = Arrays.asList("EXER");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "SettlementTransactionCondition1Code";
				definition = "Partial settlement is allowed but must satisfy a minimum quantity of securities (quantity defined in static data).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition1Code.Exercised, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.FungibilityCode,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.FreeClean, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.KnockedOut,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.PhysicallySettled, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.ShortSaleIndicator,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.Split,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.SplitCurrency, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.Unexposed,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.Dirty, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.Drawn,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.Clean);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(FungibilityCode.getCodeName().get(), FungibilityCode);
		codesByName.put(FreeClean.getCodeName().get(), FreeClean);
		codesByName.put(KnockedOut.getCodeName().get(), KnockedOut);
		codesByName.put(PhysicallySettled.getCodeName().get(), PhysicallySettled);
		codesByName.put(ShortSaleIndicator.getCodeName().get(), ShortSaleIndicator);
		codesByName.put(SpecialDelivery.getCodeName().get(), SpecialDelivery);
		codesByName.put(Split.getCodeName().get(), Split);
		codesByName.put(SplitCurrency.getCodeName().get(), SplitCurrency);
		codesByName.put(Unexposed.getCodeName().get(), Unexposed);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(Clean.getCodeName().get(), Clean);
	}

	public static SettlementTransactionCondition1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition1Code[] values() {
		SettlementTransactionCondition1Code[] values = new SettlementTransactionCondition1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition1Code> {
		@Override
		public SettlementTransactionCondition1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}