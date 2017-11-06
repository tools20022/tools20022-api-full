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

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Partial settlement is allowed but must satisfy a minimum quantity of
 * securities (quantity defined in static data).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmExercised
 * SettlementTransactionCondition1Code.mmExercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmFungibilityCode
 * SettlementTransactionCondition1Code.mmFungibilityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmFreeClean
 * SettlementTransactionCondition1Code.mmFreeClean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmKnockedOut
 * SettlementTransactionCondition1Code.mmKnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmPhysicallySettled
 * SettlementTransactionCondition1Code.mmPhysicallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmShortSaleIndicator
 * SettlementTransactionCondition1Code.mmShortSaleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmSpecialDelivery
 * SettlementTransactionCondition1Code.mmSpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmSplit
 * SettlementTransactionCondition1Code.mmSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmSplitCurrency
 * SettlementTransactionCondition1Code.mmSplitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmUnexposed
 * SettlementTransactionCondition1Code.mmUnexposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmDirty
 * SettlementTransactionCondition1Code.mmDirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmDrawn
 * SettlementTransactionCondition1Code.mmDrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition1Code#mmClean
 * SettlementTransactionCondition1Code.mmClean}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class SettlementTransactionCondition1Code {

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
	public static final MMCode mmExercised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Exercised";
			definition = "Settlement transaction relates to options, futures or derivatives that are exercised.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmFungibilityCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "FungibilityCode";
			definition = "Fungible.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmFreeClean = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "FreeClean";
			definition = "Delivery will be made free of payment but a clean payment order will be sent.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmKnockedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "KnockedOut";
			definition = "Settlement transaction relates to options, futures or derivatives that are expired worthless.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmPhysicallySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "PhysicallySettled";
			definition = "Securities are to be physically settled.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmShortSaleIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ShortSaleIndicator";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmSpecialDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "SpecialDelivery";
			definition = "Settlement transactions to be settled with special delivery.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmSplit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Split";
			definition = "Money and financial instruments settle in different locations.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmSplitCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "SplitCurrency";
			definition = "Settlement is in two different currencies.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmUnexposed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Unexposed";
			definition = "Delivery cannot be performed until money is received.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmDirty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Dirty";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmDrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
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
	public static final MMCode mmClean = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Clean";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> SettlementTransactionCondition1Code.mmObject();
			codeName = "CLEA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("EXER");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "SettlementTransactionCondition1Code";
				definition = "Partial settlement is allowed but must satisfy a minimum quantity of securities (quantity defined in static data).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmExercised, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmFungibilityCode,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmFreeClean, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmKnockedOut,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmPhysicallySettled, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmShortSaleIndicator,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmSpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmSplit,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmSplitCurrency, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmUnexposed,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmDirty, com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmDrawn,
						com.tools20022.repository.codeset.SettlementTransactionCondition1Code.mmClean);
			}
		});
		return mmObject_lazy.get();
	}
}