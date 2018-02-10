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
import com.tools20022.repository.codeset.SecuritiesEntryTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities entry on an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Blocked
 * SecuritiesEntryTypeCode.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Borrowed
 * SecuritiesEntryTypeCode.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#CollateralIn
 * SecuritiesEntryTypeCode.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#CollateralOut
 * SecuritiesEntryTypeCode.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#OnLoan
 * SecuritiesEntryTypeCode.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#PendingDelivery
 * SecuritiesEntryTypeCode.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#PendingReceipt
 * SecuritiesEntryTypeCode.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Pledged
 * SecuritiesEntryTypeCode.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#OutForRegistration
 * SecuritiesEntryTypeCode.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Unclassified
 * SecuritiesEntryTypeCode.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#InTransshipment
 * SecuritiesEntryTypeCode.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Eligible
 * SecuritiesEntryTypeCode.Eligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Registered
 * SecuritiesEntryTypeCode.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#StreetPosition
 * SecuritiesEntryTypeCode.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Unregistered
 * SecuritiesEntryTypeCode.Unregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#WaitingDocumentation
 * SecuritiesEntryTypeCode.WaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#SettlementPosition
 * SecuritiesEntryTypeCode.SettlementPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#BeingTransferred
 * SecuritiesEntryTypeCode.BeingTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Settled
 * SecuritiesEntryTypeCode.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#Traded
 * SecuritiesEntryTypeCode.Traded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#UninstructedBalance
 * SecuritiesEntryTypeCode.UninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode#InstructedBalance
 * SecuritiesEntryTypeCode.InstructedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
 * SecuritiesEntryType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
 * SecuritiesEntryType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BLOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesEntryTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of securities entry on an account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesEntryTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance of securities that are blocked or frozen. A financial instrument
	 * may be unavailable due to external circumstances such as a court order,
	 * death of beneficiary or account owner, or bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BLOK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are blocked or frozen. A financial instrument may be unavailable due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Blocked = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Balance of securities that are blocked or frozen. A financial instrument may be unavailable due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "BLOK";
		}
	};
	/**
	 * Balance of securities that have been borrowed from another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BORR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that have been borrowed from another party."</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Borrowed = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			definition = "Balance of securities that have been borrowed from another party.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode CollateralIn = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Balance of securities that belong to the safekeeping account indicated
	 * within this message, and are deposited with a third party for the purpose
	 * of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode CollateralOut = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Balance of securities that have been loaned to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::LOAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that have been loaned to a third party."</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode OnLoan = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			definition = "Balance of securities that have been loaned to a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Balance of securities that are pending delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of securities that are pending delivery."</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode PendingDelivery = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			definition = "Balance of securities that are pending delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Balance of securities that are pending receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PENR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of securities that are pending receipt."</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode PendingReceipt = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			definition = "Balance of securities that are pending receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Balance of securities that are pledged, for example, a financial
	 * instrument is unavailable because it has been used or given as a
	 * guarantee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PLED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are pledged, for example, a financial instrument is unavailable because it has been used or given as a guarantee."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Pledged = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PLED"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Balance of securities that are pledged, for example, a financial instrument is unavailable because it has been used or given as a guarantee.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "PLED";
		}
	};
	/**
	 * Balance of securities currently being processed by the institution
	 * responsible for registering the new beneficial owner (or nominee) of
	 * securities after a transaction has settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::REGO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities currently being processed by the institution responsible for registering the new beneficial owner (or nominee) of securities after a transaction has settled."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode OutForRegistration = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::REGO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			definition = "Balance of securities currently being processed by the institution responsible for registering the new beneficial owner (or nominee) of securities after a transaction has settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "REGO";
		}
	};
	/**
	 * Balance of securities that is unclassified, ie, is not identified with
	 * one of the existing sub-balance types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::OTHR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that is unclassified, ie, is  not identified with one of the existing sub-balance types."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Unclassified = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::OTHR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			definition = "Balance of securities that is unclassified, ie, is  not identified with one of the existing sub-balance types.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Balance of physical securities that are in transshipment, eg, in the
	 * process of being transferred from one depository or agent to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of physical securities that are in transshipment, eg, in the process of being transferred from one depository or agent to another."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode InTransshipment = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			definition = "Balance of physical securities that are in transshipment, eg, in the process of being transferred from one depository or agent to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Total number of securities eligible for this event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of securities eligible for this event."</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Eligible = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Eligible";
			definition = "Total number of securities eligible for this event.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Balance of securities that are registered (in the name of a nominee or of
	 * the beneficial owner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::NOMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are registered (in the name of a nominee or of the beneficial owner)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Registered = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::NOMI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			definition = "Balance of securities that are registered (in the name of a nominee or of the beneficial owner).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Balance of securities that remain registered in the name of the prior
	 * beneficial owner of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SPOS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that remain registered in the name of the prior beneficial owner of securities."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode StreetPosition = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SPOS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			definition = "Balance of securities that remain registered in the name of the prior beneficial owner of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "SPOS";
		}
	};
	/**
	 * Balance of securities that could not be registered due to foreign
	 * ownership limitation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNRG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unregistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that could not be registered due to foreign ownership limitation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Unregistered = new SecuritiesEntryTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNRG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			definition = "Balance of securities that could not be registered due to foreign ownership limitation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "UNRG";
		}
	};
	/**
	 * Financial instrument is unavailable due to missing or incomplete
	 * documentation pertaining to the account, or due to a missing or
	 * incomplete order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode WaitingDocumentation = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			definition = "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "WDOC";
		}
	};
	/**
	 * Balance of securities representing only settled transactions; pending
	 * transactions not included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities representing only settled transactions; pending transactions not included."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode SettlementPosition = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPosition";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Financial instrument is unavailable as a result of a transfer order,
	 * pending movement in the shareholders' register.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode BeingTransferred = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			definition = "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "BTRA";
		}
	};
	/**
	 * Balance of securities representing only settled transactions
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities representing only settled transactions"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Settled = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Balance of securities representing only settled transactions";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "SETD";
		}
	};
	/**
	 * Balance of securities representing traded transactions
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of securities representing traded transactions"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode Traded = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traded";
			definition = "Balance of securities representing traded transactions";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode UninstructedBalance = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "UNBA";
		}
	};
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
	 * SecuritiesEntryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * </ul>
	 */
	public static final SecuritiesEntryTypeCode InstructedBalance = new SecuritiesEntryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryTypeCode.mmObject();
			codeName = "INBA";
		}
	};
	final static private LinkedHashMap<String, SecuritiesEntryTypeCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesEntryTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesEntryTypeCode";
				definition = "Specifies the type of securities entry on an account.";
				derivation_lazy = () -> Arrays.asList(SecuritiesEntryType1Code.mmObject(), SecuritiesEntryType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Blocked, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Borrowed,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.CollateralIn, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.CollateralOut, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.OnLoan,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.PendingDelivery, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.PendingReceipt, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Pledged,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.OutForRegistration, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Unclassified,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.InTransshipment, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Eligible, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Registered,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.StreetPosition, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Unregistered,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.WaitingDocumentation, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.SettlementPosition,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.BeingTransferred, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Settled, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.Traded,
						com.tools20022.repository.codeset.SecuritiesEntryTypeCode.UninstructedBalance, com.tools20022.repository.codeset.SecuritiesEntryTypeCode.InstructedBalance);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(PendingDelivery.getCodeName().get(), PendingDelivery);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(InTransshipment.getCodeName().get(), InTransshipment);
		codesByName.put(Eligible.getCodeName().get(), Eligible);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(StreetPosition.getCodeName().get(), StreetPosition);
		codesByName.put(Unregistered.getCodeName().get(), Unregistered);
		codesByName.put(WaitingDocumentation.getCodeName().get(), WaitingDocumentation);
		codesByName.put(SettlementPosition.getCodeName().get(), SettlementPosition);
		codesByName.put(BeingTransferred.getCodeName().get(), BeingTransferred);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Traded.getCodeName().get(), Traded);
		codesByName.put(UninstructedBalance.getCodeName().get(), UninstructedBalance);
		codesByName.put(InstructedBalance.getCodeName().get(), InstructedBalance);
	}

	public static SecuritiesEntryTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesEntryTypeCode[] values() {
		SecuritiesEntryTypeCode[] values = new SecuritiesEntryTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesEntryTypeCode> {
		@Override
		public SecuritiesEntryTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesEntryTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}