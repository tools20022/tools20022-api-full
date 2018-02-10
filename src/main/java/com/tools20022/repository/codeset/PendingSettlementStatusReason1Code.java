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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a transfer or settlement instruction settlement
 * pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#AwaitingSharesFromCounterparty
 * PendingSettlementStatusReason1Code.AwaitingSharesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#AccountBlocked
 * PendingSettlementStatusReason1Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#AwaitingSecurities
 * PendingSettlementStatusReason1Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#CounterpartyInsufficientSecurities
 * PendingSettlementStatusReason1Code.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingSettlementStatusReason1Code.
 * AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#AwaitingDocumentsOrEndorsementsFromYou
 * PendingSettlementStatusReason1Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#StatusReasonInvestigation
 * PendingSettlementStatusReason1Code.StatusReasonInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#LackOfSecurities
 * PendingSettlementStatusReason1Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#PendingLinkedInstruction
 * PendingSettlementStatusReason1Code.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#Other
 * PendingSettlementStatusReason1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#PhysicalSecuritiesVerification
 * PendingSettlementStatusReason1Code.PhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#PhysicalDeliveryDelay
 * PendingSettlementStatusReason1Code.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#SecuritiesBlocked
 * PendingSettlementStatusReason1Code.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code#MissingInformation
 * PendingSettlementStatusReason1Code.MissingInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
 * PendingSettlementStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AWSH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingSettlementStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transfer or settlement instruction settlement pending status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingSettlementStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSharesFromCounterparty"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code AwaitingSharesFromCounterparty = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSharesFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingSharesFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code AccountBlocked = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AccountBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code AwaitingSecurities = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code CounterpartyInsufficientSecurities = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.CounterpartyInsufficientSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code AwaitingDocumentsOrEndorsementsFromCounterparty = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code AwaitingDocumentsOrEndorsementsFromYou = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInvestigation"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code StatusReasonInvestigation = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.StatusReasonInvestigation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code LackOfSecurities = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code PendingLinkedInstruction = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PendingLinkedInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code Other = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesVerification"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code PhysicalSecuritiesVerification = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PhysicalSecuritiesVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code PhysicalDeliveryDelay = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PhysicalDeliveryDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code SecuritiesBlocked = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.SecuritiesBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason1Code
	 * PendingSettlementStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformation"</li>
	 * </ul>
	 */
	public static final PendingSettlementStatusReason1Code MissingInformation = new PendingSettlementStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.MissingInformation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingSettlementStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected PendingSettlementStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWSH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingSettlementStatusReason1Code";
				definition = "Specifies the reason for a transfer or settlement instruction settlement pending status.";
				trace_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.AwaitingSharesFromCounterparty, com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.AccountBlocked,
						com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.AwaitingSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.CounterpartyInsufficientSecurities,
						com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.AwaitingDocumentsOrEndorsementsFromCounterparty,
						com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.StatusReasonInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.LackOfSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.PendingLinkedInstruction,
						com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.Other, com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.PhysicalSecuritiesVerification,
						com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.PhysicalDeliveryDelay, com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.SecuritiesBlocked,
						com.tools20022.repository.codeset.PendingSettlementStatusReason1Code.MissingInformation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingSharesFromCounterparty.getCodeName().get(), AwaitingSharesFromCounterparty);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(CounterpartyInsufficientSecurities.getCodeName().get(), CounterpartyInsufficientSecurities);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromCounterparty);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(StatusReasonInvestigation.getCodeName().get(), StatusReasonInvestigation);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(PendingLinkedInstruction.getCodeName().get(), PendingLinkedInstruction);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PhysicalSecuritiesVerification.getCodeName().get(), PhysicalSecuritiesVerification);
		codesByName.put(PhysicalDeliveryDelay.getCodeName().get(), PhysicalDeliveryDelay);
		codesByName.put(SecuritiesBlocked.getCodeName().get(), SecuritiesBlocked);
		codesByName.put(MissingInformation.getCodeName().get(), MissingInformation);
	}

	public static PendingSettlementStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingSettlementStatusReason1Code[] values() {
		PendingSettlementStatusReason1Code[] values = new PendingSettlementStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingSettlementStatusReason1Code> {
		@Override
		public PendingSettlementStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingSettlementStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}